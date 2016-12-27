BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "c5f071451021a035e4e37711eadeab57"
SRC_URI[sha256sum] = "09bb087f0870a353ec1e7e1a08017b9a766d430d956afb88ca000a6a876bf877"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += ""
DESCRIPTION = "Higher order versions of Prelude classes to ease programming with polymorphic recursion and reduce UndecidableInstances"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e41f6ac2cf50718d7339349c695e6036"
GHC_PN = "prelude-extras"
