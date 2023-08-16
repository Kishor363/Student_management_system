package com.mk.students.service;

import java.util.List;

import com.mk.students.model.Student;

public interface IStudentService {
	
	public String addStudent(Student stud);
	
	public List<Student> getAllStudent();
	
	public Student getStudentByName(String name);
	
	public String updateStudent(Student std);
	
	public void deleteStudent(int rollno);

}
