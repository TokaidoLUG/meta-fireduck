SUMMARY = "The japanese language support for Fireduck OS"
DESCRIPTION = "The japanese language support for Fireduck OS"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-fireduck-jp \
    "

# fonts
TTF_FONTS = " \
    takao-fonts \
    takao-exfonts \
    takao-mjfonts \
    "

RDEPENDS_${PN} += " \
    base-language-jp \
    ${TTF_FONTS} \
    "
