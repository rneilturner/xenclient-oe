BBCLASSEXTEND = "native"
require recipes-devtools/ghc-libs/ghc-lib-common.inc
SRC_URI[md5sum] = "1b4adb4e21892c15d1e674491a62a8c0"
SRC_URI[sha256sum] = "201a1d9d2fba16dff734eb79e07f138718ed62f5a0a846cf0cee743828844df1"

DEPENDS += "ghc-either ghc-safe ghc-transformers"
DESCRIPTION = "The one-stop shop for all your error-handling needs! Just import Control.Error."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=de760811a0a688464f4e84b2d717c9b9"
GHC_PN = "errors"
