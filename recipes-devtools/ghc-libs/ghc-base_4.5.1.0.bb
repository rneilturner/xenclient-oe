BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "20605e06874eb61efd2c91ccee82f761"
SRC_URI[sha256sum] = "475de554290771ceb0080e1d65ee05fdb43f09ed5f407e2027b02bb12af3bb95"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += ""
DESCRIPTION = "This package contains the Prelude and its support libraries"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ec64b8b2cb5d58bfa9e4662374b9108"
GHC_PN = "base"
