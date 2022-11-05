package com.avengers.psychological_scheduling.models.documents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Companion")
public class CompanionModel {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;
  @Column(nullable = false, length = 100)
  private String name;
  @Column(nullable = false, length = 255)
  private String goal;
  @ManyToOne
  private PsychologicalEvolutionSheetModel psychologicalEvolutionSheetModel;

  public CompanionModel() {
  }

  public CompanionModel(int id, String name, String goal,
      PsychologicalEvolutionSheetModel psychologicalEvolutionSheetModel) {
    this.id = id;
    this.name = name;
    this.goal = goal;
    this.psychologicalEvolutionSheetModel = psychologicalEvolutionSheetModel;
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

  public String getGoal() {
    return goal;
  }

  public void setGoal(String goal) {
    this.goal = goal;
  }

  public PsychologicalEvolutionSheetModel getPsychologicalEvolutionSheetModel() {
    return psychologicalEvolutionSheetModel;
  }

  public void setPsychologicalEvolutionSheetModel(PsychologicalEvolutionSheetModel psychologicalEvolutionSheetModel) {
    this.psychologicalEvolutionSheetModel = psychologicalEvolutionSheetModel;
  }

}
