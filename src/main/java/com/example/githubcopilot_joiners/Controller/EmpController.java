package com.example.githubcopilot_joiners.Controller;


import com.example.githubcopilot_joiners.Model.Employee;
import com.example.githubcopilot_joiners.ServiceImpl.EmpServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/employee")
public class EmpController {

   @Autowired
    private EmpServiceImpl empservice;

    @GetMapping("/home")
    public String homepage() {

        return "welcome to home page";
    }

    @PostMapping("/addEmp")
    public ResponseEntity<Employee> addEmployees(@RequestBody @Valid Employee employee){
    Employee emp = empservice.addEmployee(employee);

    return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);

    }

    @GetMapping("/allEmp")
    public ResponseEntity<List<Employee>> listOfEmployee(){
        List<Employee> allEmployee = empservice.getAllEmployee();

        return new ResponseEntity<List<Employee>>(allEmployee, HttpStatus.ACCEPTED);
    }

    @GetMapping("/findEmp/{id}")
    public ResponseEntity<Optional<Employee>> findById(@PathVariable int id){

        Optional<Employee> empByID = empservice.FindEmployeeById(id);

        return new ResponseEntity<Optional<Employee>>(empByID,HttpStatus.ACCEPTED);

    }

    @GetMapping("/findallEmp")
    public ResponseEntity<List<Employee>> findAllEmployee(){
        List<Employee> allEmployee = empservice.FindAllEmployees();

        return new ResponseEntity<List<Employee>>(allEmployee, HttpStatus.ACCEPTED);
    }

    @PutMapping("/updateEmp/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id,@RequestBody Employee employee){

        employee.setEid(id);

        Employee emp = empservice.updateEmployee(employee);

        return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
    }

    @DeleteMapping("/removeEmp/{id}")
    public ResponseEntity<String> removeEmployee(@PathVariable int id){

        empservice.removeEmployee(id);
        return new ResponseEntity<String>("Remove Employee successfully",HttpStatus.ACCEPTED);
    }




}
