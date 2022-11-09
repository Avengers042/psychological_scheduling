package com.avengers.psychological_scheduling.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avengers.psychological_scheduling.models.documents.PsychologicalEvolutionSheetModel;

@Repository
public interface PsychologicalEvolutionSheetRepository extends JpaRepository<PsychologicalEvolutionSheetModel, Long> {

}