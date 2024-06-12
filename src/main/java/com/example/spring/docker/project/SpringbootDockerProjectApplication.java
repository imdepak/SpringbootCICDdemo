package com.example.spring.docker.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringbootDockerProjectApplication {
	
	@GetMapping("/message")
	public String getMessage()
	{
		return "Hello..I am From AWS CI/CD Pipeline Release 6";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerProjectApplication.class, args);
	}

}
