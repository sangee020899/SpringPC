package com.sangee.ServDisc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoApplication.class, args);
	}

}
