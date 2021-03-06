SRC_URI += "\
    file://icedtea-ecj-fix-compil-gcc-4.7.patch;apply=no \
    file://icedtea-ecj-fix-currency-data.patch;apply=no \
"
# Ask bitbake to use icedtea-native-1.8.11 to copy the patch
FILESEXTRAPATHS := "${THISDIR}/${PN}:"

export DISTRIBUTION_ECJ_PATCHES += " \
    patches/icedtea-ecj-fix-compil-gcc-4.7.patch \
    patches/icedtea-ecj-fix-currency-data.patch \
"

#Allow icedtea to build on 4.0+ host kernels.
export DISABLE_HOTSPOT_OS_VERSION_CHECK = "1"

PR .= ".1"
