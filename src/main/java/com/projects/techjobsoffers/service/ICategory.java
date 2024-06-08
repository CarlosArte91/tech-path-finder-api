package com.projects.techjobsoffers.service;

import com.projects.techjobsoffers.model.entity.Category;

public interface ICategory {

    Iterable<Category> findAll();
    Category findById(Integer id);
    Category save(Category category);
    void delete(Category category);

}
