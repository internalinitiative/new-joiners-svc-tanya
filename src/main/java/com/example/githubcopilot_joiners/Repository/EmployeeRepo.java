package com.example.githubcopilot_joiners.Repository;

import com.example.githubcopilot_joiners.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
