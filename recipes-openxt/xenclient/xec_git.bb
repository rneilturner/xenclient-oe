require recipes-devtools/ghc/ghc-xcprog.inc

DESCRIPTION = "xec - dbus call utility"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://../COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"
DEPENDS = "udbus udbus-intro ghc-hsyslog ghc-parsec ghc-text compleat libxchv4v"
RDEPENDS_${PN} += "glibc-gconv-utf-32 ghc-runtime-native"

PV = "0+git${SRCPV}"

SRCREV = "${AUTOREV}"
SRC_URI = "git://${OPENXT_GIT_MIRROR}/manager.git;protocol=${OPENXT_GIT_PROTOCOL};branch=${OPENXT_BRANCH}"

S = "${WORKDIR}/git/xec"

inherit xenclient

do_install() {
    runhaskell Setup.hs copy --destdir=${D}

    install -m 0755 -d ${D}/etc
    install -m 0755 -d ${D}/etc/compleat.d
    install -m 0644 ${S}/xec-vm.usage ${D}/etc/compleat.d/xec-vm.usage
    install -m 0644 ${S}/xec.usage ${D}/etc/compleat.d/xec.usage
}

