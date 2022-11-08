package com.avengers.psychological_scheduling.dtos.documents;

import java.time.ZonedDateTime;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.UniqueElements;

import com.avengers.psychological_scheduling.models.documents.CompanionModel;
import com.avengers.psychological_scheduling.models.users.PatientModel;
import com.avengers.psychological_scheduling.models.users.StudentModel;
import com.avengers.psychological_scheduling.models.users.SupervisorModel;

public class PsychologicalEvolutionSheetDto {
  @UniqueElements
  @NotNull
  private PatientModel patientId;
  @NotNull
  private ZonedDateTime dateMedicalAppointment;
  @NotBlank
  private String evaluationDocument;
  @UniqueElements
  @NotNull
  private StudentModel studentRegistration;
  @UniqueElements
  @NotNull
  private SupervisorModel signatureSupervisor;
  @NotBlank
  private String observation;
  @NotNull
  private boolean isIndividual;
  @UniqueElements
  @NotNull
  private Set<CompanionModel> companionModelId;

  public PatientModel getPatientId() {
    return patientId;
  }

  public void setPatientId(PatientModel patientId) {
    this.patientId = patientId;
  }

  public ZonedDateTime getDateMedicalAppointment() {
    return dateMedicalAppointment;
  }

  public void setDateMedicalAppointment(ZonedDateTime dateMedicalAppointment) {
    this.dateMedicalAppointment = dateMedicalAppointment;
  }

  public String getEvaluationDocument() {
    return evaluationDocument;
  }

  public void setEvaluationDocument(String evaluationDocument) {
    this.evaluationDocument = evaluationDocument;
  }

  public StudentModel getStudentRegistration() {
    return studentRegistration;
  }

  public void setStudentRegistration(StudentModel studentRegistration) {
    this.studentRegistration = studentRegistration;
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

  public Set<CompanionModel> getCompanionModelId() {
    return companionModelId;
  }

  public void setCompanionModelId(Set<CompanionModel> companionModelId) {
    this.companionModelId = companionModelId;
  }
}
