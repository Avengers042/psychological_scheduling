package com.avengers.psychological_scheduling.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avengers.psychological_scheduling.models.users.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {

  public List<StudentModel> findStudentByNameLike(String name);

}
