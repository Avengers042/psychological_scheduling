package com.avengers.psychological_scheduling.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.avengers.psychological_scheduling.models.users.StudentModel;
import com.avengers.psychological_scheduling.repositories.StudentRepository;

@Service
public class StudentService {

  final StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @Transactional
  public StudentModel save(StudentModel studentModel) {
    return studentRepository.save(studentModel);
  }

  public Page<StudentModel> findAllStudent(Pageable pageable) {
    return studentRepository.findAll(pageable);
  }

  public List<StudentModel> findStudentByName(String name) {
    return studentRepository.findStudentByNameLike(name);
  }

  public Optional<StudentModel> findByRegistration(Long registration) {
    return studentRepository.findById(registration);
  }

}
