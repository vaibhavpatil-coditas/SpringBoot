package com.week6.assignment.repository;

import com.week6.assignment.entity.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDataRepository extends JpaRepository<EmployeeData, Integer> {

    List<EmployeeData> findByDepartmentNameWorking(String deptName);

    List<EmployeeData> findByEmployeeSalaryAmountGreaterThan(double salary);
}