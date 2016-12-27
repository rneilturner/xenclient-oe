BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "447a121444940cc86b644b13f773e1c7"
SRC_URI[sha256sum] = "6f87251cb1d11505e621274dec15972de924a9074f07f7430a18892064c2676e"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-mtl ghc-text"
DESCRIPTION = "Monadic parser combinators for GHC"
# But not canonical...
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4b36c87a94916f61cc02d0d4211317ff"
GHC_PN = "parsec"
