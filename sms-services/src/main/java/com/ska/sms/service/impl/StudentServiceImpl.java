package com.ska.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ska.sms.entity.Student;
import com.ska.sms.exception.StudentNotFoundException;
import com.ska.sms.repository.StudentRepository;
import com.ska.sms.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}
	
	@Override
	public Student findStudent(String uuid)throws StudentNotFoundException {
		return studentRepository.findByUuid(uuid).orElseThrow(() -> new StudentNotFoundException(uuid));
	}
}
