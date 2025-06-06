package com.learning.docker.config;

import java.util.List;
import java.util.stream.Collectors;

import com.learning.docker.dao.EmployeeDao;
import com.learning.docker.dto.Employee;

public class TestClass {

	public static void main(String[] args) {
		TestClass class1=new TestClass();
		class1.save(new Employee());
	}
	
	
	public Employee save(Employee employee) {
		EmployeeDao dao=new EmployeeDao();
		 List<Integer> result=dao.getEmpList().stream().map(emp-> emp.getId()).collect(Collectors.toList());
				 System.out.println(result);
		return employee;
	}
}
