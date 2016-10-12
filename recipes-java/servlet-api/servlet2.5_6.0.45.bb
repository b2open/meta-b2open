FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

DESCRIPTION = "Servlet API 2.5 (from Tomcat 6.0.45)"
LICENSE = "Apache-2.0"
AUTHOR = "Apache Software Foundation"

# 6.0.45
LIC_FILES_CHKSUM = "file://LICENSE;md5=428d4ef9c4a7a46026aef8cce4a51373"
SRC_URI[md5sum] = "dc1db1e54157544dc5d042734c35cb99"
SRC_URI[sha256sum] = "8f9bd3e02f1e7798ca8f99f3254594688307ced3e7325dfb10f336750d82482d"


SRC_URI = "\
  http://archive.apache.org/dist/tomcat/tomcat-6/v${PV}/bin/apache-tomcat-${PV}.tar.gz \
  file://tomcat6 \
  file://tomcat-users.xml \
"


# S = "${WORKDIR}/apache-tomcat-${PV}-src/servletapi/jsr154"
S = "${WORKDIR}/apache-tomcat-${PV}"


inherit update-rc.d


INITSCRIPT_NAME = "tomcat6"
INITSCRIPT_PARAMS = "defaults 85"


# Variavel webserver Tomcat
#WS_TOMCAT = "webserverjava"


# TOMCAT_SRC = "${WORKDIR}/apache-tomcat-${PV}-src"
#FILES_${PN} += " /sat /sat/init /sat/${WS_TOMCAT} /sat/${WS_TOMCAT}/logs "
FILES_${PN} += "\
  ${sysconfdir} \
  ${sysconfdir}/tomcat6 \
  /usr/share/tomcat6 \
  /usr/share/tomcat6/works \
  /usr/share/tomcat6/temp \
  /var/lib/tomcat6 \
  /var/cache/tomcat6 \
  /var/log/tomcat6 \
  "


do_install() {
  
  install -m 775 -d ${D}/usr/share/tomcat6
  install -m 775 -d ${D}/usr/share/tomcat6/works
  install -m 775 -d ${D}/etc/tomcat6
  install -m 775 -d ${D}/var/cache/tomcat6
  install -m 775 -d ${D}/var/lib/tomcat6
  install -m 775 -d ${D}/var/log/tomcat6
  install -d ${D}${sysconfdir}/init.d
  
  install -m 0755 ${WORKDIR}/tomcat6 ${D}${sysconfdir}/init.d/tomcat6

  cp -a ${S}/bin ${D}/usr/share/tomcat6/
  cp -a ${S}/lib ${D}/usr/share/tomcat6/
  cp -a ${S}/webapps ${D}/usr/share/tomcat6/
  cp -a ${S}/temp ${D}/usr/share/tomcat6/
  cp -a ${S}/conf/* ${D}/etc/tomcat6/

  ln -s ${sysconfdir}/tomcat6 ${D}/usr/share/tomcat6/conf
  ln -s ${localstatedir}/log/tomcat6 ${D}/usr/share/tomcat6/logs

  cat ${WORKDIR}/tomcat-users.xml > ${D}${sysconfdir}/tomcat6/tomcat-users.xml

  chown -R 1020:1020 ${D}/usr/share/tomcat6/
  chown -R 1020:1020 ${D}/etc/tomcat6/
  
  chmod 755 ${D}/usr/share/tomcat6/bin/
}

