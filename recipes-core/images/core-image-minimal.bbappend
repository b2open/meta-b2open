IMAGE_FEATURES += "\
  package-management ssh-server-dropbear \
  "

# Packages and tools
IMAGE_INSTALL_append = "\
  util-linux procps htop lsof \
  minicom nano less \
  "

# Add space final image +250M
IMAGE_ROOTFS_EXTRA_SPACE = "250000"
