package com.rebase.Rebase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RebaseApplication {

	public static void main(String[] args) {
		System.out.println("master");
		SpringApplication.run(RebaseApplication.class, args);
	}

}