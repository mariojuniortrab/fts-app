package com.fts.fts_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FtsUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(FtsUserApplication.class, args);
	}

}
