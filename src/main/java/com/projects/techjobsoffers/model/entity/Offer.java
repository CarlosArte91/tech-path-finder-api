package com.projects.techjobsoffers.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "offers")
public class Offer implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "title")
    private String title;

    @Column(name = "subtitle")
    private String subtitle;

    @Column(name = "industry")
    private String industry;

    @Column(name = "keywords")
    private String keywords;

    @Column(name = "salary")
    private String salary;

    @Column(name = "contract_type")
    private String contractType;

    @Column(name = "employment_type")
    private String employmentType;

    @Column(name = "work_schedule")
    private String workSchedule;

    @Column(name = "company_link")
    private String companyLink;

    @Column(name = "url")
    private String url;

    @Column(name = "description")
    private String description;

    @Column(name = "date_created")
    private Date dateCreated;

}
