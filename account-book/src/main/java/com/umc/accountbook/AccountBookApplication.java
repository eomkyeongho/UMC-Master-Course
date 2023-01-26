package com.umc.accountbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AccountBookApplication {
	public static void main(String[] args) {
		SpringApplication.run(AccountBookApplication.class, args);
	}

}
