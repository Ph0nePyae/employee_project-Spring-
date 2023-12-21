package com.employee_mybatis.employee_mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employee_mybatis.employee_mybatis.model.EmployeeModel;
import com.employee_mybatis.employee_mybatis.service.serviceimpl.EmployeeServiceImpl;

@Controller
public class StartController {
	
	@Autowired
	private EmployeeServiceImpl empServiceImpl;
	
	@RequestMapping(value= {"/","/index"}, method = RequestMethod.GET)
	public ModelAndView empAllData() {
		List<EmployeeModel> empList = empServiceImpl.empAllData();
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		model.addObject("empList", empList);
		return model;
	}
}
