package com.learning.docker.service;

import java.util.Comparator;
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

	public Employee save(Employee employee) {
		Integer id=dao.getEmpList().stream().map(emp-> emp.getId())
				.sorted(Comparator.reverseOrder()).findFirst().orElse(0);
		employee.setId(id+1);
		dao.getEmpList().add(employee);
		return employee;
	}

}
