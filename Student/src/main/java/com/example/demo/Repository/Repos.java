package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.StudentDetails;

public interface Repos extends JpaRepository<StudentDetails,Integer> {

}
