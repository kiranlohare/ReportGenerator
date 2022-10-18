package com.tcs.sbi.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.sbi.main.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	Optional<Student> findById(Integer id);
}