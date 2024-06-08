package com.projects.techjobsoffers.service.impl;

import com.projects.techjobsoffers.model.dao.CategoryDao;
import com.projects.techjobsoffers.model.entity.Category;
import com.projects.techjobsoffers.service.ICategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryImpl implements ICategory {

    @Autowired
    private CategoryDao categoryDao;

    @Transactional(readOnly = true)
    @Override
    public Iterable<Category> findAll() {
        return categoryDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Category findById(Integer id) {
        return categoryDao.findById(id).orElse(null);
    }

    @Transactional()
    @Override
    public Category save(Category category) {
        return categoryDao.save(category);
    }

    @Transactional()
    @Override
    public void delete(Category category) {
        categoryDao.delete(category);
    }
}
