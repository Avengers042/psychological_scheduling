package com.avengers.psychological_scheduling.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avengers.psychological_scheduling.models.users.StudentModel;
import com.avengers.psychological_scheduling.models.users.UserModel;
import com.avengers.psychological_scheduling.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController implements UserController<UserModel> {

	final StudentService studentService;

	public StudentController( StudentService studentService ){
		this.studentService = studentService;
	}

	@Override
	public ResponseEntity<Object> addUserToSystem(UserModel user) {
		return null;
	}

	@GetMapping
	public Page<StudentModel> searchAllUser(Pageable pageable) {
		
		return studentService.findAllStudent(pageable);
	}

	@GetMapping("/searchUser/{name}")
	public ResponseEntity<Object> searchUserByName(@PathVariable("name") String name) {

		List<StudentModel> listStudent = studentService.findStudentByName("%" + name + "%");

		String listStudentString = "";

		for( StudentModel student : listStudent ){

			listStudentString += "Nome: " + student.getName() + "<br>";
			listStudentString += "Nome: " + student.getEmail() + "<br><br>";
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(listStudentString);
	}

	@Override
	public ResponseEntity<Object> searchAllUserByRegistration(int registration) {
		return null;
	}

	@Override
	public ResponseEntity<Object> updateDataOfUser(int registration, UserModel user) {
		return null;
	}

}
