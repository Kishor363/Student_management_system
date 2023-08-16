package com.mk.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.students.model.Student;
import com.mk.students.repo.IStudentRepo;


@Service
public class IStudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentRepo stdRepo;

	@Override
	public String addStudent(Student stud) {
		if(stud.getMarks()>=60) {
			stud.setDivision("first");
		}else if(stud.getMarks()<60 && stud.getMarks()>=45) {
			stud.setDivision("second");
		}else if(stud.getMarks()<45 && stud.getMarks()>=30) {
			stud.setDivision("third");
		}else stud.setDivision("fail");
		
		Student st=stdRepo.save(stud);
		
		return "student registered with id:" +st.getRollNO();
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> std=stdRepo.findAll();
		return std;
	}

	@Override
	public Student getStudentByName(String name) {
		Student std=stdRepo.findByName(name);
		return std;
	}

	@Override
	public String updateStudent(Student std) {
		stdRepo.save(std);
		return "student updated";
	}

	@Override
	public void deleteStudent(int rollno) {
		stdRepo.deleteById(rollno);
}
}
