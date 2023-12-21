package com.employee_mybatis.employee_mybatis.model;

import lombok.Getter;
import lombok.Setter;

public class EmployeeModel {

	@Getter
	@Setter
	private int empId;

	@Getter
	@Setter
	private String empName;
	
	@Getter
	@Setter
	private int empAge;
	
	@Getter
	@Setter
	private int empSalary;
}
