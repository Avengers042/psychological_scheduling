package com.avengers.psychological_scheduling.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avengers.psychological_scheduling.dtos.users.StudentDto;
import com.avengers.psychological_scheduling.models.users.StudentModel;
import com.avengers.psychological_scheduling.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

  final StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @PostMapping
  public ResponseEntity<Object> addUserToSystem(@RequestBody @Valid StudentDto studentDto) {
    StudentModel studentModel = new StudentModel();
    BeanUtils.copyProperties(studentDto, studentModel);
    studentModel.setActivationStatus(true);
    studentModel.setJob(1);
    return ResponseEntity.status(HttpStatus.CREATED).body(studentService.save(studentModel));
  }

  @GetMapping
  public ResponseEntity<Page<StudentModel>> searchAllUser(
      @PageableDefault(page = 0, size = 10, sort = "registration", direction = Sort.Direction.ASC) Pageable pageable) {
    return ResponseEntity.status(HttpStatus.OK).body(studentService.findAllStudent(pageable));
  }

  @GetMapping("/search-user/name/{name}")
  public ResponseEntity<Object> searchUserByName(@PathVariable("name") String name) {
    List<StudentModel> listStudent = studentService.findStudentByName("%" + name + "%");

    if (listStudent.isEmpty())
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found.");

    return ResponseEntity.status(HttpStatus.OK).body(listStudent);
  }

  @GetMapping("/search-user/id/{registration}")
  public ResponseEntity<Object> searchUserByRegistration(@PathVariable(value = "registration") Long registration) {
    Optional<StudentModel> studentModelOptional = studentService.findByRegistration(registration);
    if (!studentModelOptional.isPresent())
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found.");

    return ResponseEntity.status(HttpStatus.OK).body(studentModelOptional.get());
  }

  @PutMapping("/{registration}")
  public ResponseEntity<Object> updateDataOfUser(@PathVariable(value = "registration") Long registration,
      @RequestBody @Valid StudentDto studentDto) {
    Optional<StudentModel> studentModelOptional = studentService.findByRegistration(registration);
    if (!studentModelOptional.isPresent())
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found.");

    StudentModel studentModel = new StudentModel();
    BeanUtils.copyProperties(studentDto, studentModel);
    studentModel.setRegistration(studentModelOptional.get().getRegistration());
    return ResponseEntity.status(HttpStatus.OK).body(studentService.save(studentModel));
  }

}
