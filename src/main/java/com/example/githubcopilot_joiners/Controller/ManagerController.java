package com.example.githubcopilot_joiners.Controller;

import com.example.githubcopilot_joiners.Model.Manager;
import com.example.githubcopilot_joiners.ServiceImpl.ManagerServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Manager")
public class ManagerController {

    @Autowired
    private ManagerServiceImpl managerService;

    @PostMapping
    public ResponseEntity<Manager> addManager(@Valid @RequestBody Manager manager){
        manager = managerService.addmanager(manager);
        return new ResponseEntity<Manager>(manager, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Manager>> listOfManager(){
        List<Manager> allManager = managerService.getAllmanager();
        return new ResponseEntity<List<Manager>>(allManager, HttpStatus.ACCEPTED);
    }

    @GetMapping("/findManager/{id}")
    public ResponseEntity<Optional<Manager>> findById(@PathVariable int id){
        Optional<Manager> managerByID = managerService.FindmanagerById(id);
        return new ResponseEntity<Optional<Manager>>(managerByID,HttpStatus.ACCEPTED);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Manager> updateManager(@PathVariable int id, @RequestBody Manager manager){
        manager = managerService.updatemanager(manager);
        return new ResponseEntity<Manager>(manager, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteManager(@PathVariable int id){
        managerService.removemanager(id);
        return new ResponseEntity<String>("Remove Manager successfully",HttpStatus.ACCEPTED);
    }


}
