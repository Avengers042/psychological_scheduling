package com.avengers.psychological_scheduling.dtos.documents;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.avengers.psychological_scheduling.models.users.PatientModel;
import com.avengers.psychological_scheduling.models.users.StudentModel;
import com.avengers.psychological_scheduling.models.users.SupervisorModel;

public class PsychologicalEvolutionSheetDto {
  private PatientModel patientId;
  @NotBlank
  private String evaluationDocument;
  @NotBlank
  private String userRegistrationOfLastModification;
  @NotNull
  private StudentModel studentRegistration;
  private SupervisorModel signatureSupervisor; // using id to search for supervisor and get signature
  @NotBlank
  private String observation;
  @NotNull
  private boolean isIndividual;
  private int companionModelId;

  public PatientModel getPatientId() {
    return patientId;
  }

  public void setPatientId(PatientModel patientId) {
    this.patientId = patientId;
  }

  public String getEvaluationDocument() {
    return evaluationDocument;
  }

  public void setEvaluationDocument(String evaluationDocument) {
    this.evaluationDocument = evaluationDocument;
  }

  public String getUserRegistrationOfLastModification() {
    return userRegistrationOfLastModification;
  }

  public void setUserRegistrationOfLastModification(String userRegistrationOfLastModification) {
    this.userRegistrationOfLastModification = userRegistrationOfLastModification;
  }

  public StudentModel getStudentRegistration() {
    return studentRegistration;
  }

  public void setStudentRegistration(StudentModel studentRegistration) {
    this.studentRegistration = studentRegistration;
  }

  public SupervisorModel getSignatureSupervisor() {
    return signatureSupervisor;
  }

  public void setSignatureSupervisor(SupervisorModel signatureSupervisor) {
    this.signatureSupervisor = signatureSupervisor;
  }

  public String getObservation() {
    return observation;
  }

  public void setObservation(String observation) {
    this.observation = observation;
  }

  public boolean isIndividual() {
    return isIndividual;
  }

  public void setIndividual(boolean isIndividual) {
    this.isIndividual = isIndividual;
  }

  public int getCompanionModelId() {
    return companionModelId;
  }

  public void setCompanionModelId(int companionModelId) {
    this.companionModelId = companionModelId;
  }

}
