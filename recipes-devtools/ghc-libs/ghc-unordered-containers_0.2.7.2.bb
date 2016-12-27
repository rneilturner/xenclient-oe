require recipes-devtools/ghc-libs/ghc-lib-common.inc
SRC_URI[md5sum] = "96312bd14d7ef617ca5dce1994eeb31c"
SRC_URI[sha256sum] = "7f5c4344fcab01f6046378c64522f0dfd69e417f6c1a8858a24bdabaadb3e56e"

DEPENDS += "ghc-deepseq ghc-hashable"
DESCRIPTION = "Efficient hashing-based container types."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=1f146cd05e812322fbcf9b679fa56636"
GHC_PN = "unordered-containers"
