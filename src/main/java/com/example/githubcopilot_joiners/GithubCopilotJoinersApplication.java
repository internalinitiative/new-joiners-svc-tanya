package com.example.githubcopilot_joiners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*@ComponentScan(basePackages = "com.example.githubcopilot_joiners.Repository")*/
public class GithubCopilotJoinersApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubCopilotJoinersApplication.class, args);
	}

}
