package com.avengers.psychological_scheduling.models.documents;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import com.avengers.psychological_scheduling.models.users.PatientModel;
import com.avengers.psychological_scheduling.models.users.StudentModel;

@Entity
@Table(name = "treatment_document")
@MappedSuperclass
public abstract class TreatmentDocumentModel implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;
  @ManyToOne
  @JoinColumn(name = "patientId", referencedColumnName = "CPF")
  private PatientModel patientId;
  @Column(nullable = false)
  private ZonedDateTime dateMedicalAppointment;
  @Column(nullable = false, length = 255)
  private String evaluationDocument;
  @Column(nullable = false, length = 100)
  private String userRegistrationOfLastModification;
  @ManyToOne
  @JoinColumn(name = "studentRegistration", referencedColumnName = "registration")
  private StudentModel studentRegistration;

  public TreatmentDocumentModel() {
  }

  public TreatmentDocumentModel(int id, PatientModel patientId, ZonedDateTime dateMedicalAppointment,
      String evaluationDocument, String userRegistrationOfLastModification2, StudentModel studentRegistration) {
    this.id = id;
    this.patientId = patientId;
    this.dateMedicalAppointment = dateMedicalAppointment;
    this.evaluationDocument = evaluationDocument;
    this.userRegistrationOfLastModification = userRegistrationOfLastModification2;
    this.studentRegistration = studentRegistration;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

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

}
