package com.cgi.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.main.entity.Department;
import com.cgi.main.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentrepository;

	public Department saveDepartment(Department department) {
		return departmentrepository.save(department);

	}

	 

	public Department findBydid(int id) {
		// TODO Auto-generated method stub
		return departmentrepository.findBydid(id);
	}

}
