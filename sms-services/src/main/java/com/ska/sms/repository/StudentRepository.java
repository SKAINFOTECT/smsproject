package com.ska.sms.repository;

import java.util.Optional;

import com.ska.sms.entity.Student;

public interface StudentRepository extends AbstractRepository<Student, Long>{
	Optional<Student> findByUuid(String uuid);
}
