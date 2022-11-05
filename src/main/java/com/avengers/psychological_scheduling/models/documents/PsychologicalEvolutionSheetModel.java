package com.avengers.psychological_scheduling.models.documents;

import java.time.ZonedDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.avengers.psychological_scheduling.models.users.PatientModel;
import com.avengers.psychological_scheduling.models.users.StudentModel;
import com.avengers.psychological_scheduling.models.users.SupervisorModel;

@Entity
@Table(name = "PsychologicalEvolutionSheet")
public class PsychologicalEvolutionSheetModel extends TreatmentDocumentModel {
  @OneToOne
  @JoinColumn(name = "signatureSupervisor", referencedColumnName = "signature")
  private SupervisorModel signatureSupervisor;
  @Column(nullable = false, length = 255)
  private String observation;
  @Column(nullable = false)
  private boolean isIndividual;
  @OneToMany(mappedBy = "psychologicalEvolutionSheetModel")
  private Set<CompanionModel> companionModelId;

  public PsychologicalEvolutionSheetModel() {
  }

  public PsychologicalEvolutionSheetModel(int id, PatientModel patientId, ZonedDateTime dateMedicalAppointment,
      String evaluationDocument, String userRegistrationOfLastModification2, StudentModel studentRegistration,
      SupervisorModel signatureSupervisor, String observation, boolean isIndividual,
      Set<CompanionModel> companionModelId) {
    super(id, patientId, dateMedicalAppointment, evaluationDocument, userRegistrationOfLastModification2,
        studentRegistration);
    this.signatureSupervisor = signatureSupervisor;
    this.observation = observation;
    this.isIndividual = isIndividual;
    this.companionModelId = companionModelId;
  }

  public SupervisorModel getSignatureSupervisor() {
    return signatureSupervisor;
  }

  public void setSignatureSupervisor(SupervisorModel signatureSupervisor) {
    this.signatureSupervisor = signatureSupervisor;
  }

  public String getObservation() {
    return observation;
  }

  public void setObservation(String observation) {
    this.observation = observation;
  }

  public boolean isIndividual() {
    return isIndividual;
  }

  public void setIndividual(boolean isIndividual) {
    this.isIndividual = isIndividual;
  }

  public Set<CompanionModel> getCompanionModelId() {
    return companionModelId;
  }

  public void setCompanionModelId(Set<CompanionModel> companionModelId) {
    this.companionModelId = companionModelId;
  }

}
