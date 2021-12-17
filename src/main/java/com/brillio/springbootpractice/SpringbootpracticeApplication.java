package com.brillio.springbootpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.brillio")
public class SpringbootpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootpracticeApplication.class, args);
	}

}
