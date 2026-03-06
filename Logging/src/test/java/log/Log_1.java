package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Log_1 {

    private static final Logger log = LoggerFactory.getLogger(Log_1.class);

    public void login() {

        log.info("Login test started");
        log.warn("This is a warning message");
        log.debug("Debugging mode enabled");
        log.error("Login failed due to invalid cred");
    }
}
