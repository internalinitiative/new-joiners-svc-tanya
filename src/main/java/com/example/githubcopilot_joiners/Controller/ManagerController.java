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
@CrossOrigin(origins = "http://3.93.13.154:8080")
@RequestMapping("/Manager")
public class ManagerController {

    @Autowired
    private ManagerServiceImpl managerService;

    @PostMapping
    public ResponseEntity<Manager> addManager(@Valid @RequestBody Manager manager){
        manager = managerService.addManager(manager);
        return new ResponseEntity<Manager>(manager, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Manager>> listOfManager(){
        List<Manager> allManager = managerService.getAllManager();
        return new ResponseEntity<List<Manager>>(allManager, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Manager>> findById(@PathVariable int id){
        Optional<Manager> managerByID = managerService.findManagerById(id);
        return new ResponseEntity<Optional<Manager>>(managerByID,HttpStatus.ACCEPTED);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Manager> updateManager(@PathVariable int id, @RequestBody Manager manager){
        manager = managerService.updateManager(manager);
        return new ResponseEntity<Manager>(manager, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteManager(@PathVariable int id){
        managerService.removeManager(id);
        return new ResponseEntity<String>("Remove Manager successfully",HttpStatus.ACCEPTED);
    }


}
