package com.avengers.psychological_scheduling.dtos.documents;

import java.time.ZonedDateTime;

import javax.validation.constraints.NotBlank;

public class TherapyDto {
  @NotBlank
  private ZonedDateTime date;
  @NotBlank
  private String description;

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
}
