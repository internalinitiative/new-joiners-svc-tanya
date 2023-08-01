package com.example.githubcopilot_joiners.Model;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotBlank(message = "Please enter name")
    private String name;
    @Email(message = "Please enter valid email", regexp="^[a-zA-Z0-9_! #$%&'*+/=?`{|}~^. -]+@[a-zA-Z0-9. -]+$")
    @NotBlank(message = "Please enter email")
    private String email;
    @Digits(integer = 10, fraction = 0, message = "Please enter valid phone number")
    private String contactnumber;
    @NotNull(message = "Please enter salary")
    @Digits(integer = 10, fraction = 0, message = "Please enter valid salary")
    private String salary;

}
