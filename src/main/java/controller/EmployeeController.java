package com.manasa.employeemanagementsystem.controller;


import com.manasa.employeemanagementsystem.entity.Employee;
import com.manasa.employeemanagementsystem.repository.EmployeeRepository;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/employees")
public class EmployeeController {


    private final EmployeeRepository employeeRepository;



    public EmployeeController(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }




    // Get all employees
    @GetMapping
    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }





    // Get employee by id
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(
            @PathVariable Long id) {


        return employeeRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }





    // Add employee
    @PostMapping
    public Employee addEmployee(
            @Valid @RequestBody Employee employee) {


        return employeeRepository.save(employee);

    }





    // Update employee
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable Long id,
            @Valid @RequestBody Employee employee) {


        return employeeRepository.findById(id)
                .map(existing -> {


                    existing.setName(employee.getName());
                    existing.setEmail(employee.getEmail());
                    existing.setDepartment(employee.getDepartment());
                    existing.setSalary(employee.getSalary());


                    return ResponseEntity.ok(
                            employeeRepository.save(existing)
                    );


                })
                .orElse(ResponseEntity.notFound().build());

    }





    // Delete employee
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(
            @PathVariable Long id) {


        employeeRepository.deleteById(id);


        return ResponseEntity.ok(
                "Employee deleted successfully"
        );
    }

}