SUMMARY = "Japanese language setting."
DESCRIPTION = "Japanese language setting."
SECTION = "base"

LICENSE = "MPLv2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MPL-2.0;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = "file://locale_setting.sh \
           "

S = "${WORKDIR}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

do_install () {
	install -m 0755 -d ${D}${sysconfdir}/profile.d/
	install -m 0644 ${WORKDIR}/locale_setting.sh ${D}${sysconfdir}/profile.d/locale_setting.sh
}

FILES_${PN} = "${sysconfdir}/profile.d/locale_setting.sh"

