BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "ee2f37df906f41dd49021bd9b0b8fa0a"
SRC_URI[sha256sum] = "daca6c5aeff21ca233bebe006c158b0e4421b239c722768b568fca9b32cafee7"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-fail"
DESCRIPTION = "A binary serialization library"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ec64b8b2cb5d58bfa9e4662374b9108"
GHC_PN = "cereal"
