package com.mk.students.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mk.students.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer> {
	
	public Student findByName(String name);

}
