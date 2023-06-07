package ru.khitrov.javapracs.prac13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Prac13Application {

	private static Test test = null;

	public Prac13Application(Test test) {
		this.test = test;
	}

	public static void main(String[] args) {
		SpringApplication.run(Prac13Application.class, args);
		test.testYaml();
	}

}
