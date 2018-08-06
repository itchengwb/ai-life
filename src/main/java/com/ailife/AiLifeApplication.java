package com.ailife;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ailife.module.*.dao")
public class AiLifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiLifeApplication.class, args);
	}
}
