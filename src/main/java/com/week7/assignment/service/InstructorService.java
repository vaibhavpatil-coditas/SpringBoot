package com.week7.assignment.service;

import com.week7.assignment.entity.Instructor;

public interface InstructorService {

    Instructor createInstructor(Instructor instructor);

    Instructor getInstructor(Long id);

    void deleteInstructor(Long id);
}
