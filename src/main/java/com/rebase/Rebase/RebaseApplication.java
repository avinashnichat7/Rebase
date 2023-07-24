package com.rebase.Rebase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RebaseApplication {

	public static void main(String[] args) {
		System.out.println("feature A");
		System.out.println("feature B");
		System.out.println("master");
		System.out.println("master A");
		System.out.println("feature C");
		System.out.println("f-1-1");
		System.out.println("f-2");
		SpringApplication.run(RebaseApplication.class, args);
	}

}
