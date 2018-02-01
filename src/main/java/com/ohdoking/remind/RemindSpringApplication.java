package com.ohdoking.remind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class RemindSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemindSpringApplication.class, args);
	}
}
