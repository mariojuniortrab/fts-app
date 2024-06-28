package com.fts.fts_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer

public class FtsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FtsConfigServerApplication.class, args);
	}

}
