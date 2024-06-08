package com.projects.techjobsoffers.service.impl;

import com.projects.techjobsoffers.model.dao.TechnologyDao;
import com.projects.techjobsoffers.model.entity.Technology;
import com.projects.techjobsoffers.service.ITechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TechnologyImpl implements ITechnology {

    @Autowired
    private TechnologyDao technologyDao;

    @Transactional(readOnly = true)
    @Override
    public Iterable<Technology> findAll() {
        return technologyDao.findAll();
    }

    @Override
    public Page<Technology> findByPage(Pageable pageable) {
        return technologyDao.findAll(pageable);
    }

    @Transactional(readOnly = true)
    @Override
    public Technology findById(Integer id) {
        return technologyDao.findById(id).orElse(null);
    }

    @Transactional()
    @Override
    public Technology save(Technology technology) {
        return technologyDao.save(technology);
    }

    @Transactional()
    @Override
    public void delete(Technology technology) {
        technologyDao.delete(technology);
    }
}
