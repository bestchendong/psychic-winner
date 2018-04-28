package com.trust.trusteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TrustEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrustEurekaServerApplication.class, args);
	}
}
