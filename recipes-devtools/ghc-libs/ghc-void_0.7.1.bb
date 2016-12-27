BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "42609d17158aff2686fe37424e2673f6"
SRC_URI[sha256sum] = "c9f0fd93680c029abb9654b5464be260652829961b18b7046f96a0df95e825f4"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-semigroups ghc-deepseq ghc-hashable"
DESCRIPTION = "A Haskell 98 logically uninhabited data type, used to indicate that a given term should not exist."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84c43960ac46d7029410756642d4da01"
GHC_PN = "void"
