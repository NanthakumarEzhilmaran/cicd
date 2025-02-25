package com.example.cicd;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdApplication {


	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);

		System.out.println("Hi main");
	}

}
