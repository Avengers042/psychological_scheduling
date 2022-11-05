package com.avengers.psychological_scheduling.dtos.users;

import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.UniqueElements;

import com.avengers.psychological_scheduling.models.documents.CoupleModel;
import com.avengers.psychological_scheduling.models.documents.TherapyModel;

public class PatientDto {
  @NotBlank
  @Size(min = 11, max = 11)
  private String CPF;
  @NotBlank
  private String name;
  @NotBlank
  private int chart;
  @NotBlank
  private String personalTelephone;
  @NotBlank
  private String contactTelephone;
  @NotBlank
  private String sex;
  @NotBlank
  private int age;
  @NotBlank
  private String address;
  @NotBlank
  private String religion;
  @NotBlank
  private String educationLevel;
  @NotBlank
  private String job;
  @NotBlank
  @UniqueElements
  private Set<CoupleModel> coupleId;
  @NotBlank
  private String chiefComplaint;
  @NotBlank
  @UniqueElements
  private Set<TherapyModel> therapyId;
  @NotBlank
  private String physicalIssues;

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
