package com.avengers.psychological_scheduling.dtos.users;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SupervisorDto {
  @NotBlank
  private String name;
  @NotBlank
  @Email
  private String email;
  @NotBlank
  @Size(min = 8)
  private String password;
  @NotNull
  private int job;
  @NotNull
  private boolean activationStatus;
  @NotNull
  private int signature;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getJob() {
    return job;
  }

  public void setJob(int job) {
    this.job = job;
  }

  public boolean isActivationStatus() {
    return activationStatus;
  }

  public void setActivationStatus(boolean activationStatus) {
    this.activationStatus = activationStatus;
  }

  public int getSignature() {
    return signature;
  }

  public void setSignature(int signature) {
    this.signature = signature;
  }
}
