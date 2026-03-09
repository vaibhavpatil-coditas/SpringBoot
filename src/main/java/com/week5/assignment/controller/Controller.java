package com.week5.assignment.controller;

import com.week5.assignment.entity.Staff;
import com.week5.assignment.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    Services service;

    @GetMapping("getStaff")
    public List<Staff> getStaff(){
        return service.getStaff();
    }

    @GetMapping("getStaffMemberById")
    public Staff getStaffMemberById(@RequestParam int staffid){
        return service.getStaffMemberById(staffid);
    }

    @PostMapping("insertOneMember")
    public void insertOneStaffMember(@RequestBody Staff staff){
        service.insertOneStaffMember(staff);
    }

    @GetMapping("getStaffBySalary")
    public List<Staff> getStaffMemberSalaryMoreThanGivenAmount(@RequestParam double salary){
        return service.getStaffMemberSalaryMoreThanGivenAmount(salary);
    }

    @GetMapping("getStaffByExperience")
    public List<Staff> getStaffMemberByExperience(@RequestParam int minExperience, @RequestParam int maxExperience){
        return service.getStaffMemberByExperience(minExperience, maxExperience);
    }

    @GetMapping("getStaffByMaxSalary")
    public Staff getStaffMemberByMaxSalary(){
        return service.getStaffMemberByMaxSalary();
    }

    @PostMapping("setSalary")
    public void setSalaryForId(@RequestParam int id, @RequestParam double salary){
        service.setSalaryForId(id, salary);
    }

    @GetMapping("getStaffNameWithMinExperience")
    public String getStaffNameWithMinExperience(){
        return service.getStaffNameWithMinExperience();
    }

    @GetMapping("getAllTrainers")
    public List<Staff> getAllTrainers(){
        return service.getAllTrainers();
    }

    @GetMapping("getNoneTrainers")
    public List<Staff> getNoneTrainers(){
        return service.getNoneTrainers();
    }
}
