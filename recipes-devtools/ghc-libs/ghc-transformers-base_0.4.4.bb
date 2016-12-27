require recipes-devtools/ghc-libs/ghc-lib-common.inc
SRC_URI[md5sum] = "d2904686fa190187ea99e756c8f2c901"
SRC_URI[sha256sum] = "6aa3494fc70659342fbbb163035d5827ecfd8079e3c929e2372adf771fd52387"

DEPENDS += "ghc-transformers ghc-stm ghc-transformers-compat"
# base (≥3 & <5), transformers (≥0.2)
DESCRIPTION = "Lift computations from the bottom of a transformer stack"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=93e7d84c230d8f835ebffaa82a621e39"
GHC_PN = "transformers-base"
