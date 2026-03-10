package com.week6.assignment.service;

import com.week6.assignment.entity.EmployeeData;

import java.util.List;

public interface EmployeeService {

    EmployeeData addNewEmployee(EmployeeData empObj);

    List<EmployeeData> getAllEmployeeData();

    EmployeeData getEmployeeByIdNumber(int someRandomId);

    List<EmployeeData> getEmployeeByDeptName(String deptName);

    List<EmployeeData> getEmployeeSalaryGreater(double salary);

    EmployeeData updateEmployeeData(EmployeeData empDataObj);

    void deleteEmployeeUsingId(int idNumber);

}