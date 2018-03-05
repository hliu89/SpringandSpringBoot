package com.liu.projectes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectesApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "hello hongqiao";
	}

}

