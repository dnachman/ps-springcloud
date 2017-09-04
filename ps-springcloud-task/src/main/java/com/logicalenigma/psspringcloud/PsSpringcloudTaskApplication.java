package com.logicalenigma.psspringcloud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class PsSpringcloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsSpringcloudTaskApplication.class, args);
	}

	@Bean
	public TollProcessingTask tollProcessingTask() {
		return new TollProcessingTask();
	}

	public class TollProcessingTask implements CommandLineRunner {
		@Override
		public void run(String... args) throws Exception {
			// parameters stationid, license plate, timestamp
			if (null != args) {
				System.out.println("parameter length is " + args.length);
				if (args.length > 1) {
					String stationId = args[1];
					String licensePlate = args[2];
					String timestamp = args[3];

					System.out.println("Station ID is " + stationId + ", plate is " + licensePlate + ", timestamp is "
							+ timestamp);

				}
			}

		}
	}
}
