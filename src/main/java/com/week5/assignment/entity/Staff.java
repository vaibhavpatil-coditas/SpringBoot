package com.week5.assignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Staff {
    @Id
    private int staffid;
    private String name;
    private String profile;
    private double salary;
    private int experience;

    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Staff(int staffid, String name, String profile, double salary, int experience) {
        this.staffid = staffid;
        this.name = name;
        this.profile = profile;
        this.salary = salary;
        this.experience = experience;
    }

    public Staff() {
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffid=" + staffid +
                ", name='" + name + '\'' +
                ", profile='" + profile + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
