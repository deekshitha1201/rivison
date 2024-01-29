package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Student;
import com.example.Repository.Studentrepo;

@Service
public class Studentimp implements StudentService {
	@Autowired
	private Studentrepo sr;

	@Override
	public Student add(Student student) {
		// TODO Auto-generated method stub
		return sr.save(student);
	}

	

	public List<Student> getall() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}



	@Override
	public String getbyid(Integer id) {
		// TODO Auto-generated method stub
	    if(sr.existsById(id))
	    {
	    	sr.deleteById(id);
	    	return "deleted successfully";
	    }
	    else
	    {
	    	return "not found";
	    }
	}



	
}
