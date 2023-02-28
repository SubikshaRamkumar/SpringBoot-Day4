package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentDetails")

public class StudentDetails {

	public StudentDetails() {}
	public StudentDetails(int id, String studentName, String department_Name, String mailId) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.department_Name = department_Name;
		this.mailId = mailId;
	}

	@Id
	private int id;
	
	private String studentName;
	
	private String department_Name;
	
	private String mailId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDepartment_Name() {
		return department_Name;
	}

	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	
}
