package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Student;
import com.example.Service.Studentimp;

@RestController
public class HomeController {
	@Autowired
	private Studentimp si;
	@GetMapping("/first")
	public String access() {
		return "welcome";
	}
	@PostMapping("/save")
	public Student create(@RequestBody Student student)
	{
		return si.add(student);
	}
	@GetMapping("/getall")
	public List<Student> getrecords()
	{
		List<Student> s=si.getall();
		return s;
	}
	@GetMapping("{id}")
	public String getid(@PathVariable Integer id)
	{
		return si.getbyid(id);
	}
	@PutMapping("/update")
	public Student update(@RequestBody Student student)
	{
		return si.add(student);
	}
	
	

}
