package com.example.githubcopilot_joiners.Service;

import com.example.githubcopilot_joiners.Model.Employee;

import java.util.List;
import java.util.Optional;

public interface Empservice {

    public Employee saveEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public Employee getEmployeeById(int id);
    public void deleteEmployeeById(int id);

    List<Employee> getAllEmployee();

   public String removeEmployee(int id);

    public Object addEmployee(Employee employee);

    public Optional<Employee> FindEmployeeById(int id);

    public List<Employee> FindAllEmployees();
}
