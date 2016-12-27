BBCLASSEXTEND = "native"
require recipes-devtools/ghc-libs/ghc-lib-common.inc
SRC_URI[md5sum] = "493090b2bcfd2ba03935c0277b1a0080"
SRC_URI[sha256sum] = "78e5b19da5b701d14ceb2ca19191cc6205b2024ff2f71b754f5e949faa19cb2a"

DEPENDS += "ghc-semigroups ghc-transformers ghc-contravariant ghc-distributive"
DESCRIPTION = "Haskell 98 compatible comonads"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=21de4606c146e14c8ca6e65ae2ef3ccf"
GHC_PN = "comonad"
