package com.example.githubcopilot_joiners.Service;

import com.example.githubcopilot_joiners.Model.Manager;

import java.util.List;
import java.util.Optional;

public interface Managerservice {
    public Manager savemanager(Manager manager);
    public Manager updatemanager(Manager manager);
    public Manager getmanagerById(int id);
    public List<Manager> getAllmanager();
    public Optional<Manager> FindmanagerById(int id);
    public Manager addmanager(Manager manager);
    public String removemanager(int id);



}
