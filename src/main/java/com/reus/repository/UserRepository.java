package com.reus.repository;

import org.springframework.data.repository.CrudRepository;

import com.reus.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
