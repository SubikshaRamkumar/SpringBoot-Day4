package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.BankLoanDetails;
import com.example.demo.Entity.StudentDetails;
import com.example.demo.Service.StudentService;

@RestController

public class ControllerClass {

	@Autowired
	private StudentService stuserve;
	
	@PostMapping("/add")
	public StudentDetails addStud(@RequestBody StudentDetails stu)
	{
	    return stuserve.addStudent(stu);
	}
	
	@GetMapping("/show")
	public List<StudentDetails> getStud()
	{
		List<StudentDetails> arr = new ArrayList<>();
		arr=stuserve.getStudent();
		return arr;
				
	}
	@GetMapping("/show/{id}")
	public StudentDetails getDetId(@PathVariable int id)
	{
		return stuserve.getDetailsId(id); 
	}
	
//	@DeleteMapping("/del/{id}")
//	public String delStud(@PathVariable("id") int id)
//	{
//		stuserve.delStudent(id);
//		return "Successfully deleted";
//	}
//	
//	@PutMapping("/update")
//	public StudentDetails updateStud(@RequestBody StudentDetails st)
//	{
//		return stuserve.updateStudent(st);
//	}
	
	@DeleteMapping("/del/{id}")
	public void delStud(@PathVariable int id)
	{
		stuserve.deleteStudent(id);
	}
	
	@PutMapping("/update/{id}")
	public StudentDetails updStud(@PathVariable int id,@RequestBody StudentDetails s)
	{
		return stuserve.updateStudent(id, s);
	}
}
