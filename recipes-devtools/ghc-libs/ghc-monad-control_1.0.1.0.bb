BBCLASSEXTEND = "native"

SRC_URI[md5sum] = "afad6755c4585502e197a3e449779669"
SRC_URI[sha256sum] = "d4b0209c6cb7006fac618e4d8e3743d908f8b21579d6ff72e9f6e758e24301f4"

require recipes-devtools/ghc-libs/ghc-lib-common.inc

DEPENDS += "ghc-base-unicode-symbols ghc-transformers ghc-transformers-base"
DESCRIPTION = "Lift control operations, like exception catching, through monad transformers"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=67634a94867d2b4cea9192052bca1335"
GHC_PN = "monad-control"
