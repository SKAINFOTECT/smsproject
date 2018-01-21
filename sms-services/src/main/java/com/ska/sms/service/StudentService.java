package com.ska.sms.service;

import com.ska.sms.entity.Student;
import com.ska.sms.exception.StudentNotFoundException;

public interface StudentService {

	Student save(Student student);

	Student findStudent(String uuid) throws StudentNotFoundException;

}
