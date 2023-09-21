package com.department;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.department.model.Department;
import com.department.repository.DepartmentRepository;

@SpringBootApplication
public class DepartmentServiceApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner init(DepartmentRepository deptRepository) {
		return (args) -> {
			deptRepository.save(new Department("IT", "Pune", "IT001"));
		};
	}

}