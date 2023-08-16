package com.mk.students.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer rollNO;
	private String name;
	private String standard;
	private Double marks;
	private Double phoneNumber;
	private String division;
	private String mail;
	private Date dateOfBirth;
	
	
	
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	
	public Integer getRollNO() {
		return rollNO;
	}
	public void setRollNO(Integer rollNO) {
		this.rollNO = rollNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	public Double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

}
