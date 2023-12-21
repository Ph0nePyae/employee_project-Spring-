package com.employee_mybatis.employee_mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employee_mybatis.employee_mybatis.model.EmployeeModel;
import com.employee_mybatis.employee_mybatis.service.serviceimpl.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl empServiceImpl;
	
	@RequestMapping(value="/addData", method = RequestMethod.GET)
	public String addData() {
		return "dataAdd";
	}
	@RequestMapping(value="/addNewData", method = RequestMethod.POST)
	public ModelAndView addEmpData(@ModelAttribute EmployeeModel empModel) {
		int result = empServiceImpl.empDataAdd(empModel);
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/index");
		model.addObject("addResult", result);
		return model;
	}
	@RequestMapping(value="/deleteData/{id}", method = RequestMethod.GET)
	public ModelAndView empDataDelete(@PathVariable(name = "id") String employeeId) {
		int empId = Integer.parseInt(employeeId) ;
		int result = empServiceImpl.empDataDelete(empId);
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/index");
		model.addObject("deleteResult", result);
		model.addObject("emp_id", employeeId);
		return model;
	}
	@RequestMapping(value="/updateData/{id}", method = RequestMethod.GET)
	public ModelAndView selectById(@PathVariable(name = "id") String employeeId) {
		int empId = Integer.parseInt(employeeId);
		EmployeeModel empModel = empServiceImpl.selectById(empId);
		ModelAndView model = new ModelAndView();
		model.setViewName("updateData");
		model.addObject("empModel", empModel);
		return model;
	}
	@RequestMapping(value="/updateProcess", method = RequestMethod.POST)
	public ModelAndView empDataUpdate(@ModelAttribute EmployeeModel empModel) {
		int emp_id = empModel.getEmpId();
		int result = empServiceImpl.empDataUpdate(empModel);
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/index");
		model.addObject("updateResult", result);
		model.addObject("id", emp_id);
		return model;
	}
	@RequestMapping(value="/back", method = RequestMethod.GET)
	public ModelAndView back() {
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/index");
		return model;
	}
}

