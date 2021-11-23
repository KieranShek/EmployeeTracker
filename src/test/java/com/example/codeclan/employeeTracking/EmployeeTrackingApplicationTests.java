package com.example.codeclan.employeeTracking;

import com.example.codeclan.employeeTracking.models.Employee;
import com.example.codeclan.employeeTracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackingApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void canCreateEmployee() {
        Employee employee1 = new Employee("Kieran", 21, 99999, "kieranshek@gmail.com");
        employeeRepository.save(employee1);
    }

}
