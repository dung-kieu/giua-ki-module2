package com.codegym.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nameEmployee;
    private LocalDate birthDate;
    private String address;
    private String salary;

    @ManyToOne
    @JoinColumn(name = "Department_id")
    private Department department;

    public Employee(){}

    public Employee(String nameEmployee, LocalDate birthDate) {
        this.nameEmployee = nameEmployee;
        this.birthDate = birthDate;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
