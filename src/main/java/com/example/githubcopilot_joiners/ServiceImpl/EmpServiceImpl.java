package com.example.githubcopilot_joiners.ServiceImpl;

import com.example.githubcopilot_joiners.Model.Employee;
import com.example.githubcopilot_joiners.Repository.EmployeeRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.githubcopilot_joiners.Service.Empservice;
import com.example.githubcopilot_joiners.Exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;


import java.util.List;
import java.util.Optional;
@Service
public class EmpServiceImpl implements Empservice   {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Optional<Employee> empdb = this.employeeRepo.findById(employee.getEid());
        if(empdb.isPresent()){
            Employee empUpdt = empdb.get();
            empUpdt.setEid(employee.getEid());
            empUpdt.setEemail(employee.getEemail());
            empUpdt.setEname(employee.getEname());
            empUpdt.setEsalary(employee.getEsalary());
            empUpdt.setEphonr(employee.getEphonr());
            empUpdt.setEaddress(employee.getEaddress());
            return empUpdt;
        }
            else
            {
                throw new ResourceNotFoundException("Record not found with id : " + employee.getEid());
            }

    }



        @Override
        public Employee getEmployeeById(int id) {
            return null;
        }

        @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }


    @Override
    public String removeEmployee(int id) {
        employeeRepo.deleteById(id);
        return "Employee deleted successfully";
    }

       @Override
    public Optional<Employee> FindEmployeeById(int id) {
           Optional<Employee> emp = employeeRepo.findById(id);
           if (emp.isPresent())
               return emp;
           else
               return null;
       }
        @Override
    public Employee addEmployee(Employee employee) {
            employee = employeeRepo.save(employee);
           return employee;

        }


}



