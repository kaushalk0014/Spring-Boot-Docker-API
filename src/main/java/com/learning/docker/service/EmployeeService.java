package com.learning.docker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.docker.dao.EmployeeDao;
import com.learning.docker.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public List<Employee> getAllEmployee() {
		return dao.getEmpList();
	}

}
