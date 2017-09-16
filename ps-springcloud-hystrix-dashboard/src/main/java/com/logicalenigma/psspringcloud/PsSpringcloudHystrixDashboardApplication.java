package com.logicalenigma.psspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class PsSpringcloudHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsSpringcloudHystrixDashboardApplication.class, args);
	}
}
