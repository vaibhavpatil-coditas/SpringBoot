package com.week6.assignment.controller;

import com.week6.assignment.entity.EmployeeData;
import com.week6.assignment.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeServiceObj;

    public EmployeeRestController(EmployeeService employeeServiceObj) {
        this.employeeServiceObj = employeeServiceObj;
    }

    @PostMapping("/employees")
    public EmployeeData createEmployee(@Valid @RequestBody EmployeeData empObj) {

        return employeeServiceObj.addNewEmployee(empObj);
    }

    @GetMapping("/employees")
    public List<EmployeeData> getAllEmployees() {

        return employeeServiceObj.getAllEmployeeData();
    }

    @GetMapping("/employees/{id}")
    public EmployeeData getEmployee(@PathVariable int id) {

        return employeeServiceObj.getEmployeeByIdNumber(id);
    }

    @GetMapping("/employees/department/{dept}")
    public List<EmployeeData> getByDepartment(@PathVariable String dept) {

        return employeeServiceObj.getEmployeeByDeptName(dept);
    }

    @GetMapping("/employees/salary/{amount}")
    public List<EmployeeData> getBySalary(@PathVariable double amount) {

        return employeeServiceObj.getEmployeeSalaryGreater(amount);
    }

    @PutMapping("/employees")
    public EmployeeData updateEmployee(@RequestBody EmployeeData emp) {

        return employeeServiceObj.updateEmployeeData(emp);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {

        employeeServiceObj.deleteEmployeeUsingId(id);

        return "Employee deleted successfully bro";
    }
}