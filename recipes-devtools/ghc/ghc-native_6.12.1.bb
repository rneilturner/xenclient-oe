# Our own GHC recipe as it was not provided in another layer.  GHC uses autotools,
# so redoing to be styled better and written properly for passing options.
# - Adam Oliver
# TODO:  This is an individual native recipe.  Should be changed to and extend using
# BBCLASSEXTEND in a GHC recipe.

SUMMARY = "ghc-native"
DESCRIPTION = "Haskell (GHC) native"
LICENSE = "GHCL"

LIC_FILES_CHKSUM = "file://LICENSE;md5=7cb08deb79c4385547f57d6bb2864e0f"

FILESEXTRAPATHS_prepend := "${THISDIR}/ghc-${PN}:"

SRC_URI = " \
    http://www.haskell.org/ghc/dist/6.12.1/ghc-6.12.1-src.tar.bz2 \
	file://fix-compile-with-gcc-4.9.patch \
    "

SRC_URI[md5sum] = "3a2b23f29013605f721ebdfc29de9c92"
SRC_URI[sha256sum] = "cdf99f9add677a925ee87a5b87e94eb595ed9b72034453c195ef9379bd26552a"

PR = "r1"

S = "${WORKDIR}/ghc-${PV}"

inherit native pythonnative

PARALLEL_MAKE=""
CFLAGS_append = ' -Wno-unused -std=gnu89'

# Inheriting autotools now so probalby a better way to do this
do_configure() {
    cp `which pwd` utils/ghc-pwd/ghc-pwd
    export CPP=`which cpp`

        # CC="${CCACHE}${BUILD_PREFIX}gcc" \
        # Below was BUILD_CFLAGS but we should let OE set the proper value by using CFLAGS
        # Also changed CPP from `which cpp` as that can also be decided by OE
        # The previous instance of this in devshell was also changed
        # CFLAGS="${CFLAGS}" \
        # CPP="${CPP}" \
    ./configure --prefix=${STAGING_DIR} --bindir ${STAGING_BINDIR} --libdir ${STAGING_LIBDIR} --datadir ${STAGING_DATADIR} --enable-shared

    # This goes here so we do not depend nor require libgmp installed on target
       echo "INTEGER_LIBRARY = integer-simple" > mk/build.mk
        # Various flags to trim down ghc build time
        echo "HADDOCK_DOCS = NO" >> mk/build.mk
        echo "BUILD_DOCBOOK_HTML = NO" >> mk/build.mk
        echo "BUILD_DOCBOOK_PS = NO" >> mk/build.mk
        echo "BUILD_DOCBOOK_PDF = NO" >> mk/build.mk
        echo "SplitObjs = NO" >> mk/build.mk
        echo "SRC_HC_OPTS = -H64m -O0 -fasm" >> mk/build.mk
        echo "GhcStage1HcOpts = -O -fasm" >> mk/build.mk
        echo "GhcStage2HcOpts = -O0 -fasm" >> mk/build.mk
        echo "GhcLibHcOpts    = -O -fasm" >> mk/build.mk
        # set this to "v p" if profiling libraries are necessary
        echo "GhcLibWays = v dyn" >> mk/build.mk

    # look there for bfd.h stupid cow:
    echo "STANDARD_OPTS += \"-I${STAGING_INCDIR_NATIVE}\"" >> rts/ghc.mk
}

## This is probably preventing the use of CFLAGS_append as it is not oe_make
do_compile() {
    oe_runmake
}

do_install() {
    oe_runmake install "DESTDIR=${D}"
}
