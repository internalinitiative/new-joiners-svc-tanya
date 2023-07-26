package com.example.githubcopilot_joiners.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer mid;
    @NotBlank(message = "Please enter name")
    private String mname;
    @NotBlank(message = "Please enter email")
    @Email(message = "Please enter valid email", regexp="^[a-zA-Z0-9_! #$%&'*+/=?`{|}~^. -]+@[a-zA-Z0-9. -]+$")
    private String memail;
    @NotBlank(message = "Please enter address")
    private String maddress;
    @NotBlank(message = "Please enter phone number")
    @Digits(integer = 10, fraction = 0, message = "Please enter valid phone number")
    private String mphonr;
    @Digits(integer = 10, fraction = 0, message = "Please enter valid salary")
    private int msalary;

}
