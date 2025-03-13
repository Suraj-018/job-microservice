package com.example.jobms.job.dto;

import com.example.jobms.job.external.Company;
import com.example.jobms.job.external.Review;

import java.util.List;

public class JobDTO {
    private Long id;
    private String title;
    private String description;
    private String salary;
    private String location;
    private Company company;
    private List<Review> reviews;

    public JobDTO() {
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public JobDTO setReviews(List<Review> reviews) {
        this.reviews = reviews;
        return this;
    }

    public Long getId() {
        return id;
    }

    public JobDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public JobDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public JobDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getSalary() {
        return salary;
    }

    public JobDTO setSalary(String salary) {
        this.salary = salary;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public JobDTO setLocation(String location) {
        this.location = location;
        return this;
    }

    public JobDTO(Long id, String title, String description, String salary, String location, Company company, List<Review> review) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.salary = salary;
        this.location = location;
        this.company = company;
        this.reviews = review;
    }

    public Company getCompany() {
        return company;
    }

    public JobDTO setCompany(Company company) {
        this.company = company;
        return this;
    }
}
