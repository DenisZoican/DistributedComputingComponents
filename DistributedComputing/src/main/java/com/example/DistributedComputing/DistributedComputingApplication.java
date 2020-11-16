package com.example.DistributedComputing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableDiscoveryClient
public class DistributedComputingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributedComputingApplication.class, args);
	}

}
