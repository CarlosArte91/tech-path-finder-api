package com.projects.techjobsoffers.controller;

import com.projects.techjobsoffers.model.entity.Offer;
import com.projects.techjobsoffers.model.entity.Technology;
import com.projects.techjobsoffers.service.ITechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TechnologyController {

    @Autowired
    private ITechnology technilogyService;

    @GetMapping("technologies")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Technology> index() {
        return technilogyService.findAll();
    }

    @GetMapping("technologies-pages")
    @ResponseStatus(HttpStatus.OK)
    public Page<Technology> pageTechnologies(Pageable pageable) {
        return technilogyService.findByPage(pageable);
    }

    @GetMapping("/technology/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Technology show(@PathVariable Integer id) {
        return technilogyService.findById(id);
    }

    @PostMapping("technology")
    @ResponseStatus(HttpStatus.CREATED)
    public Technology create(@RequestBody Technology technology) {
        return technilogyService.save(technology);
    }

    @PutMapping("technology")
    @ResponseStatus(HttpStatus.CREATED)
    public Technology update(@RequestBody Technology technology) {
        return technilogyService.save(technology);
    }

    @DeleteMapping("technology/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        Technology technologyToDelete = technilogyService.findById(id);
        technilogyService.delete(technologyToDelete);
    }

}
