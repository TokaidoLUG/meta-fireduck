DESCRIPTION = "Fireduck OS image" 

inherit core-image 

IMAGE_FEATURES += "splash package-management x11-base" 

# locale
IMAGE_LINGUAS += " ja-jp "

#Enlightenment
IMAGE_INSTALL_append = " \
    packagegroup-enlightenment \
    packagegroup-fireduck-jp \
    "

IMAGE_INSTALL  += " udev-extraconf chromium "

#IMAGE_INSTALL += "midori takao-fonts mpv jack2" 


