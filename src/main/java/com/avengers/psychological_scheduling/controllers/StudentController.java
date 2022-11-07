package com.avengers.psychological_scheduling.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avengers.psychological_scheduling.models.users.StudentModel;
import com.avengers.psychological_scheduling.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController implements UserController<StudentModel> {

	final StudentService studentService;

	public StudentController( StudentService studentService ){
		this.studentService = studentService;
	}

	@Override
	public ResponseEntity<Object> addUserToSystem(StudentModel user) {
		return null;
	}

	@GetMapping
	public Page<StudentModel> searchAllUser(Pageable pageable) {
		
		return studentService.findAllStudent(pageable);
	}

	@GetMapping("/search-users/{name}")
	public Page<StudentModel> searchUserByName(@PathVariable("name") String name, Pageable pageable) {

		return studentService.findStudentByName("%" + name + "%", pageable);
	}

	@Override
	public ResponseEntity<Object> searchAllUserByRegistration(int registration) {
		return null;
	}

	@Override
	public ResponseEntity<Object> updateDataOfUser(int registration, StudentModel user) {
		return null;
	}

}
