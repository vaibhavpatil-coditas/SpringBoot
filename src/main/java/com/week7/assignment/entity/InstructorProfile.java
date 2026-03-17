package com.week7.assignment.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "instructor_profile")
public class InstructorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "bio")
    private String bio;

    @Column(name = "expertise")
    private String expertise;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public InstructorProfile(Long id, String bio, String expertise) {
        this.id = id;
        this.bio = bio;
        this.expertise = expertise;
    }

    public InstructorProfile() {
    }
}
