package com.avengers.psychological_scheduling.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.avengers.psychological_scheduling.controllers.PsychologicalEvolutionSheetController;
import com.avengers.psychological_scheduling.models.documents.TreatmentDocumentModel;

@Repository
public interface PsychologicalEvolutionSheetRepository extends JpaRepository<TreatmentDocumentModel, UUID> {

    static PsychologicalEvolutionSheetController save(PsychologicalEvolutionSheetController psycho) {
        return null;
    }

}
