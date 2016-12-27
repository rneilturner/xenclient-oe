BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "474f10b9389b316e4472b71d20298993"
SRC_URI[sha256sum] = "b718a41057e25a3a71df693ab0fe2263d492e759679b3c2fea6ea33b171d3a5a"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += ""
DESCRIPTION = "provides a basic random number generation library"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cb903892d930c0f44a9ed9d706a544e4"
GHC_PN = "random"
