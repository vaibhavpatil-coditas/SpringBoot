package com.week7.assignment.controller;

import com.week7.assignment.entity.Instructor;
import com.week7.assignment.service.InstructorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/week7/instructors")
public class InstructorController {
    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @PostMapping
    public ResponseEntity<Instructor> create(@RequestBody @Valid Instructor instructor){
        return ResponseEntity.ok(instructorService.createInstructor(instructor));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Instructor> get(@PathVariable Long id) {
        return ResponseEntity.ok(instructorService.getInstructor(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        instructorService.deleteInstructor(id);
        return ResponseEntity.ok("Deleted successfully");
    }
}
