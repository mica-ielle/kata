package com.example.kata;

import com.example.kata.Adapter.DatabaseInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class KataApplication {

	public static void main(String[] args) {
		SpringApplication.run(KataApplication.class, args);
	}

}
