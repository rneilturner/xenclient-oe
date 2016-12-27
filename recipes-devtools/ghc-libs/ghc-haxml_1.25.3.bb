BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "83e174f818a3a3a0a932ae6fc3125691"
SRC_URI[sha256sum] = "6448a7ee1c26159c6c10db93757ed9248f647b1c0c431e7aead6aadd6d2307c7"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-polyparse"
DESCRIPTION = "XML library for ghc"
# Clause 6 relaxed.
LICENSE = "LGPLv3 & GPLv3"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=fe41c6f999f87439d72ea3f6f16d7167"
GHC_PN = "HaXml"

INSANE_SKIP_${PN}-utils = "already-stripped"

FILES_${PN}-utils += "${bindir}/*"

