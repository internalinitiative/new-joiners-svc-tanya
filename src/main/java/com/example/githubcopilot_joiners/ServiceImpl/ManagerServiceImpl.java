package com.example.githubcopilot_joiners.ServiceImpl;

import com.example.githubcopilot_joiners.Exception.ResourceNotFoundException;
import com.example.githubcopilot_joiners.Model.Manager;
import com.example.githubcopilot_joiners.Repository.ManagerRepo;
import com.example.githubcopilot_joiners.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerRepo managerRepo;

    @Override
    public Manager saveManager(Manager manager) {
        return managerRepo.save(manager);
    }


    @Override
    public Manager updateManager(Manager manager) {
        Optional<Manager> empdb = this.managerRepo.findById(manager.getId());
        if(empdb.isPresent()){
            Manager empUpdt = empdb.get();
            empUpdt.setId(manager.getId());
            empUpdt.setEmail(manager.getEmail());
            empUpdt.setName(manager.getName());
            empUpdt.setContactnumber(manager.getContactnumber());
            empUpdt.setDepartment(manager.getDepartment());
            return empUpdt;
        }
        else
        {
            throw new ResourceNotFoundException("Record not found with id : " + manager.getId());
        }
    }

    @Override
    public Manager getManagerById(int id) {
        return null;
    }

    @Override
    public Optional<Manager> findManagerById(int id) {
        Optional<Manager> manager = managerRepo.findById(id);
        if(manager.isPresent()){
            return manager;
        }
        else
        {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }
    }
    @Override
    public List<Manager> getAllManager() {
        return managerRepo.findAll();
    }

    @Override
    public Manager addManager(Manager manager) {
        manager = managerRepo.save(manager);
        return manager;
    }

    @Override
    public String removeManager(int id) {
        managerRepo.deleteById(id);
        return "Manager removed !! " + id;
    }
}