package com.avengers.psychological_scheduling.dtos.documents;

import javax.validation.constraints.NotBlank;

public class CoupleDto {
  @NotBlank
  private String name;
  @NotBlank
  private int age;
  @NotBlank
  private String job;
  @NotBlank
  private String educationLevel;

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

}
