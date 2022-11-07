package com.avengers.psychological_scheduling.controllers;

import com.avengers.psychological_scheduling.models.documents.TreatmentDocumentModel;
import com.avengers.psychological_scheduling.services.TreatmentDocumentService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/document")
public class TreatmentDocumentController {

    final TreatmentDocumentService treatmentDocumentService;

    public TreatmentDocumentController(TreatmentDocumentService treatmentDocumentService){
        this.treatmentDocumentService = treatmentDocumentService;
    }
    
    @GetMapping("/search-documents/{name}")
    public Page<TreatmentDocumentModel> searchAllDocuments( @PathVariable("name") String name, Pageable pageable ){
        return treatmentDocumentService.searchAllDocuments("%"+name+"%", pageable);
    }

}
