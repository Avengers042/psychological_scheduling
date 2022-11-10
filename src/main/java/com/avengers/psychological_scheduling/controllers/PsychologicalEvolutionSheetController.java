package com.avengers.psychological_scheduling.controllers;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avengers.psychological_scheduling.dtos.documents.PsychologicalEvolutionSheetDto;
import com.avengers.psychological_scheduling.models.documents.PsychologicalEvolutionSheetModel;
import com.avengers.psychological_scheduling.services.PsychologicalEvolutionSheetService;

@RestController
@RequestMapping("/documents/psychological-evolution")
public class PsychologicalEvolutionSheetController {

  final PsychologicalEvolutionSheetService psychologicalEvolutionSheetService;

  public PsychologicalEvolutionSheetController(PsychologicalEvolutionSheetService psychologicalEvolutionSheetService) {
    this.psychologicalEvolutionSheetService = psychologicalEvolutionSheetService;
  }

  @PostMapping
  public ResponseEntity<Object> addDocumentToSystem(
      @RequestBody @Valid PsychologicalEvolutionSheetDto psychologicalEvolutionSheetDto) {
    PsychologicalEvolutionSheetModel psychologicalEvolutionSheetModel = new PsychologicalEvolutionSheetModel();
    BeanUtils.copyProperties(psychologicalEvolutionSheetDto, psychologicalEvolutionSheetModel);

    psychologicalEvolutionSheetModel.setDateMedicalAppointment(ZonedDateTime.now(ZoneId.of("America/Sao_Paulo")));

    return ResponseEntity.status(HttpStatus.CREATED)
        .body(psychologicalEvolutionSheetService.save(psychologicalEvolutionSheetModel));
  }

  @GetMapping
  public ResponseEntity<Page<PsychologicalEvolutionSheetModel>> searchAllPsychologicalEvolutionSheet(
      @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
    return ResponseEntity.status(HttpStatus.OK)
        .body(psychologicalEvolutionSheetService.findAllPsychologicalEvolutionSheet(pageable));
  }

  @GetMapping("/search-psychological-evolution-sheet/id/{id}")
  public ResponseEntity<Object> searchUserByRegistration(@PathVariable(value = "id") Long id) {
    Optional<PsychologicalEvolutionSheetModel> psychologicalEvolutionSheetModelOptional = psychologicalEvolutionSheetService
        .findById(id);
    if (!psychologicalEvolutionSheetModelOptional.isPresent())
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Psychological Evolution Sheet not found.");

    return ResponseEntity.status(HttpStatus.OK).body(psychologicalEvolutionSheetModelOptional.get());
  }

  @PutMapping("/{id}")
  public ResponseEntity<Object> updateDataOfUser(@PathVariable(value = "id") Long id,
      @RequestBody @Valid PsychologicalEvolutionSheetDto psychologicalEvolutionSheetDto) {
    Optional<PsychologicalEvolutionSheetModel> psychologicalEvolutionSheetModelOptional = psychologicalEvolutionSheetService
        .findById(id);
    if (!psychologicalEvolutionSheetModelOptional.isPresent())
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found.");

    PsychologicalEvolutionSheetModel studentModel = new PsychologicalEvolutionSheetModel();
    BeanUtils.copyProperties(psychologicalEvolutionSheetDto, studentModel);
    studentModel.setId(psychologicalEvolutionSheetModelOptional.get().getId());
    studentModel.setDateMedicalAppointment(psychologicalEvolutionSheetModelOptional.get().getDateMedicalAppointment());

    return ResponseEntity.status(HttpStatus.OK).body(psychologicalEvolutionSheetService.save(studentModel));
  }
}
