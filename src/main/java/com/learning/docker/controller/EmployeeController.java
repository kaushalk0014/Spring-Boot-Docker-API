package com.learning.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.docker.dto.Employee;
import com.learning.docker.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> list=service.getAllEmployee();
		return list.isEmpty() 
			? new ResponseEntity<List<Employee>>(list, HttpStatus.NO_CONTENT)
			: new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Employee> save(@RequestBody Employee employee){
		
		employee= service.save(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
}
