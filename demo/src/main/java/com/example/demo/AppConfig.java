package com.example.demo;

import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
	
	@Bean
	public Foo foo() {
		return new Foo();
	}

}
