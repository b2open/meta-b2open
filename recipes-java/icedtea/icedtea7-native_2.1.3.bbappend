FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

CORBA_CHANGESET = "79ee8535bc51"
SRC_URI[corba.md5sum] = "f9aae602c4d31203fcbf8dcfc5560ad9"
SRC_URI[corba.sha256sum] = "00bf0b0996484db3d0497345ca5b14db4ffb2288b6c7adf8a003b2eafc396fb2"


JAXP_CHANGESET = "77e7219c7424"
SRC_URI[jaxp.md5sum] = "440258a557c3cf0d585304a04ab060b8"
SRC_URI[jaxp.sha256sum] = "bb4beb62fae52d0ff871aefd64ae54eaed8978bff87df1e23f1bfead40ceae6d"


JAXWS_CHANGESET = "d92eda447bca"
SRC_URI[jaxws.md5sum] = "52b1d409628184988ff0f1d1e4d0a853"
SRC_URI[jaxws.sha256sum] = "566778320a0fa18ca93427d6afadc8bd3e416fd8249f9ce88e37e215f9295335"


JDK_CHANGESET = "d7ecb57d3c61"
SRC_URI[jdk.md5sum] = "db2a0f91f27ad7ebbc68db53691ca403"
SRC_URI[jdk.sha256sum] = "b24bf93559804610a6e1078bea94adcec1b2f818dd600b12304926f6e86c6747"


LANGTOOLS_CHANGESET = "fd2fdb20d858"
SRC_URI[langtools.md5sum] = "702becdfee546841ed038c79fa1a9909"
SRC_URI[langtools.sha256sum] = "10fee41a0cdd1b166ff78e6426430c76af0f2358d026c181d325af1e41646c34"


HOTSPOT_CHANGESET = "a456d0771ba0"
SRC_URI[hotspot.md5sum] = "625d903e79e4f9aaf21cf98e369118e1"
SRC_URI[hotspot.sha256sum] = "69719a9657b15e6bef1bef137a15d830293091fbc46616fe8759e863ba904442"


OPENJDK_CHANGESET = "f89009ada191"
SRC_URI[openjdk.md5sum] = "2bc941373ca4b033c9a25f972eec7858"
SRC_URI[openjdk.sha256sum] = "5efd8e66f18fcbf45527bcc74aa3e6ed11f66bc793c88e3841925c4acb4827ba"


ICEDTEA_PATCHES += " \
                  file://0001-Fix-Checksum-IcedTea7.patch \
                  "
