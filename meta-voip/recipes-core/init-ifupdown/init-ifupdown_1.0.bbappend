FILESEXTRAPATHS_prepend := "${THISDIR}/init-ifupdown:"

SRC_URI += "\
            file://interfaces \
            "


do_install_append ()  {
  
  # Configuring IP default
  install -m 0644 ${WORKDIR}/interfaces ${D}${sysconfdir}/network/interfaces

}
