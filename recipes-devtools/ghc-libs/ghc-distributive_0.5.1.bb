BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "337f8f0738f408c2edcaddd1c55375ca"
SRC_URI[sha256sum] = "8fd0968c19b00b64c8219b81903c72841494460fcf1c10e84fa44f321bb3ae92"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-semigroups ghc-tagged ghc-transformers ghc-transformers-compat ghc-base-orphans"
DESCRIPTION = "Distributive functors -- Dual to Traversable"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d07e1e18c455f048ef0b3106ec3a8f3c"
GHC_PN = "distributive"
