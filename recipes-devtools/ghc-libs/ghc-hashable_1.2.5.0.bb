require recipes-devtools/ghc-libs/ghc-lib-common.inc
SRC_URI[md5sum] = "dd0d185552b94fd1c84580fddadf143c"
SRC_URI[sha256sum] = "153eb1614a739f3ccf8c5fcd4230a17b8b24862ab727c46dd4acd22bc15fb2bc"

DEPENDS += "ghc-text"
DESCRIPTION = "This package defines a class, Hashable,"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM="file://LICENSE;md5=a334afc29ca5fa43de3ec039a04dca8b"
GHC_PN = "hashable"
