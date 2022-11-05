package com.avengers.psychological_scheduling.models.documents;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.avengers.psychological_scheduling.models.users.PatientModel;

@Entity
@Table(name = "Therapy")
public class TherapyModel {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;
  @Column(nullable = false)
  private ZonedDateTime date;
  @Column(nullable = false, length = 255)
  private String description;
  @ManyToOne
  private PatientModel patient;

  public TherapyModel() {
  }

  public TherapyModel(int id, ZonedDateTime date, String description, PatientModel patient) {
    this.id = id;
    this.date = date;
    this.description = description;
    this.patient = patient;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public ZonedDateTime getDate() {
    return date;
  }

  public void setDate(ZonedDateTime date) {
    this.date = date;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PatientModel getPatient() {
    return patient;
  }

  public void setPatient(PatientModel patient) {
    this.patient = patient;
  }

}
