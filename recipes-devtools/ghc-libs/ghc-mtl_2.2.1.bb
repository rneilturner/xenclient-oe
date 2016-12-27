SRC_URI[md5sum] = "96a2f12b94ea8d7cb0aea999cd2e3802"
SRC_URI[sha256sum] = "cae59d79f3a16f8e9f3c9adc1010c7c6cdddc73e8a97ff4305f6439d855c8dc5"
BBCLASSEXTEND = "native"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-transformers"
DESCRIPTION = "Monad Transformers for ghc"
LICENSE = "GHCL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=315290737f6293f698ed37113aa1226d"
GHC_PN = "mtl"
