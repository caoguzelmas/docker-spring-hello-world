package com.caoguzelmas.dockerspringhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringHelloWorldApplication {

	@RequestMapping("/")
	public String home() {
		return "Greetings from Machine!";

	}

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringHelloWorldApplication.class, args);
	}

}
