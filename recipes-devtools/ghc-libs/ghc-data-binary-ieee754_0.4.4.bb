BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "1a912f3d5b7ad6e984d5ab3c09f290de"
SRC_URI[sha256sum] = "59975abed8f4caa602f0780c10a9b2493479e6feb71ad189bb10c3ac5678df0a"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-binary"
DESCRIPTION = "Parser/Serialiser for IEEE-754 floating-point values"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://license.txt;md5=ef44aa0bc0c7e388835dcf37047c3bc3"
GHC_PN = "data-binary-ieee754"
