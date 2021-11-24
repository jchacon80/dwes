package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoIoc2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoIoc2Application.class, args);
		
		((DependantService) ctx.getBean("dependantService")).doSmth();
	}

}
