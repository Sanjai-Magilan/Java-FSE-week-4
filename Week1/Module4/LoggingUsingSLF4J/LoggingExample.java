package Week1.Module4.LoggingUsingSLF4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);
    public static void main(String[] args) {
        logger.error("This is an error message");
        logger.warn("This is a warning message");
        logger.trace("This is a Trace message");
        logger.debug("This is a Debug message");
        logger.info("This is an Info message");
    }
}