package ru.khitrov.javapracs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Prac20Application {

	public static void main(String[] args) {
		SpringApplication.run(Prac20Application.class, args);
	}

}
