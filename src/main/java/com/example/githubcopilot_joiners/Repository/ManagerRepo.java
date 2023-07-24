package com.example.githubcopilot_joiners.Repository;

import com.example.githubcopilot_joiners.Model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagerRepo extends JpaRepository<Manager, Integer> {

}
