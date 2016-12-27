BBCLASSEXTEND = "native"
require recipes-devtools/ghc-libs/ghc-lib-common.inc
SRC_URI[md5sum] = "4cdad06ec09ed7ecd2e9ca31cb9bdcac"
SRC_URI[sha256sum] = "e1666df1373ed784baa7d1e8e963bbc2d1f3c391578ac550ae74e7399173ee84"

DEPENDS += "ghc-transformers ghc-semigroups ghc-statevar ghc-void"
DESCRIPTION = "Haskell 98 contravariant functors"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=7d61d6ba3edb07f32ff749898db116c0"
GHC_PN = "contravariant"
