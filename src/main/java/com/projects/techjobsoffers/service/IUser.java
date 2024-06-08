package com.projects.techjobsoffers.service;

import com.projects.techjobsoffers.model.entity.User;

public interface IUser {

    Iterable<User> findAll();
    User findById(Integer id);
    User save(User user);
    void delete(User user);
    User byEmailAndPassword(String email, String password);

}
