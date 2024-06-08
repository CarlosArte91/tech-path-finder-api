package com.projects.techjobsoffers.service;

import com.projects.techjobsoffers.model.entity.Technology;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ITechnology {

    Iterable<Technology> findAll();
    Page<Technology> findByPage(Pageable pageable);
    Technology findById(Integer id);
    Technology save(Technology technology);
    void delete(Technology technology);

}
