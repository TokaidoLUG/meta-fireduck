DESCRIPTION = "Fireduck OS image" 

inherit core-image 

IMAGE_FEATURES += "splash package-management x11-base" 

# locale
IMAGE_LINGUAS += " ja-jp "

#Enlightenment
IMAGE_INSTALL_append = " \
    packagegroup-fonts-truetype \
    packagegroup-fireduck-jp \
     \
    "

#IMAGE_INSTALL_append = " \
#    packagegroup-lxqt-base \
#"

#IMAGE_INSTALL  += " udev-extraconf "
IMAGE_INSTALL  += " network-manager-applet "


#IMAGE_INSTALL  += " gdb openbox-dbg "

#IMAGE_INSTALL += "midori takao-fonts mpv jack2" 

#IMAGE_FEATURES_append = " dev-pkgs tools-sdk tools-debug debug-tweaks ssh-server-openssh "
IMAGE_FEATURES_append = " ssh-server-openssh "
