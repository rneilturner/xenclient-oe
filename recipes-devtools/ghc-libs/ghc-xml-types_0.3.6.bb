BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "d8ca51cebbc1c0977edb6faabe40418e"
SRC_URI[sha256sum] = "9937d440072552c03c6d8ad79f61e61467dc28dcd5adeaad81038b9b94eef8c9"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-deepseq ghc-text"
DESCRIPTION = "A XML Type Package"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://license.txt;md5=ef44aa0bc0c7e388835dcf37047c3bc3"
GHC_PN = "xml-types"
