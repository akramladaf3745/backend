package com.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AwsDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDeployApplication.class, args);
	}

	@GetMapping("/{answer}")
	public String getAnswser(@PathVariable String answer) {
		return "correct " + answer;
	}
}
