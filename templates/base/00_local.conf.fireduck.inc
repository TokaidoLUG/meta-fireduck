# Fireduck OS global configuration options
#---------------------------------

# Set DISTRO for Fireduck OS
DISTRO = "fireduck"

# workaround of polkit transaction check error
PACKAGE_CLASSES = "package_ipk"

# workaround of build error
INHERIT_remove = "uninative"
