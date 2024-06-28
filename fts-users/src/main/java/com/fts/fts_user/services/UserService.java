package com.fts.fts_user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fts.fts_user.entities.User;
import com.fts.fts_user.repositories.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;

  public User getUserById(Long id) {
    User user = repository.findById(id).get();

    return user;
  }

  public User getUserByEmail(String email) {
    User user = repository.findByEmail(email);

    return user;
  }
}
