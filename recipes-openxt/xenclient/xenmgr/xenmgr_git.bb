DESCRIPTION = "XenClient xenmgr"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://../COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"
DEPENDS = " \
    xen \
    xen-libxl \
    libxenmgr-core \
    libxchutils \
    libxchv4v \
    libxchxenstore \
    libxchdb \
    libxch-rpc \
    hkg-json \
    hkg-hsyslog \
    hkg-regex-posix \
    hkg-network \
    hkg-attoparsec \
    hkg-zlib \
    hkg-parsec \
    hkg-deepseq \
    hkg-text \
    hkg-mtl \
    xenmgr-data \
"
RDEPENDS_${PN} += " \
    glibc-gconv-utf-32 \
    xenclient-eula \
    xenclient-caps \
    heimdallr \
    bash \
"

PV = "0+git${SRCPV}"

SRCREV = "${AUTOREV}"
SRC_URI = " \
    git://${OPENXT_GIT_MIRROR}/manager.git;protocol=${OPENXT_GIT_PROTOCOL};branch=${OPENXT_BRANCH} \
    file://xenmgr_dbus.conf \
    file://xenstore-init-extra \
    file://xenmgr.initscript \
"

S = "${WORKDIR}/git/xenmgr"

inherit haskell update-rc.d xc-rpcgen-haskell-1.0

INITSCRIPT_NAME = "xenmgr"
INITSCRIPT_PARAMS = "start 80 5 . stop 01 0 1 6 ."

FILES_${PN} += " \
    ${datadir}/xenmgr-1.0/templates/default/* \
    ${datadir}/xenclient \
    /etc/dbus-1/system.d/xenmgr_dbus.conf \
    /etc/init.d/xenmgr \
"

do_configure_append() {
    # generate rpc stubs
    mkdir -p Rpc/Autogen
    # Server objects
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -s -o Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/xenmgr.xml
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -s -o Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/xenmgr_vm.xml
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -s -o Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/xenmgr_host.xml
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -s -o Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/vm_nic.xml
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -s -o Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/vm_disk.xml

    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -c -o Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/input_daemon.xml
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -c -o Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/surfman.xml
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -c -o Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/guest.xml
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -c -o Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/dbus.xml
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -c -o Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/network_daemon.xml
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -c -o Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/network.xml
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -c -o Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/ctxusb_daemon.xml
}

do_install_append() {
    install -m 0755 ${S}/setup-ica-vm ${D}/usr/bin/setup-ica-vm
    install -m 0755 -d ${D}/etc
    install -m 0755 -d ${D}/etc/dbus-1/system.d
    install -m 0644 ${WORKDIR}/xenmgr_dbus.conf ${D}/etc/dbus-1/system.d/
    install -m 0755 -d ${D}/usr/share/xenclient
    install -m 0755 ${WORKDIR}/xenstore-init-extra ${D}/usr/share/xenclient/
    install -m 0755 -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/xenmgr.initscript ${D}${sysconfdir}/init.d/xenmgr
    install -m 0755 -d ${D}/usr/share/xenmgr-1.0/templates
    install -m 0755 -d ${D}/usr/share/xenmgr-1.0/templates/default
    install -m 0644 ${S}/../templates/default/* ${D}/usr/share/xenmgr-1.0/templates/default/
}

