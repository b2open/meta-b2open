inherit core-image

IMAGE_FEATURES += "\
  package-management ssh-server-dropbear \
  "

# Packages and tools
IMAGE_INSTALL_append += "\
  util-linux procps htop lsof \
  openjdk-7-jre openjdk-7-common servlet2.5 rxtx \
  minicom nano less \
  "

# Add space final image +250M
#IMAGE_ROOTFS_EXTRA_SPACE_append += "+ 3000000"
IMAGE_ROOTFS_EXTRA_SPACE = "250000"

inherit extrausers

EXTRA_USERS_PARAMS = "\
useradd -p '' tomcat6; \
groupadd tomcat6; \
userdel nobody; \
groupmod -g 1020 tomcat6; \
usermod -s /bin/sh -u 1020 tomcat6; \
"
