BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "6144fe9ff2edf2cfb2ce73f1c49c199c"
SRC_URI[sha256sum] = "57045f5e2bedc095670182130a6d1134fcc65d097824ac5b03933876067d82e6"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-parsec"
DESCRIPTION = "Networking-related facilities for GHC"
LICENSE = "GHCL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78dd98be72709820ee0098ba6a71a888"
GHC_PN = "network"
