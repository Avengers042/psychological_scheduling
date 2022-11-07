package com.avengers.psychological_scheduling.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avengers.psychological_scheduling.models.users.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Integer> {

    public Page<StudentModel> findStudentByNameLike(String name, Pageable pageable);
    
}
