package com.codegym.repository;

import com.codegym.model.Department;
import com.codegym.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployRepository extends PagingAndSortingRepository<Employee , Long> {
    Iterable<Employee> findAllByDepartment(Department department);
}
