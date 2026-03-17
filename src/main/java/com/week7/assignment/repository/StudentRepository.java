package com.week7.assignment.repository;

import com.week7.assignment.entity.Instructor;
import com.week7.assignment.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
