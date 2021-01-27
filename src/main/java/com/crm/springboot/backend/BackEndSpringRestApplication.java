package com.crm.springboot.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BackEndSpringRestApplication implements CommandLineRunner{

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(BackEndSpringRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String password = "demo";
		
		for (int i = 0; i < 4; i++) {
			String bcrypt = passwordEncoder.encode(password);
			System.out.println(bcrypt);
		}
	}

}
