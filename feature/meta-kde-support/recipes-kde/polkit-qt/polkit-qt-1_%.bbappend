FILESEXTRAPATHS_prepend := "${THISDIR}/polkit-qt-1:"

#SRC_URI += " file://delete_PACKAGE_INIT.patch "

CMAKE_ALIGN_SYSROOT[5] = "PolkitQt5-1, -s/usr, -s${PACKAGE_PREFIX_DIR}"
