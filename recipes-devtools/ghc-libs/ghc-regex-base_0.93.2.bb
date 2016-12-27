BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "e7b93b0b17eff8d3068ecb2f5d5f6ea3"
SRC_URI[sha256sum] = "20dc5713a16f3d5e2e6d056b4beb9cfdc4368cd09fd56f47414c847705243278"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-mtl"
DESCRIPTION = "Regex library for GHC"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=5a9760d05990120048023e30741b4d71"
GHC_PN = "regex-base"
