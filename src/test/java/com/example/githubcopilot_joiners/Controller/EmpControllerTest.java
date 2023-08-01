package com.example.githubcopilot_joiners.Controller;

import com.example.githubcopilot_joiners.ServiceImpl.EmpServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class EmpControllerTest{

    @BeforeEach
    void setUp() {

    }

    @Test
    void test1() throws Exception {
        System.out.println("Hello Test");
    }

    @Test
    void addEmployees() throws Exception {


    }
    @Test
    void updateEmployee() throws Exception {
        String json = "{\"id\":1,\"name\":\"\",\"age\":20,\"salary\":20000,\"address\":\"\"}";
        if (json.contains("name") && json.contains("address")) {
            if (json.contains("age") && json.contains("salary")) {
                System.out.println("Employee is updated");
            } else {
                System.out.println("Employee is not updated");
            }
        } else {
            System.out.println("Employee is not updated");
        }

    }

    @Test
    void deleteEmployee() throws Exception {
        String json = "{\"id\":1,\"name\":\"\",\"age\":20,\"salary\":20000,\"address\":\"\"}";
        if (json.contains("name") && json.contains("address")) {
            if (json.contains("age") && json.contains("salary")) {
                System.out.println("Employee is deleted");
            } else {
                System.out.println("Employee is not deleted");
            }
        } else {
            System.out.println("Employee is not deleted");
        }

    }

    @Test
    void getEmployeeById() throws Exception {
        String json = "{\"id\":1,\"name\":\"\",\"age\":20,\"salary\":20000,\"address\":\"\"}";
        if (json.contains("name") && json.contains("address")) {
            if (json.contains("age") && json.contains("salary")) {
                System.out.println("Employee is get by id");
            } else {
                System.out.println("Employee is not get by id");
            }
        } else {
            System.out.println("Employee is not get by id");
        }
    }
}