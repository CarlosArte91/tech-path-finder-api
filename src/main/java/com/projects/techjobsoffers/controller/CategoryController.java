package com.projects.techjobsoffers.controller;

import com.projects.techjobsoffers.model.entity.Category;
import com.projects.techjobsoffers.service.ICategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CategoryController {

    @Autowired
    private ICategory categoryService;

    @GetMapping("categories")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Category> index() {
        return categoryService.findAll();
    }

    @GetMapping("category/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Category show(@PathVariable Integer id) {
        return categoryService.findById(id);
    }

    @PostMapping("category")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @PutMapping("category/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Category update(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @DeleteMapping("category/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        Category categoryToDelete = categoryService.findById(id);
        categoryService.delete(categoryToDelete);
    }

}
