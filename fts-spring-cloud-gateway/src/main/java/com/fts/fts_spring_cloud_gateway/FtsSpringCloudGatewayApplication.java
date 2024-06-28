package com.fts.fts_spring_cloud_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FtsSpringCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FtsSpringCloudGatewayApplication.class, args);
	}

}
