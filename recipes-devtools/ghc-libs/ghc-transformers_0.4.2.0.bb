BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "594f4ef92938ef431c958ed2ef3f57c8"
SRC_URI[sha256sum] = "79565425178a8e349fc6e100d3def6447b8d9014ba1206fc85f584cadc276628"

require recipes-devtools/ghc-libs/ghc-lib-common.inc

DESCRIPTION = "Monad Transformers for ghc"
LICENSE = "GHCL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=315290737f6293f698ed37113aa1226d"
GHC_PN = "transformers"
