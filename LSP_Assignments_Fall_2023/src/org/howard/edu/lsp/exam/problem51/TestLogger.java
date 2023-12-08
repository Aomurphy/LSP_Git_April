package org.howard.edu.lsp.exam.problem51;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestLogger {
    
    @Test
    public void testDisplayLog() {
        Logger logger = Logger.getInstance();
        logger.logMessage("Test log message 1");
        logger.logMessage("Test log message 2");
        assertEquals("Log:\nTest log message 1\nTest log message 2\n", logger.displayLog());
    }
    
    @Test
    public void testLoggerInstances() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        assertEquals(logger1, logger2); // Assert that both instances are the same
    }
}
