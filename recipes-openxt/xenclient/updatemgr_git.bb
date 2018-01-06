DESCRIPTION = "XenClient Update Manager"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM="file://../COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"
DEPENDS = " \
    libv4v \
    libxch-rpc \
    libxchxenstore \
    libxchutils \
    xen \
    hkg-hsyslog \
    hkg-network \
    hkg-monadprompt \
    hkg-http \
    hkg-xenstore \
    hkg-parsec \
    hkg-deepseq \
    hkg-text \
    hkg-mtl \
    hkg-json \
    hkg-regex-posix \
    hkg-hinotify \
    hkg-lifted-base \
    hkg-monad-control \
    hkg-transformers-base \
    hkg-monad-loops \
"
RDEPENDS_${PN} += "glibc-gconv-utf-32"

PV = "0+git${SRCPV}"
SRCREV = "${AUTOREV}"
SRC_URI = " \
    git://${OPENXT_GIT_MIRROR}/manager.git;protocol=${OPENXT_GIT_PROTOCOL};branch=${OPENXT_BRANCH} \
    file://updatemgr.initscript \
"

S = "${WORKDIR}/git/updatemgr"

inherit update-rc.d haskell xc-rpcgen-haskell-1.0

INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME_${PN} = "updatemgr"
INITSCRIPT_PARAMS_${PN} = "start 80 5 . stop 01 0 1 6 ."

do_configure_append() {
	# generate rpc stubs
	mkdir -p ${S}/Rpc/Autogen
	# Server objects
	xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -s -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/updatemgr.xml
	# Client objects
	xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -c -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/db.xml
	xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -c -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/xenmgr.xml
	xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -c -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/xenmgr_vm.xml
	xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -c -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/xenmgr_host.xml
}

do_install_append() {
	install -m 0755 -d ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/updatemgr.initscript ${D}${sysconfdir}/init.d/updatemgr
}

