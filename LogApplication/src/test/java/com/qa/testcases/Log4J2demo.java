package com.qa.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4J2demo {

	
	
	    public static Logger logger = LogManager.getLogger(Log4J2demo.class);
	    
	    @Test
	    public void performSomeTask(){
	    	logger.trace("This is trace message");
	        logger.debug("This is a debug message");
	        logger.info("This is an info message");
	        logger.warn("This is a warn message");
	        logger.error("This is an error message");
	        logger.fatal("This is a fatal message");
	    }

	
}
