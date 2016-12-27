BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "f5b881e046467ef53aa3167ffac4c981"
SRC_URI[sha256sum] = "3746f971f69ce31ced23d12e4785d96985f5c620ac7a26d5f4efead970c43b87"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-base-orphans ghc-comonad ghc-semigroups ghc-tagged ghc-transformers ghc-transformers-compat"
DESCRIPTION = "Bifunctors"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=89de2f52941a4bc8f5e2156db40f03e2"
GHC_PN = "bifunctors"
