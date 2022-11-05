package com.avengers.psychological_scheduling.controllers;

import javax.validation.Valid;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.avengers.psychological_scheduling.models.users.UserModel;

public interface UserController<T extends UserModel> {
  @PostMapping
  public ResponseEntity<Object> addUserToSystem(@RequestBody @Valid T user);

  @GetMapping
  public ResponseEntity<Object> searchAllUser(
      @PageableDefault(page = 0, size = 10, sort = "registration", direction = Sort.Direction.ASC) Pageable pageable);

  @GetMapping("/{id}")
  public ResponseEntity<Object> searchAllUserByRegistration(@PathVariable(value = "registration") int registration);

  @PutMapping("/{id}")
  public ResponseEntity<Object> updateDataOfUser(@PathVariable(value = "registration") int registration,
      @RequestBody @Valid T user);

}
