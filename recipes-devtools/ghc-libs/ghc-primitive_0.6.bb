BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "fe7a3bfb0f50693fc79e181cf8976365"
SRC_URI[sha256sum] = "34a5f39213c68369e7edc2a3ea175d3f4edbf89e9f0777784710eff6f2d69722"

require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-transformers"
DESCRIPTION = "This package provides various primitive memory-related operations."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=be0b31f4d3a51d26d9983b09dc5cf70a"
GHC_PN = "primitive"
