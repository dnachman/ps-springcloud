package com.logicalenigma.psspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PsSpringcloudSecureserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsSpringcloudSecureserviceApplication.class, args);
	}
	
	public class TollUsage {
		public String Id;
		public String stationId;
		public String licensePlate;
		public String timestamp;
		
		public TollUsage() {}

		public TollUsage(String id, String stationId, String licensePlate, String timestamp) {
			super();
			Id = id;
			this.stationId = stationId;
			this.licensePlate = licensePlate;
			this.timestamp = timestamp;
		}
		
		
	}
}
