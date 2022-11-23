package com.userRegistration;

import com.userRegistration.Shared.AppLogger.AppLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		AppLogger logger = context.getBean("AppLogger", AppLogger.class);

		logger.initLogger();

		SpringApplication.run(Application.class, args);

		context.close();
	}

}