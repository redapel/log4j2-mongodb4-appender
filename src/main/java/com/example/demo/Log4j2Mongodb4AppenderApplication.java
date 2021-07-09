package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2Mongodb4AppenderApplication {

	private static final Logger log = LoggerFactory.getLogger(Log4j2Mongodb4AppenderApplication.class);

	public static void main(String[] args) {
		log.trace("Trace level message");
		log.debug("Debug level message");
		log.info("Info level message");
		log.warn("Warn level message");
		log.error("Error level message");
	}

}
