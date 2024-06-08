package com.projects.techjobsoffers.controller;

import com.projects.techjobsoffers.model.entity.Offer;
import com.projects.techjobsoffers.service.IOffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OfferController {

    @Autowired
    private IOffer offerService;

    @GetMapping("offers")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Offer> index() {
        return offerService.findAll();
    }

    @GetMapping("search-offers")
    @ResponseStatus(HttpStatus.OK)
    public List<Offer> byKeyword(@RequestParam String keyword) {
        return offerService.findByKeyword(keyword);
    }

    @GetMapping("offer/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Offer show(@PathVariable String id) {
        return offerService.findById(id);
    }

    @PostMapping("offer")
    @ResponseStatus(HttpStatus.CREATED)
    public Offer create(@RequestBody Offer offer) {
        return offerService.save(offer);
    }

    @PutMapping("offer")
    @ResponseStatus(HttpStatus.CREATED)
    public Offer update(@RequestBody Offer offer) {
        return offerService.save(offer);
    }

    @DeleteMapping("offer/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        Offer offerToDelete = offerService.findById(id);
        offerService.delete(offerToDelete);
    }

}
