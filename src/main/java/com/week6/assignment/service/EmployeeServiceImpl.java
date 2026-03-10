package com.week6.assignment.service;

import com.week6.assignment.entity.EmployeeData;
import com.week6.assignment.exception.EmployeeNotFoundException;
import com.week6.assignment.repository.EmployeeDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDataRepository employeeRepoObject;

    public EmployeeServiceImpl(EmployeeDataRepository employeeRepoObject) {
        this.employeeRepoObject = employeeRepoObject;
    }

    @Override
    public EmployeeData addNewEmployee(EmployeeData empObj) {

        return employeeRepoObject.save(empObj);
    }

    @Override
    public List<EmployeeData> getAllEmployeeData() {

        return employeeRepoObject.findAll();
    }

    @Override
    public EmployeeData getEmployeeByIdNumber(int someRandomId) {

        return employeeRepoObject.findById(someRandomId)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found bro"));
    }

    @Override
    public List<EmployeeData> getEmployeeByDeptName(String deptName) {

        return employeeRepoObject.findByDepartmentNameWorking(deptName);
    }

    @Override
    public List<EmployeeData> getEmployeeSalaryGreater(double salary) {

        return employeeRepoObject.findByEmployeeSalaryAmountGreaterThan(salary);
    }

    @Override
    public EmployeeData updateEmployeeData(EmployeeData empDataObj) {

        return employeeRepoObject.save(empDataObj);
    }

    @Override
    public void deleteEmployeeUsingId(int idNumber) {

        employeeRepoObject.deleteById(idNumber);
    }
}