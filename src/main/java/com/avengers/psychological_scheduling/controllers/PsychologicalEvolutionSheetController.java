package com.avengers.psychological_scheduling.controllers;

import java.net.URI;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.avengers.psychological_scheduling.models.documents.PsychologicalEvolutionSheetModel;
import com.avengers.psychological_scheduling.models.users.PatientModel;
import com.avengers.psychological_scheduling.models.users.UserModel;
import com.avengers.psychological_scheduling.repositories.PsychologicalEvolutionSheetRepository;


@RestController
@RequestMapping("/psychologicalevolutionsheet")
public class PsychologicalEvolutionSheetController implements TreatmentDocumentController<PsychologicalEvolutionSheetModel> {

    @PostMapping("/createpes")
    public ResponseEntity<Object> createPsychologicalEvolutionSheet(@RequestBody PsychologicalEvolutionSheetController psycho){
      PsychologicalEvolutionSheetController savedPsycho = PsychologicalEvolutionSheetRepository.save(psycho);

      URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/createpes").buildAndExpand(savedPsycho.getId()).toUri();
      return ResponseEntity.created(location).build();
    }
    
  
    private Map<String, ?> getId() {
      return null;
    }


    @Override
    public PsychologicalEvolutionSheetModel searchTreatmentDocumentById(int id) {
      // TODO Auto-generated method stub
      return null;
    }
  
    @Override
    public PsychologicalEvolutionSheetModel searchDocumentByName(String name) {
      // TODO Auto-generated method stub
      return null;
    }
  
    @Override
    public boolean deleteTreatmentDocumentById(int id) {
      // TODO Auto-generated method stub
      return false;
    }
  
    @Override
    public boolean updateDataOfTreatmentDocument(PsychologicalEvolutionSheetModel document, UserModel user) {
      // TODO Auto-generated method stub
      return false;
    }
  
    @Override
    public void exportDataOfTreatmentDocumentById(int id) {
      // TODO Auto-generated method stub
  
    }


    @Override
    public boolean addTreatmentDocumentToSystem(PsychologicalEvolutionSheetModel document, UserModel user,
        PatientModel patientModel) {
      // TODO Auto-generated method stub
      return false;
    }
  
  }

