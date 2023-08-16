package com.mk.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.students.model.Student;
import com.mk.students.service.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	
	@Autowired
	private IStudentService stdServ;
	
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student std) {
		String msg=stdServ.addStudent(std);
		return msg;
	}
	
	
	@GetMapping("/getAll")
	public List<Student> viewAllStudents(){
		List<Student> stdList=stdServ.getAllStudent();
		return stdList;
	}
	
	
	
	@GetMapping("/byName/{name}")
	public Student getByName(@PathVariable String name) {
		Student std=stdServ.getStudentByName(name);
		return std;
	}
	
	
	@PutMapping("/update")
	public String updateStudent(@RequestBody Student std) {
		String msg=stdServ.updateStudent(std);
		return msg;
	}
	
	
	@DeleteMapping("/delete/{rollno}")
	public void deleteStudent(@PathVariable int rollno) {
		stdServ.deleteStudent(rollno);
	}

}
