BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "32f3ffd4404e525c5cfda38e98a8b0d0"
SRC_URI[sha256sum] = "7ad68decb5c9a76f83c95ece5fa13d1b053e4fb1079bd2d3538f6b05014dffb7"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-transformers ghc-stm"
DESCRIPTION = "This package contains state variables, which are references in the IO monad, like IORefs or parts of the OpenGL state."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c9456aa95746cd9a4035201586530247"
GHC_PN = "StateVar"
