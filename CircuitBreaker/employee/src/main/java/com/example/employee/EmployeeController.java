package com.example.employee;

import com.example.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private NameService nameService;

    @GetMapping("/api/employee")
    public Employee getEmployee(){

        Employee emp = new Employee();

        String name  = nameService.callNameService();
        emp.setName(name);
        emp.setSalary(10000);
        return emp;
    }
}
