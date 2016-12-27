BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "ce0c9790e2d03f2b3e5c6a02340f366c"
SRC_URI[sha256sum] = "87a7e25c4745ea8ff479dd1212ec2e57710abb3d3dd30f948fa16be1d3ee05a4"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-base-orphans ghc-bifunctors ghc-comonad ghc-contravariant ghc-distributive ghc-tagged ghc-transformers"
DESCRIPTION = "Profunctors"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=19995a119336e4d109f10b27898fe699"
GHC_PN = "profunctors"
