package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.demo.jpa.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.example.demo"})
public class MiniVdcQueueDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniVdcQueueDemoApplication.class, args);
	}
}


