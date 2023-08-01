package com.example.githubcopilot_joiners.ServiceImpl;

import com.example.githubcopilot_joiners.Model.Employee;
import com.example.githubcopilot_joiners.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.githubcopilot_joiners.Service.EmpService;
import com.example.githubcopilot_joiners.Exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmployeeRepo employeeRepo;


    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Optional<Employee> empdb = this.employeeRepo.findById(employee.getId());
        if(empdb.isPresent()){
            Employee empUpdt = empdb.get();
            empUpdt.setId(employee.getId());
            empUpdt.setEmail(employee.getEmail());
            empUpdt.setName(employee.getName());
            empUpdt.setSalary(employee.getSalary());
            empUpdt.setContactnumber(employee.getContactnumber());
            return employeeRepo.save(empUpdt);
        }
            else
            {
                throw new ResourceNotFoundException("Record not found with id : " + employee.getId());
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
    public Optional<Employee> findEmployeeById(int id) {
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



