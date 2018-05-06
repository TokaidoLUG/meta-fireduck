DESCRIPTION = "Fireduck OS image" 

inherit core-image 

IMAGE_FEATURES_append = " splash package-management x11-base ssh-server-openssh " 

PACKAGE_INSTALL_remove = " psplash "

# locale
IMAGE_LINGUAS += " ja-jp "

# fireduck basic packages 
IMAGE_INSTALL_append = " \
    packagegroup-fonts-truetype \
    packagegroup-fireduck-jp \
    "

IMAGE_INSTALL  += " network-manager-applet "

