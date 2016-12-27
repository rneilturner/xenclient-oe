SUMMARY = "Haskell (GHC) runtime"
DESCRIPTION = "Haskell is an advanced purely-functional programming language. An open-source \
               product of more than twenty years of cutting-edge research, it allows rapid \ 
               development of robust, concise, correct software. With strong support for \
               integration with other languages, built-in concurrency and parallelism, \
               debuggers, profilers, rich libraries and an active community, Haskell makes it \
               easier to produce flexible, maintainable, high-quality software."
AUTHOR = "Adam Oliver <aikidokatech@users.noreply.github.com>"
HOMEPAGE = "http://www.haskell.org/"
SECTION = "devel"
LICENSE = "GHCL"

LIC_FILES_CHKSUM = "file://LICENSE;md5=7cb08deb79c4385547f57d6bb2864e0f"

FILESEXTRAPATHS_prepend := "${THISDIR}/ghc-${PN}:"

SRC_URI = " \
    http://www.haskell.org/ghc/dist/7.2.2/ghc-7.2.2-src.tar.bz2 \
    file://fix-compile-with-gcc-4.9.patch \
    "

SRC_URI[md5sum] = "fa19d9fe5049b7a1352b0b7c9880c141"
SRC_URI[sha256sum] = "ff6a71807ad1b0f9448510639b50d335dcff1c36c5cd8f55b4ad1c91fe68073d"

DEPENDS = "pkgconfig-native"

S = "${WORKDIR}/ghc-${PV}"

BBCLASSEXTEND = "native"

#EXTRA_OECONF_append = " --bindir ${STAGING_BINDIR} --libdir ${STAGING_LIBDIR} --datadir ${STAGING_DATADIR} --enable-shared "

inherit autotools-brokensep pkgconfig

FILES_${PN} = "${libdir}/*.so"
FILES_${PN}-dev = ""

PARALLEL_MAKE=""

# Inheriting autotools now so probalby a better way to do this but could not get it to work
do_configure() {
	./configure --prefix=${STAGING_DIR} --bindir ${STAGING_BINDIR} --libdir ${STAGING_LIBDIR} --datadir ${STAGING_DATADIR} --enable-shared
}

do_pre_configure() {
	cp `which pwd` ${S}/utils/ghc-pwd/ghc-pwd
	export CPP=`which cpp`
}

addtask pre_configure after do_patch before do_configure

do_tweak_configuration() {
	# This goes here so we do not depend nor require libgmp installed on target
	echo "INTEGER_LIBRARY = integer-simple" > mk/build.mk
	# Various flags to trim down ghc build time
	echo "HADDOCK_DOCS = NO" >> mk/build.mk
	echo "BUILD_DOCBOOK_HTML = NO" >> mk/build.mk
	echo "BUILD_DOCBOOK_PS = NO" >> mk/build.mk
	echo "BUILD_DOCBOOK_PDF = NO" >> mk/build.mk
	echo "SplitObjs = NO" >> mk/build.mk
	echo "SRC_HC_OPTS = -H64m -O0 -fasm" >> mk/build.mk
	echo "GhcStage1HcOpts = -O -fasm -DDEBUG" >> mk/build.mk
	echo "GhcStage2HcOpts = -O0 -fasm" >> mk/build.mk
	echo "GhcLibHcOpts    = -O -fasm -dcore-lint" >> mk/build.mk
	# set this to "v p" if profiling libraries are necessary
	echo "GhcLibWays = v dyn" >> mk/build.mk

	# look there for bfd.h stupid cow:
	echo "STANDARD_OPTS += \"-I${STAGING_INCDIR_NATIVE}\"" >> rts/ghc.mk
}

addtask tweak_configuration after do_configure before do_compile

# I know it hurts, but please be quiet.
INSANE_SKIP_${PN} = "installed-vs-shipped"

#do_install() {
#    make install "DESTDIR=${D}"
#}

do_prep_runtime_files() {
    install -d ${D}/usr/lib
    for file in $(find ${S} -type f -name *.so); do
        install -m 755 ${file} ${D}/usr/lib
    done
}

addtask prep_runtime_files after do_install before do_package

# RPROVIDES is coming up empty for this package.  Workaround until cause is discovered.
RPROVIDES_${PN} = "ghc-runtime"

