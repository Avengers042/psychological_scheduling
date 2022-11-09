package com.avengers.psychological_scheduling.models.users;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class StudentModel extends UserModel {
  @ManyToOne
  @JoinColumn(name = "fkSupervisorRegistration", referencedColumnName = "registration")
  private SupervisorModel supervisorRegistration;

  public StudentModel() {
  }

  public StudentModel(Long registration, String name, String email, String password, int job, boolean activationStatus,
      int signature, String saltPassword, SupervisorModel supervisorRegistration) {
    super(registration, name, email, password, job, activationStatus, signature, saltPassword);
    this.supervisorRegistration = supervisorRegistration;
  }

  public SupervisorModel getSupervisorRegistration() {
    return supervisorRegistration;
  }

  public void setSupervisorRegistration(SupervisorModel supervisorRegistration) {
    this.supervisorRegistration = supervisorRegistration;
  }

}
