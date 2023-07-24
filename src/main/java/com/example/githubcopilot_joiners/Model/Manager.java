package com.example.githubcopilot_joiners.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer mid;
    private String mname;
    private String memail;
    private String maddress;
    private String mphonr;
    private int msalary;

}
