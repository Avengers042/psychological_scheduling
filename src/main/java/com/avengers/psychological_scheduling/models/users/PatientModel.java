package com.avengers.psychological_scheduling.models.users;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.avengers.psychological_scheduling.models.documents.CoupleModel;
import com.avengers.psychological_scheduling.models.documents.TherapyModel;

@Entity
@Table(name = "Patient")
public class PatientModel {
  @Id
  @Column(nullable = false, length = 11)
  private String CPF;
  @Column(nullable = false, length = 100)
  private String name;
  private int chart;
  @Column(nullable = false, length = 25)
  private String personalTelephone;
  @Column(nullable = false, length = 25)
  private String contactTelephone;
  @Column(nullable = false, length = 25)
  private String sex;
  @Column(nullable = false)
  private int age;
  @Column(nullable = false, length = 50)
  private String address;
  @Column(nullable = false, length = 25)
  private String religion;
  @Column(nullable = false, length = 30)
  private String educationLevel;
  @Column(nullable = false, length = 30)
  private String job;
  @OneToMany(mappedBy = "patient")
  @Column(nullable = false, unique = true)
  private Set<CoupleModel> coupleId;
  @Column(nullable = false, length = 100)
  private String chiefComplaint;
  @OneToMany(mappedBy = "patient")
  private Set<TherapyModel> therapyId;
  @Column(nullable = false, length = 100)
  private String physicalIssues;

  public PatientModel() {
  }

  public PatientModel(String cPF, String name, int chart, String personalTelephone, String contactTelephone, String sex,
      int age, String address, String religion, String educationLevel, String job, Set<CoupleModel> coupleId,
      String chiefComplaint, Set<TherapyModel> therapyId, String physicalIssues) {
    CPF = cPF;
    this.name = name;
    this.chart = chart;
    this.personalTelephone = personalTelephone;
    this.contactTelephone = contactTelephone;
    this.sex = sex;
    this.age = age;
    this.address = address;
    this.religion = religion;
    this.educationLevel = educationLevel;
    this.job = job;
    this.coupleId = coupleId;
    this.chiefComplaint = chiefComplaint;
    this.therapyId = therapyId;
    this.physicalIssues = physicalIssues;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String cPF) {
    CPF = cPF;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getChart() {
    return chart;
  }

  public void setChart(int chart) {
    this.chart = chart;
  }

  public String getPersonalTelephone() {
    return personalTelephone;
  }

  public void setPersonalTelephone(String personalTelephone) {
    this.personalTelephone = personalTelephone;
  }

  public String getContactTelephone() {
    return contactTelephone;
  }

  public void setContactTelephone(String contactTelephone) {
    this.contactTelephone = contactTelephone;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getReligion() {
    return religion;
  }

  public void setReligion(String religion) {
    this.religion = religion;
  }

  public String getEducationLevel() {
    return educationLevel;
  }

  public void setEducationLevel(String educationLevel) {
    this.educationLevel = educationLevel;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public Set<CoupleModel> getCoupleId() {
    return coupleId;
  }

  public void setCoupleId(Set<CoupleModel> coupleId) {
    this.coupleId = coupleId;
  }

  public String getChiefComplaint() {
    return chiefComplaint;
  }

  public void setChiefComplaint(String chiefComplaint) {
    this.chiefComplaint = chiefComplaint;
  }

  public Set<TherapyModel> getTherapyId() {
    return therapyId;
  }

  public void setTherapyId(Set<TherapyModel> therapyId) {
    this.therapyId = therapyId;
  }

  public String getPhysicalIssues() {
    return physicalIssues;
  }

  public void setPhysicalIssues(String physicalIssues) {
    this.physicalIssues = physicalIssues;
  }

}
