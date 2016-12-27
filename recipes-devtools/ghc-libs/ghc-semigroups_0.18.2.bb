BBCLASSEXTEND = "native"
require recipes-devtools/ghc-libs/ghc-lib-common.inc
SRC_URI[md5sum] = "f02908f180888470edb36e676c691861"
SRC_URI[sha256sum] = "5dc9ff8622af25412fb071098063da288cd408a844e67c3371b78daa86d5d0e4"

DEPENDS += "ghc-hashable ghc-tagged ghc-unordered-containers"
DESCRIPTION = "Haskell 98 semigroups"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=a38bfee1357b68d214d9aab35f38aa98"
GHC_PN = "semigroups"
