package com.employee_mybatis.employee_mybatis.service;

import java.util.List;

import com.employee_mybatis.employee_mybatis.model.EmployeeModel;

public interface EmployeeService {
	public List<EmployeeModel> empAllData();
	public int empDataAdd(EmployeeModel empModel);
	public int empDataDelete(int empId);
	public EmployeeModel selectById(int empId);
	public int empDataUpdate(EmployeeModel empModel);
}
