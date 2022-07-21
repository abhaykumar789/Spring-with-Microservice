package com.cgi.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.main.entity.Department;
import com.cgi.main.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	private static Logger log = LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentService dservice;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Inside the saveDepartment");
		return dservice.saveDepartment(department);
	}
	
	@GetMapping("/department/{id}")
	public Department getDepartmentByID(@PathVariable("id") int id) {
		return dservice.findBydid(id);
	}
}
