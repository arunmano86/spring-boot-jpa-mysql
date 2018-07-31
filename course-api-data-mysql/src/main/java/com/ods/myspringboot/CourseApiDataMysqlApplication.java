package com.ods.myspringboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableJpaRepositories(basePackages = "com.ods.myspringboot.user")
@SpringBootApplication
public class CourseApiDataMysqlApplication{

	public static void main(String[] args) {
		SpringApplication.run(CourseApiDataMysqlApplication.class, args);
	}
}
