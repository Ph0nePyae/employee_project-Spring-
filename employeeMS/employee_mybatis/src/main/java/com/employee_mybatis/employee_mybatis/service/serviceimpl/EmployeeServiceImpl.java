package com.employee_mybatis.employee_mybatis.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee_mybatis.employee_mybatis.model.EmployeeModel;
import com.employee_mybatis.employee_mybatis.repository.EmployeeRepository;
import com.employee_mybatis.employee_mybatis.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public List<EmployeeModel> empAllData() {
		return empRepository.empAllData();
	}

	@Override
	public int empDataAdd(EmployeeModel empModel) {
		return empRepository.empDataAdd(empModel);
	}
	
	@Override
	public int empDataDelete(int empId) {
		return empRepository.empDataDelete(empId);
	}

	@Override
	public EmployeeModel selectById(int empId) {
		return empRepository.selectById(empId);
	}

	@Override
	public int empDataUpdate(EmployeeModel empModel) {
		return empRepository.empDataUpdate(empModel);
	}

}
