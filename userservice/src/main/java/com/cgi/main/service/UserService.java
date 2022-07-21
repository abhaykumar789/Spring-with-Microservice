package com.cgi.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cgi.main.entity.User;
import com.cgi.main.repository.UserRepository;
import com.cgi.main.vo.Department;
import com.cgi.main.vo.ResponseTemplate;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}

	public ResponseTemplate getUserWIthDepartment(int id) {
		// TODO Auto-generated method stub
		ResponseTemplate responseTemplate = new ResponseTemplate();
		User user = this.userRepository.findByUserId(id);
		//invoke Department service
		//Department department = this.restTemplate.getForObject("http://localhost:7001/departments/department/"+user.getDid(), Department.class);
		Department department = this.restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/department/"+user.getDid(), Department.class);
		responseTemplate.setUser(user);
		responseTemplate.setDepartment(department);
		return  responseTemplate;
	}
	
	
}
