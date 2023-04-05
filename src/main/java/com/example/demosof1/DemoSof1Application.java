package com.example.demosof1;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSof1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoSof1Application.class, args);
	}

	@Bean
	public CommandLineRunner getEncryptedProperties(ConfigurableApplicationContext applicationContext){
		var logger = LoggerFactory.getLogger(DemoSof1Application.class);

		return (args -> {
			System.out.println("\n");

			logger.info("Decrypted custom property value = " + applicationContext.getEnvironment().getProperty("encrypted.value"));
		});
	}
}
