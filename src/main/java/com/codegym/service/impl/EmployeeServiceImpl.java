package com.codegym.service.impl;

import com.codegym.model.Department;
import com.codegym.model.Employee;
import com.codegym.repository.EmployRepository;
import com.codegym.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployRepository employRepository;

    @Override
    public Iterable<Employee> findAllByDepartment(Department department) {
        return employRepository.findAllByDepartment(department);
    }

    @Override
    public Page<Employee> findAllByFirstNameContaining(String s, Pageable pageable) {
            return null;
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employRepository.findAll(pageable);
    }

    @Override
    public Employee findById(Long id) {
        return employRepository.findOne(id);
    }

    @Override
    public void save(Employee employee) {
        employRepository.save(employee);
    }

    @Override
    public void remove(Long id) {
        employRepository.delete(id);
    }
}
