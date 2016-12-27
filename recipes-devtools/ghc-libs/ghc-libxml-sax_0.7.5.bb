BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "c2ee96657807cd75f400c58c7a7134d3"
SRC_URI[sha256sum] = "99141784cc0d6c5749f0df618b2d46922391eede09f4f9ccfc36fb58a9c16d51"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-xml-types ghc-text libxml2"
DESCRIPTION = "A XML SAX library"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://license.txt;md5=ef44aa0bc0c7e388835dcf37047c3bc3"
GHC_PN = "libxml-sax"
