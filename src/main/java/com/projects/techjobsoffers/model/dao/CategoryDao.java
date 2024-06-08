package com.projects.techjobsoffers.model.dao;

import com.projects.techjobsoffers.model.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDao extends CrudRepository<Category, Integer> {
}
