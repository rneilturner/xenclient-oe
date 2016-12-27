BBCLASSEXTEND = "native"
require recipes-devtools/ghc-libs/ghc-lib-common.inc
SRC_URI[md5sum] = "1f5c3446b7d3492b4226a4c4e15e808f"
SRC_URI[sha256sum] = "da724ad9cf4b424c4881a50439c3b13777f477e3301c068ce7d54e9031e14b9a"


DEPENDS += ""
DESCRIPTION = "Partial functions from the base library, such as head and !!, modified to return more descriptive error messages, programmer defined error messages, Maybe wrapped results and default values. These functions can be used to reduce the number of unsafe pattern matches in your code."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=f4bd7ee1a5f13175f29cf43a05af61d7"
GHC_PN = "safe"
