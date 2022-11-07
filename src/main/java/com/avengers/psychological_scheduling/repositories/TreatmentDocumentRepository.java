package com.avengers.psychological_scheduling.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.avengers.psychological_scheduling.models.documents.TreatmentDocumentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentDocumentRepository extends JpaRepository<TreatmentDocumentModel, Integer> {
    
    public Page<TreatmentDocumentModel> findDocumentsByNameLike(String name, Pageable pageable);
}
