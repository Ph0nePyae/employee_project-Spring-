package com.employee_mybatis.employee_mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.employee_mybatis.employee_mybatis.model.EmployeeModel;

@Mapper
public interface EmployeeRepository {
	public List<EmployeeModel> empAllData();
	public int empDataAdd(EmployeeModel empModel);
	public int empDataDelete(int empId);
	public EmployeeModel selectById(int empId); 
	public int empDataUpdate(EmployeeModel empModel);
}
