package com.avengers.psychological_scheduling.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.avengers.psychological_scheduling.models.documents.TreatmentDocumentModel;
import com.avengers.psychological_scheduling.repositories.TreatmentDocumentRepository;

@Service
public class TreatmentDocumentService {

    final TreatmentDocumentRepository treatmentDocumentRepository;

    public TreatmentDocumentService(TreatmentDocumentRepository treatmentDocumentRepository){

        this.treatmentDocumentRepository = treatmentDocumentRepository;
    }
    
    public Page<TreatmentDocumentModel> searchAllDocuments(String name, Pageable pageable){
        return treatmentDocumentRepository.findDocumentsByNameLike(name, pageable);
    }
}
