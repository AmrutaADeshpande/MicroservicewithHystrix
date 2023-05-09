package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudGatewayserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayserviceApplication.class, args);
	}

}
