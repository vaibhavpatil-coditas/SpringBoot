package com.week6.assignment.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "employee_table_data")
public class EmployeeData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empIdNumber;

    @NotBlank(message = "first name required bro")
    private String firstNameEmployee;

    @NotBlank(message = "last name required bro")
    private String lastNameEmployee;

    @Column(unique = true)
    @Email
    private String employeeEmailAddress;

    private String departmentNameWorking;

    @Positive(message = "salary must be positive")
    private double employeeSalaryAmount;

    public EmployeeData() {
    }

    public EmployeeData(String firstNameEmployee, String lastNameEmployee,
                        String employeeEmailAddress, String departmentNameWorking,
                        double employeeSalaryAmount) {

        this.firstNameEmployee = firstNameEmployee;
        this.lastNameEmployee = lastNameEmployee;
        this.employeeEmailAddress = employeeEmailAddress;
        this.departmentNameWorking = departmentNameWorking;
        this.employeeSalaryAmount = employeeSalaryAmount;
    }

    public int getEmpIdNumber() {
        return empIdNumber;
    }

    public void setEmpIdNumber(int empIdNumber) {
        this.empIdNumber = empIdNumber;
    }

    public String getFirstNameEmployee() {
        return firstNameEmployee;
    }

    public void setFirstNameEmployee(String firstNameEmployee) {
        this.firstNameEmployee = firstNameEmployee;
    }

    public String getLastNameEmployee() {
        return lastNameEmployee;
    }

    public void setLastNameEmployee(String lastNameEmployee) {
        this.lastNameEmployee = lastNameEmployee;
    }

    public String getEmployeeEmailAddress() {
        return employeeEmailAddress;
    }

    public void setEmployeeEmailAddress(String employeeEmailAddress) {
        this.employeeEmailAddress = employeeEmailAddress;
    }

    public String getDepartmentNameWorking() {
        return departmentNameWorking;
    }

    public void setDepartmentNameWorking(String departmentNameWorking) {
        this.departmentNameWorking = departmentNameWorking;
    }

    public double getEmployeeSalaryAmount() {
        return employeeSalaryAmount;
    }

    public void setEmployeeSalaryAmount(double employeeSalaryAmount) {
        this.employeeSalaryAmount = employeeSalaryAmount;
    }
}