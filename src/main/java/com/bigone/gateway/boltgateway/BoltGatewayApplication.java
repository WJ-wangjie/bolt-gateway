package com.bigone.gateway.boltgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BoltGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoltGatewayApplication.class, args);
	}

}
