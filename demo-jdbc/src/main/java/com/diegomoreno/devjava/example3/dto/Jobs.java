package com.diegomoreno.devjava.example3.dto;

public class Jobs {
    private Integer id;
    private String title;
    private Double minSalary;
    private Double maxsalary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Double minSalary) {
        this.minSalary = minSalary;
    }

    public Double getMaxsalary() {
        return maxsalary;
    }

    public void setMaxsalary(Double maxsalary) {
        this.maxsalary = maxsalary;
    }

    @Override
    public String toString() {
        return "Jobs [id=" + id + ", maxsalary=" + maxsalary + ", minSalary=" + minSalary + ", title=" + title + "]";
    }

    

}
