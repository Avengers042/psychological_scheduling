package com.avengers.psychological_scheduling.dtos.documents;

import javax.validation.constraints.NotBlank;

public class CompanionDto {
  @NotBlank
  private String name;
  @NotBlank
  private String goal;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGoal() {
    return goal;
  }

  public void setGoal(String goal) {
    this.goal = goal;
  }

}
