package com.projects.techjobsoffers.model.dao;

import com.projects.techjobsoffers.model.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OfferDao extends JpaRepository<Offer, String> {
    @Query("SELECT o FROM Offer o " +
            "WHERE LOWER(o.description) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
            "OR LOWER(o.title) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
            "OR LOWER(o.keywords) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Offer> findByKeyword(@Param("keyword") String keyword);
}
