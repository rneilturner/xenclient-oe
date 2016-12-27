BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "c9fedfc2e292c869b7139a592922d56a"
SRC_URI[sha256sum] = "1addb1bdf36293c996653c9a0a320b5491714495862d997a23fb1ecd41ff395b"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-deepseq"
DESCRIPTION = "An efficient packed Unicode text type"
# Not canonical.
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3137a2b6a6df0a4fab97e00be8dff1a2"
GHC_PN = "text"
SETUPFILE = "Setup.lhs"
