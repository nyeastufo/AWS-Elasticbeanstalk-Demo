package com.ycic.aws.ebsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsElasticbeanstalkDemoApplication {

	@GetMapping("/status")
	public String deploy() {
		return "Application deployed to AWS BeanStalk ......!";
	}

	public static void main(String[] args) {

		SpringApplication.run(AwsElasticbeanstalkDemoApplication.class, args);
	}

}
