package com.avengers.psychological_scheduling.models.users;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class UserModel implements Serializable {
  @Id
  private int registration;
  @Column(nullable = false, length = 100)
  private String name;
  @Column(nullable = false, length = 100)
  private String email;
  @Column(nullable = false)
  private String password;
  @Column(nullable = false, length = 1)
  private int job;
  @Column(nullable = false)
  private boolean activationStatus;
  @Column(nullable = false, unique = true, length = 18)
  private int signature;

  public UserModel() {
  }

  public UserModel(int registration, String name, String email, String password, int job, boolean activationStatus,
      int signature) {
    this.registration = registration;
    this.name = name;
    this.email = email;
    this.password = password;
    this.job = job;
    this.activationStatus = activationStatus;
    this.signature = signature;
  }

  public int getRegistration() {
    return registration;
  }

  public void setRegistration(int registration) {
    this.registration = registration;
  }

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
