BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "d479074c33845aef2f392bf4933a0e23"
SRC_URI[sha256sum] = "f6d7b5640eb03e9598e38b1a2b2e7af1e9d357f3f845fc9528f9750965b92d54"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-cereal ghc-libxml-sax ghc-network ghc-parsec ghc-text ghc-transformers ghc-xml-types ghc-random ghc-vector"
DESCRIPTION = "DBus bindings for ghc"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://license.txt;md5=d32239bcb673463ab874e80d47fae504"
GHC_PN = "dbus"
