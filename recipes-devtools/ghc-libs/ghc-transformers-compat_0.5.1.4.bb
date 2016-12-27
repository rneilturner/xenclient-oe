require recipes-devtools/ghc-libs/ghc-lib-common.inc
SRC_URI[md5sum] = "ed6f953f227dae242feb847ecd13c4da"
SRC_URI[sha256sum] = "d881ef4ec164b631591b222efe7ff555af6d5397c9d86475b309ba9402a8ca9f"

DEPENDS += "ghc-transformers"
DESCRIPTION = "Lift computations from the bottom of a transformer stack"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=d554ded64d0703b2a5e00cefaac75525"
GHC_PN = "transformers-compat"
