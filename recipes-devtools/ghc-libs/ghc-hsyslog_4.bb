SRC_URI[md5sum] = "887db074c4183cea48387984b844bd1d"
SRC_URI[sha256sum] = "33d5fca76dbf8f1675258e81af5e53ee7c659cfee9cc78ea202c78ba05003a49"
require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += ""
DESCRIPTION = "syslog for GHC"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=5e6c932b646ccd55858ca0f522bbd186"
GHC_PN = "hsyslog"
SETUPFILE = "Setup.lhs"
