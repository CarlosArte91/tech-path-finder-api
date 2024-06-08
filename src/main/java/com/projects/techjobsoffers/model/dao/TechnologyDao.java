package com.projects.techjobsoffers.model.dao;

import com.projects.techjobsoffers.model.entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TechnologyDao extends JpaRepository<Technology, Integer> {
}
