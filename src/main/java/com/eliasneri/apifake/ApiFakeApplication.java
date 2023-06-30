package com.eliasneri.apifake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiFakeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFakeApplication.class, args);
	}

}
