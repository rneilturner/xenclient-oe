BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "d925e7a465a65c1b41b8acc40cc19d39"
SRC_URI[sha256sum] = "f54c63584ace968381de4a06bd7328b6adc3e1a74fd336e18449e0dd7650be15"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += ""
DESCRIPTION = "A variety of alternative parser combinator libraries for GHC"
# Version not clearly specified.
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=271beef410de4146a7e52374fbba02d3"
GHC_PN = "polyparse"
