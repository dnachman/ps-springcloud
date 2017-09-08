package com.logicalenigma.psspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class PsSpringcloudTasksinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsSpringcloudTasksinkApplication.class, args);
	}
}
