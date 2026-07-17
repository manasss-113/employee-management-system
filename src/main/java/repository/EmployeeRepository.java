package com.manasa.employeemanagementsystem.repository;

import com.manasa.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartment(String department);

    List<Employee> findByNameContainingIgnoreCase(String name);

    Optional<Employee> findByEmail(String email);

}