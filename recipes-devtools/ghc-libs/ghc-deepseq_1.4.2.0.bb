BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "e95d0c6b6a6992fbf26dff6d72a843aa"
SRC_URI[sha256sum] = "de0aa1291790409fe36e8b9bdf3c1f340661290eb3258876af2b07b721e94951"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += ""
DESCRIPTION = "Fully evaluate data structures for GHC"
LICENSE = "GHCL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a83ef7d4aeff27103dc2d40e9a70c2e6"

GHC_PN = "deepseq"
