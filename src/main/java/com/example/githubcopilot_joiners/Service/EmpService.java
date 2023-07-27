package com.example.githubcopilot_joiners.Service;

import com.example.githubcopilot_joiners.Model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmpService {

    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployee();
    String removeEmployee(int id);

    Object addEmployee(Employee employee);

    Optional<Employee> findEmployeeById(int id);

}
