package com.projects.techjobsoffers.service;

import com.projects.techjobsoffers.model.entity.Offer;

import java.util.List;

public interface IOffer {

    Iterable<Offer> findAll();
    List<Offer> findByKeyword(String keyword);
    Offer findById(String id);
    Offer save(Offer offer);
    void delete(Offer offer);

}
