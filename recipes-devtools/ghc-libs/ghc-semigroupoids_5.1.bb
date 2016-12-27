BBCLASSEXTEND = "native"
require recipes-devtools/ghc-libs/ghc-lib-common.inc
SRC_URI[md5sum] = "8f59901e584ec9c65c64397fa5ea0345"
SRC_URI[sha256sum] = "16ac8ce9b40b0407cdb1b1197a704ec58ec689d5a6de891165a577725361f835"

DEPENDS += "ghc-comonad ghc-contravariant ghc-semigroups ghc-transformers ghc-bifunctors"
DESCRIPTION = "Provides a wide array of semigroupoids and operations for working with semigroupds."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=a38bfee1357b68d214d9aab35f38aa98"
GHC_PN = "semigroupoids"
