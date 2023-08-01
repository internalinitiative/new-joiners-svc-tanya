package com.example.githubcopilot_joiners.ServiceImpl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpServiceImplTest {

    EmpServiceImpl empServiceImpl = new EmpServiceImpl();

    @Test
    void updateEmployeeTest() {
        assertEquals(empServiceImpl.updateEmployee(), "Employee Updated");
    }

    @Test
    void getEmployeeByIdTest() {
        assertEquals(empServiceImpl.getEmployeeById(), "Employee Found");
    }

    @Test
    void getAllEmployeeTest() {
        assertEquals(empServiceImpl.getAllEmployee(), "Employee List");
    }

    @Test
    void removeEmployeeTest() {
        assertEquals(empServiceImpl.removeEmployee(), "Employee Removed");
    }

    @Test
    void addEmployeeTest() {
        assertEquals(empServiceImpl.addEmployee(), "Employee Added");
    }


}