package com.ska.sms.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ska.sms.entity.Student;
import com.ska.sms.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/{uuid}")
	public Student findStudent(@PathVariable("uuid") String uuid) {
		return studentService.findStudent(uuid);
	}
	
	@PostMapping()
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}
}