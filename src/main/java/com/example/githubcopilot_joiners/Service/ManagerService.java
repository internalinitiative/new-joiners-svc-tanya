package com.example.githubcopilot_joiners.Service;

import com.example.githubcopilot_joiners.Model.Manager;

import java.util.List;
import java.util.Optional;

public interface ManagerService {
    Manager saveManager(Manager manager);
    Manager updateManager(Manager manager);
    Manager getManagerById(int id);
    List<Manager> getAllManager();
    Optional<Manager> findManagerById(int id);
    Manager addManager(Manager manager);
    String removeManager(int id);



}
