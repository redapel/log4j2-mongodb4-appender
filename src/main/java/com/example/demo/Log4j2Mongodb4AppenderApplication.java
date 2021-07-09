package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Log4j2Mongodb4AppenderApplication {

	private static final Logger log = LoggerFactory.getLogger(Log4j2Mongodb4AppenderApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4j2Mongodb4AppenderApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			log.trace("Trace level message");
			log.debug("Debug level message");
			log.info("Info level message");
			log.warn("Warn level message");
			log.error("Error level message");
		};
	}

}
