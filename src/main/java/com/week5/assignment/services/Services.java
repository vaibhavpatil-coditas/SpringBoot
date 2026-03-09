package com.week5.assignment.services;

import com.week5.assignment.dao.StaffDao;
import com.week5.assignment.entity.Staff;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {
    @Autowired
    StaffDao staffDao;

    public List<Staff> getStaff(){
        return staffDao.getStaff();
    }


    public Staff getStaffMemberById(int staffid) {
        return staffDao.getStaffMemberById(staffid);
    }

    public void insertOneStaffMember(Staff staff) {
        staffDao.insertOneStaffMember(staff);
    }

    public List<Staff> getStaffMemberSalaryMoreThanGivenAmount(double salary) {
        return staffDao.getStaffMemberSalaryMoreThanGivenAmount(salary);
    }

    public List<Staff> getStaffMemberByExperience(int minExperience, int maxExperience) {
        return staffDao.getStaffMemberByExperience(minExperience, maxExperience);
    }

    public Staff getStaffMemberByMaxSalary(){
        return staffDao.getStaffMemberByMaxSalary();
    }

    public void setSalaryForId(int id, double salary){
        staffDao.setSalaryForId(id, salary);
    }

    public String getStaffNameWithMinExperience() {
        return staffDao.getStaffNameWithMinExperience();
    }

    public List<Staff> getAllTrainers(){
        return staffDao.getAllTrainers();
    }

    public List<Staff> getNoneTrainers(){
        return staffDao.getNoneTrainers();
    }
}
