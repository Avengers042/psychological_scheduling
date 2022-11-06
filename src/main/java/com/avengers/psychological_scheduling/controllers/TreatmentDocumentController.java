package com.avengers.psychological_scheduling.controllers;

import com.avengers.psychological_scheduling.models.documents.TreatmentDocumentModel;
import com.avengers.psychological_scheduling.models.users.PatientModel;
import com.avengers.psychological_scheduling.models.users.UserModel;

public interface TreatmentDocumentController <T extends TreatmentDocumentModel> {
    public boolean addTreatmentDocumentToSystem(T document, UserModel user, PatientModel patientModel);
  
    public T searchTreatmentDocumentById(int id);
  
    public T searchDocumentByName(String name);
  
    public boolean deleteTreatmentDocumentById(int id);
  
    public boolean updateDataOfTreatmentDocument(T document, UserModel user);
  
    public void exportDataOfTreatmentDocumentById(int id);
  }
