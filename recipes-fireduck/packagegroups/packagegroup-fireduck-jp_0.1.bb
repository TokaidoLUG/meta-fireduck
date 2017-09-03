SUMMARY = "The japanese language support for Fireduck OS"
DESCRIPTION = "The japanese language support for Fireduck OS"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-fireduck-jp \
    "

RDEPENDS_${PN} += " \
    base-language-jp \
    "
