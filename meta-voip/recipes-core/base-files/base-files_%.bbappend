FILESEXTRAPATCHS_prepend := "${THISDIR}/${PN}:"

do_install_append () {
  
  # Configure Hostname
  _hostname="trdx-voip"
  echo ${_hostname} > ${D}${sysconfdir}/hostname

}
