package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Student;
import com.fasterxml.jackson.core.sym.Name;
@Service
public interface StudentService {
	Student add(Student student);
	List<Student> getall();
	public String getbyid(Integer id);

}
