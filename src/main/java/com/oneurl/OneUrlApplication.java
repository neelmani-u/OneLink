package com.oneurl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.oneurl.repository") 
@EntityScan("com.oneurl.models")
@SpringBootApplication
public class OneUrlApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneUrlApplication.class, args);
	}

}
