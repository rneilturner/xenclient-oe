BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "4456291f5c825641cef3d87c81610dd1"
SRC_URI[sha256sum] = "de40b12a70ec6425a9e54b33e2ac652e14d7c005a3b46d701d1e5696b98636c0"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-fail ghc-mtl ghc-random ghc-transformers ghc-transformers-compat"
DESCRIPTION = "Support for computations which consume random values."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3067809e776166e4b194b8bbb1cced79"
GHC_PN = "MonadRandom"
