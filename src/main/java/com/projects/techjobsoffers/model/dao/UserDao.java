package com.projects.techjobsoffers.model.dao;

import com.projects.techjobsoffers.model.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {
    User findByEmailAndPassword(String email, String password);
}
