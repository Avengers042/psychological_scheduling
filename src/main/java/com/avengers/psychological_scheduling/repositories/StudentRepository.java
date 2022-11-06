package com.avengers.psychological_scheduling.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avengers.psychological_scheduling.models.users.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, UUID> {

  public List<StudentModel> findStudentByNameLike(String name);

}
