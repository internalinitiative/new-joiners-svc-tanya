package com.example.githubcopilot_joiners.ServiceImpl;

import com.example.githubcopilot_joiners.Exception.ResourceNotFoundException;
import com.example.githubcopilot_joiners.Model.Manager;
import com.example.githubcopilot_joiners.Repository.ManagerRepo;
import com.example.githubcopilot_joiners.Service.Managerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManagerServiceImpl implements Managerservice {

    @Autowired
    private ManagerRepo managerRepo;

    @Override
    public Manager savemanager(Manager manager) {
        return managerRepo.save(manager);
    }


    @Override
    public Manager updatemanager(Manager manager) {
        Optional<Manager> empdb = this.managerRepo.findById(manager.getMid());
        if(empdb.isPresent()){
            Manager empUpdt = empdb.get();
            empUpdt.setMid(manager.getMid());
            empUpdt.setMemail(manager.getMemail());
            empUpdt.setMname(manager.getMname());
            empUpdt.setMsalary(manager.getMsalary());
            empUpdt.setMphonr(manager.getMphonr());
            empUpdt.setMaddress(manager.getMaddress());
            return empUpdt;
        }
        else
        {
            throw new ResourceNotFoundException("Record not found with id : " + manager.getMid());
        }
    }

    @Override
    public Manager getmanagerById(int id) {
        return null;
    }

    @Override
    public void deletemanagerById(int id) {

    }

    @Override
    public Optional<Manager> FindmanagerById(int id) {
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
    public List<Manager> FindAllmanager() {
        return managerRepo.findAll();
    }

    @Override
    public List<Manager> getAllmanager() {
        return managerRepo.findAll();
    }

    @Override
    public Manager addmanager(Manager manager) {
        return managerRepo.save(manager);
    }

    @Override
    public String removemanager(int id) {
        managerRepo.deleteById(id);
        return "Manager removed !! " + id;
    }
}