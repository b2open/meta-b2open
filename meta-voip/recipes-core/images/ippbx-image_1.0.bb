inherit core-image

IMAGE_FEATURES += "\
  package-management ssh-server-dropbear \
  "

# Packages and tools
IMAGE_INSTALL += "\
  util-linux procps base-files \
  asterisk libgsm tcpdump \
  htop lsof minicom nano less \
  "

# Add space final image +250M
IMAGE_ROOTFS_EXTRA_SPACE = "250000"
