package com.avengers.psychological_scheduling.models.documents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.avengers.psychological_scheduling.models.users.PatientModel;

@Entity
@Table(name = "Couple")
public class CoupleModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @Column(nullable = false, length = 100)
  private String name;
  @Column(nullable = false)
  private int age;
  @Column(nullable = false, length = 30)
  private String job;
  @Column(nullable = false, length = 30)
  private String educationLevel;
  @ManyToOne
  private PatientModel patient;

  public CoupleModel() {
  }

  public CoupleModel(int id, String name, int age, String job, String educationLevel, PatientModel patient) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.job = job;
    this.educationLevel = educationLevel;
    this.patient = patient;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String getEducationLevel() {
    return educationLevel;
  }

  public void setEducationLevel(String educationLevel) {
    this.educationLevel = educationLevel;
  }

  public PatientModel getPatient() {
    return patient;
  }

  public void setPatient(PatientModel patient) {
    this.patient = patient;
  }

}
