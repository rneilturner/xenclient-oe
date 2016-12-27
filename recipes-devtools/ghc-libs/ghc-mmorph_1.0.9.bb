BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "b4c25d4afc521ad7aab7a1f5fc3135c4"
SRC_URI[sha256sum] = "e1f27d3881b254e2a87ffb21f33e332404abb180361f9d29092a85e321554563"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-mtl ghc-transformers ghc-transformers-compat"
DESCRIPTION = "This library provides monad morphism utilities, most commonly used for manipulating monad transformer stacks."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=99f9cc4a08ce3dc564ee0a753a79f4da"
GHC_PN = "mmorph"
