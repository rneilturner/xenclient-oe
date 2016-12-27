BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "1cbb4b295e0becd2e0ad024126c6c3cb"
SRC_URI[sha256sum] = "04075283606b3633f4b0c72f849a6df1b0519421ad099d07d3e72de589056263"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += ""
DESCRIPTION = "base-orphans defines orphan instances that mimic instances available in later versions of base to a wider (older) range of compilers."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=66869cba71f36cc609f87a00865e3be7"
GHC_PN = "base-orphans"
