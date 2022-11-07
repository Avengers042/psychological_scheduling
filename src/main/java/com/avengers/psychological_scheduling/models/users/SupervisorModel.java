package com.avengers.psychological_scheduling.models.users;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Supervisor")
public class SupervisorModel extends UserModel {
  public SupervisorModel() {
  }

  public SupervisorModel(Long registration, String name, String email, String password, int job,
      boolean activationStatus, int signature) {
    super(registration, name, email, password, job, activationStatus, signature);
  }

}
