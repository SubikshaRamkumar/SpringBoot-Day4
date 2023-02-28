package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.BankLoanDetails;
import com.example.demo.Entity.StudentDetails;
import com.example.demo.Repository.Repos;

@Service
public class StudentService {

	@Autowired
	private Repos repo;
	
	public StudentDetails addStudent(StudentDetails obj)
	{
		return repo.save(obj);
	}
	public List<StudentDetails> getStudent()
	{
		List<StudentDetails> arr = new ArrayList<>();
		arr = repo.findAll();
		return arr;
	}
	public void deleteStudent(int id)
	{
		repo.deleteById(id);
	}
	public StudentDetails updateStudent(int id,StudentDetails s)
	{
		return repo.saveAndFlush(s);
	}
	public StudentDetails getDetailsId(int id) 
	{
		return repo.findById(id).get();
	}
}
