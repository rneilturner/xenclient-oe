BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "431cd7408c2eec41bedbb0071f14db15"
SRC_URI[sha256sum] = "4d6ad97e8e3d5dc6ce9ae68a469dc2fd3f66e9d312bc6faa7ab162eddcef87be"

require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-mtl ghc-stm ghc-transformers ghc-transformers-compat"
DESCRIPTION = "Extensible optionally-pure exceptions"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da5bccb37741b38b68ab236dec15b1f2"
GHC_PN = "exceptions"
