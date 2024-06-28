package com.fts.fts_user.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fts.fts_user.entities.User;
import com.fts.fts_user.services.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {

  @Autowired
  private UserService service;

  @GetMapping(value = "/{userId}")
  public ResponseEntity<User> GetById(@PathVariable Long userId) {
    return ResponseEntity.ok(service.getUserById(userId));
  }

  @GetMapping(value = "/search")
  public ResponseEntity<User> GetById(@RequestParam String email) {
    return ResponseEntity.ok(service.getUserByEmail(email));
  }

}
