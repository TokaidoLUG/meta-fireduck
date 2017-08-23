DEPENDS += " ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd', '', d)} "

PACKAGECONFIG = "opengl-full gstreamer1 pulseaudio luajit systemd "
PACKAGECONFIG += " ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd', '', d)} "

