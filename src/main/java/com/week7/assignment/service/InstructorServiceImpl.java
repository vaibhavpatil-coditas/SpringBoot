package com.week7.assignment.service;

import com.week7.assignment.entity.Instructor;
import com.week7.assignment.repository.InstructorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InstructorServiceImpl implements InstructorService{
    private final InstructorRepository instructorRepository;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public Instructor createInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor getInstructor(Long id) {
        Optional<Instructor> byId = instructorRepository.findById(id);

        if(!byId.isPresent()){
            throw new RuntimeException("Instructor id not found - "+id);
        }

        return byId.get();
    }

    @Override
    public void deleteInstructor(Long id) {
        instructorRepository.deleteById(id);
    }
}
