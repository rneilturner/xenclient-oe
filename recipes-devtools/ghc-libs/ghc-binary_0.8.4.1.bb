BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "69f83dfbeb6ca1bf1c6e8b7dc5991aad"
SRC_URI[sha256sum] = "8d13c700fe96c84644a2af37003f488668fe9cd1f8e5b316fc929de26ce7e7ba"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += ""
DESCRIPTION = "Efficient, pure binary serialisation using lazy ByteStrings."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=842154b7fc56299acd68b1fe3fcd79b2"
GHC_PN = "binary"
