package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameDepartment;

    @OneToMany(targetEntity = Employee.class)
    private List<Employee> employees;

    public Department(){

    }

    public Department(String nameDepartment, List<Employee> employees) {
        this.nameDepartment = nameDepartment;
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
