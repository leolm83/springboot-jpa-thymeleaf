package com.leolmcoding.cursospringboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class CursoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoSpringBootApplication.class, args);
	}

}
