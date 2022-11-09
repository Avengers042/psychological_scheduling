package com.avengers.psychological_scheduling.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.avengers.psychological_scheduling.models.documents.PsychologicalEvolutionSheetModel;
import com.avengers.psychological_scheduling.repositories.PsychologicalEvolutionSheetRepository;

@Service
public class PsychologicalEvolutionSheetService {

  final PsychologicalEvolutionSheetRepository psychologicalEvolutionSheetRepository;

  public PsychologicalEvolutionSheetService(
      PsychologicalEvolutionSheetRepository psychologicalEvolutionSheetRepository) {
    this.psychologicalEvolutionSheetRepository = psychologicalEvolutionSheetRepository;
  }

  @Transactional
  public PsychologicalEvolutionSheetModel save(PsychologicalEvolutionSheetModel psychologicalEvolutionSheetModel) {
    return psychologicalEvolutionSheetRepository.save(psychologicalEvolutionSheetModel);
  }

  public Page<PsychologicalEvolutionSheetModel> findAllPsychologicalEvolutionSheet(Pageable pageable) {
    return psychologicalEvolutionSheetRepository.findAll(pageable);
  }

  public Optional<PsychologicalEvolutionSheetModel> findById(Long id) {
    return psychologicalEvolutionSheetRepository.findById(id);
  }

}
