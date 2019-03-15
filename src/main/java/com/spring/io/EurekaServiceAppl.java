package com.spring.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceAppl {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceAppl.class, args);
	}

}