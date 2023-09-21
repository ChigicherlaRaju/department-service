package com.department.service;

import org.springframework.stereotype.Service;

import com.department.model.Department;
import com.department.repository.DepartmentRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class DepartmentService {

	private final DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Adding Department: {}", department.getDepartmentName());
		return departmentRepository.save(department);
	}

	public Department getDepartmentById(Long id) {
		return departmentRepository.findById(id).orElse(null);
	}

}