package com.example.githubcopilot_joiners.Controller;


import com.example.githubcopilot_joiners.Model.Employee;
import com.example.githubcopilot_joiners.ServiceImpl.EmpServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://3.93.13.154:8080")
@RequestMapping("/employee")
public class EmpController {

    private EmpServiceImpl empService;
    @Autowired
    public EmpController(EmpServiceImpl empService) {
        this.empService = empService;
    }

    @GetMapping("/test")
    public String test(){
        return "Test";
    }


    @PostMapping
    public ResponseEntity<Employee> addEmployees(@RequestBody @Valid Employee employee){
    Employee emp = empService.addEmployee(employee);

    return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<Employee>> listOfEmployee(){
        List<Employee> allEmployee = empService.getAllEmployee();

        return new ResponseEntity<List<Employee>>(allEmployee, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Employee>> findById(@PathVariable int id){

        Optional<Employee> empByID = empService.findEmployeeById(id);

        return new ResponseEntity<Optional<Employee>>(empByID,HttpStatus.ACCEPTED);

    }


    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id,@RequestBody Employee employee){

        Employee emp = empService.updateEmployee(employee);

        return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeEmployee(@PathVariable int id){

        empService.removeEmployee(id);
        return new ResponseEntity<String>("Remove Employee successfully",HttpStatus.ACCEPTED);
    }



}
