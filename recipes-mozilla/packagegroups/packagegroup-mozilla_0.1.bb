SUMMARY = "mozilla package group"
DESCRIPTION = "mozilla package group"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-mozilla \
    "
# language support
MOZILLA_LANGUAGE_PACK = " \
	firefox-l10n-en-za \
	firefox-l10n-hy-am \
	firefox-l10n-pt-br \
	firefox-l10n-ach \
	firefox-l10n-eo \
	firefox-l10n-id \
	firefox-l10n-pt-pt \
	firefox-l10n-af \
	firefox-l10n-es-ar \
	firefox-l10n-is \
	firefox-l10n-rm \
	firefox-l10n-an \
	firefox-l10n-es-cl \
	firefox-l10n-it \
	firefox-l10n-ro \
	firefox-l10n-ar \
	firefox-l10n-es-es \
	firefox-l10n-ja \
	firefox-l10n-ru \
	firefox-l10n-as \
	firefox-l10n-es-mx \
	firefox-l10n-kk \
	firefox-l10n-si \
	firefox-l10n-ast \
	firefox-l10n-et \
	firefox-l10n-km \
	firefox-l10n-sk \
	firefox-l10n-az \
	firefox-l10n-eu \
	firefox-l10n-kn \
	firefox-l10n-sl \
	firefox-l10n-be \
	firefox-l10n-fa \
	firefox-l10n-ko \
	firefox-l10n-son \
	firefox-l10n-bg \
	firefox-l10n-ff \
	firefox-l10n-lij \
	firefox-l10n-sq \
	firefox-l10n-bn-bd \
	firefox-l10n-fi \
	firefox-l10n-lt \
	firefox-l10n-sr \
	firefox-l10n-bn-in \
	firefox-l10n-fr \
	firefox-l10n-lv \
	firefox-l10n-sv-se \
	firefox-l10n-br \
	firefox-l10n-fy-nl \
	firefox-l10n-mai \
	firefox-l10n-ta \
	firefox-l10n-bs \
	firefox-l10n-ga-ie \
	firefox-l10n-mk \
	firefox-l10n-te \
	firefox-l10n-ca \
	firefox-l10n-gd \
	firefox-l10n-ml \
	firefox-l10n-th \
	firefox-l10n-cs \
	firefox-l10n-gl \
	firefox-l10n-mr \
	firefox-l10n-tr \
	firefox-l10n-cy \
	firefox-l10n-gn \
	firefox-l10n-ms \
	firefox-l10n-uk \
	firefox-l10n-da \
	firefox-l10n-gu-in \
	firefox-l10n-nb-no \
	firefox-l10n-uz \
	firefox-l10n-de \
	firefox-l10n-he \
	firefox-l10n-nl \
	firefox-l10n-vi \
	firefox-l10n-dsb \
	firefox-l10n-hi-in \
	firefox-l10n-nn-no \
	firefox-l10n-xh \
	firefox-l10n-el \
	firefox-l10n-hr \
	firefox-l10n-or \
	firefox-l10n-zh-cn \
	firefox-l10n-en-gb \
	firefox-l10n-hsb \
	firefox-l10n-pa-in \
	firefox-l10n-zh-tw \
	firefox-l10n-en-us \
	firefox-l10n-hu \
	firefox-l10n-pl \
	"


RDEPENDS_${PN} += " \
    firefox \
    ${MOZILLA_LANGUAGE_PACK} \
    "
