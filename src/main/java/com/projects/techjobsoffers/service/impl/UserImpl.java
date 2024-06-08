package com.projects.techjobsoffers.service.impl;

import com.projects.techjobsoffers.model.dao.UserDao;
import com.projects.techjobsoffers.model.entity.User;
import com.projects.techjobsoffers.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserImpl implements IUser {

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    @Override
    public Iterable<User> findAll() {
        return userDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public User findById(Integer id) {
        return userDao.findById(id).orElse(null);
    }

    @Transactional()
    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Transactional
    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public User byEmailAndPassword(String email, String password) {
        return userDao.findByEmailAndPassword(email, password);
    }

}
