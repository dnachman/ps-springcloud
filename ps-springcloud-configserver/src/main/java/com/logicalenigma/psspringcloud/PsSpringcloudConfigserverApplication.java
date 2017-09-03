package com.logicalenigma.psspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PsSpringcloudConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsSpringcloudConfigserverApplication.class, args);
	}
}
