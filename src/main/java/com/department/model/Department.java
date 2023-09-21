package com.department.model;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "DEPARTMENTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String departmentName;
	private String departmentAddress;
	private String departmentCode;

	public Department(String deptName, String deptAddress, String deptCode) {
		super();
		this.departmentName = deptName;
		this.departmentAddress = deptAddress;
		this.departmentCode = deptCode;
	}

}