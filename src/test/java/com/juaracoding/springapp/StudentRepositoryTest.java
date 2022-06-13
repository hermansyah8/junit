package com.juaracoding.springapp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.juaracoding.springapp.repository.StudentRepository;
import com.juaracoding.springapp1.model.Student;

@DataJpaTest
public class StudentRepositoryTest {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void saveStudentTesting() {
		Student student = Student.builder()
				.firstname("Test 1")
				.lastname("Test 2")
				.email("test1@gmail.com")
				.phone("08764")
				.build();
		studentRepository.save(student);
		Assertions.assertThat(student.getId()).isGreaterThan(0);
	}
	
	

}
