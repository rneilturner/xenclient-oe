BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "c920e79907eeec02ee793632f11309e5"
SRC_URI[sha256sum] = "c9fe45aae387855626ecb5a0fea6afdb207143cb00af3b1f715d1032d2d08784"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-bifunctors ghc-comonad ghc-distributive ghc-exceptions ghc-mtl ghc-profunctors ghc-semigroupoids ghc-semigroups ghc-transformers ghc-transformers-compat"
DESCRIPTION = "Free monads are useful for many tree-like structures and domain specific languages."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a729fe2fe231d7614436ee9d371e1679"
GHC_PN = "free"
