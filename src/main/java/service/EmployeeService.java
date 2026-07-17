package com.manasa.employeemanagementsystem.service;


import com.manasa.employeemanagementsystem.entity.Employee;
import com.manasa.employeemanagementsystem.exception.EmployeeNotFoundException;
import com.manasa.employeemanagementsystem.repository.EmployeeRepository;


import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class EmployeeService {



    private final EmployeeRepository employeeRepository;



    public EmployeeService(EmployeeRepository employeeRepository){

        this.employeeRepository = employeeRepository;

    }




    // Get All Employees

    public List<Employee> getAllEmployees(){

        return employeeRepository.findAll();

    }




    // Get Employee By Id

    public Employee getEmployeeById(Long id){


        return employeeRepository.findById(id)

                .orElseThrow(

                        () -> new EmployeeNotFoundException(
                                "Employee with ID " + id + " not found"
                        )

                );

    }





    // Add Employee

    public Employee saveEmployee(Employee employee){

        return employeeRepository.save(employee);

    }




    // Delete Employee

    public void deleteEmployee(Long id){


        Employee employee = getEmployeeById(id);


        employeeRepository.delete(employee);


    }


}