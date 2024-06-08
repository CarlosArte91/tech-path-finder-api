package com.projects.techjobsoffers.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "technologies")
public class Technology implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "average_salary")
    private Double averageSalary;

    @Column(name = "highest_salary")
    private Double highestSalary;

    @Column(name = "lowest_salary")
    private Double lowestSalary;

    @Column(name = "total_offers")
    private Integer totalOffers;

}
