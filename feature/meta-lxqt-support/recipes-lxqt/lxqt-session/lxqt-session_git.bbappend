inherit update-alternatives

ALTERNATIVE_${PN} = "x-session-manager"
ALTERNATIVE_TARGET[x-session-manager] = "${bindir}/lxqt-session"
ALTERNATIVE_PRIORITY = "100"

