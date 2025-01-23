package com.example.fileimpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FileimplApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileimplApplication.class, args);
	}

	@Bean
	public ResponseData responseData(){
		return new ResponseData();
	}

}
