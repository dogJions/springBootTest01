package com.fym;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(basePackages="com.fym.mapper")
public class SpringBootTest02Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest02Application.class, args);
	}
}
