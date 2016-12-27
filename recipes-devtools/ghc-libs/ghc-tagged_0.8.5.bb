require recipes-devtools/ghc-libs/ghc-lib-common.inc
SRC_URI[md5sum] = "e7819edae19ef929a8dcce82213d1b8a"
SRC_URI[sha256sum] = "e47c51c955ed77b0fa36897f652df990aa0a8c4eb278efaddcd604be00fc8d99"

DEPENDS += "ghc-deepseq ghc-transformers ghc-transformers-compat"
DESCRIPTION = "Haskell 98 phantom types to avoid unsafely passing dummy arguments"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=6642f8d529de7903fd72440c2a7d230f"
GHC_PN = "tagged"
