package com.example.ServerConfigGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServerConfigGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerConfigGitApplication.class, args);
	}

}
