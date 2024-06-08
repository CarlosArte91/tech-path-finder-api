package com.projects.techjobsoffers.service.impl;

import com.projects.techjobsoffers.model.dao.OfferDao;
import com.projects.techjobsoffers.model.entity.Offer;
import com.projects.techjobsoffers.service.IOffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OfferImpl implements IOffer {

    @Autowired
    private OfferDao offerDao;

    @Transactional(readOnly = true)
    @Override
    public Iterable<Offer> findAll() {
        return offerDao.findAll();
    }

    @Override
    public List<Offer> findByKeyword(String keyword) {
        return offerDao.findByKeyword(keyword);
    }

    @Transactional(readOnly = true)
    @Override
    public Offer findById(String id) {
        return offerDao.findById(id).orElse(null);
    }

    @Transactional()
    @Override
    public Offer save(Offer offer) {
        return offerDao.save(offer);
    }

    @Transactional()
    @Override
    public void delete(Offer offer) {
        offerDao.delete(offer);
    }
}
