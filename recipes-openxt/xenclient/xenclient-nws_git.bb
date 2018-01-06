DESCRIPTION = "XenClient Network Slave"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM="file://../COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"
DEPENDS = " \
    carrier-detect \
    libxchutils \
    hkg-hsyslog \
    libxch-rpc \
    libxchxenstore \
    networkmanager \
    hkg-regex-posix \
    hkg-deepseq \
    hkg-text \
    hkg-mtl \
    hkg-network \
"
RDEPENDS_${PN} += "glibc-gconv-utf-32"

PV = "0+git${SRCPV}"
SRCREV = "${AUTOREV}"
SRC_URI = "git://${OPENXT_GIT_MIRROR}/network.git;protocol=${OPENXT_GIT_PROTOCOL};branch=${OPENXT_BRANCH}"

S = "${WORKDIR}/git/nws"

inherit haskell update-rc.d xc-rpcgen-haskell-1.0

INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME_${PN} = "network-slave"
INITSCRIPT_PARAMS_${PN} = "defaults 29 15"

FILES_${PN} += "/usr/bin/network-slave"

do_configure_append() {
    # generate rpc stubs
    mkdir -p ${S}/Rpc/Autogen

    # Server objects
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} --server -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/network_slave.xml
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} --server -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/network.xml
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} --server -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/network_nm.xml

    # NetworkManager objects (stored in the network-manager specific directory)
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} --client -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${nmidldatadir}/nm-manager.xml -n NmManager
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} --client -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${nmidldatadir}/nm-device.xml -n NmDevice
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} --client -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${nmidldatadir}/nm-device-ethernet.xml -n NmDeviceEthernet
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} --client -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${nmidldatadir}/nm-device-wifi.xml -n NmDeviceWifi
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} --client -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${nmidldatadir}/nm-device-modem.xml -n NmDeviceModem
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} --client -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${nmidldatadir}/nm-access-point.xml  -n NmAccessPoint
    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} --client -o ${S}/Rpc/Autogen --module-prefix=Rpc.Autogen ${nmidldatadir}/nm-active-connection.xml -n NmActiveConnection

    xc-rpcgen --haskell --templates-dir=${rpcgendatadir} -o Rpc/Autogen --module-prefix=Rpc.Autogen ${idldatadir}/dbus.xml
}

do_install_append() {
    install -m 0755 -d ${D}/etc/network-daemon
    install -m 0755 ${WORKDIR}/git/dnsmasq-template ${D}/etc/network-daemon/dnsmasq-template
    install -m 0755 ${WORKDIR}/git/dnsmasq-script-template ${D}/etc/network-daemon/dnsmasq-script-template

    install -m 0755 -d ${D}/etc/network-daemon/scripts
    install -m 0755 ${S}/nw_notify ${D}/etc/network-daemon/scripts/nw_notify

    install -m 0755 -d ${D}${sysconfdir}/init.d
    install -m 0755 ${S}/nws.initscript ${D}${sysconfdir}/init.d/network-slave
    
    install -d ${D}/${sysconfdir}/udev/rules.d
    install -D -m 0644 ${S}/nws-notify.rules ${D}/${sysconfdir}/udev/rules.d/81-nws-notify.rules

    install -d ${D}/${sysconfdir}/dnsmasq-config
}
