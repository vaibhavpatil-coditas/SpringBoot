package com.week8.assignment.repository;

import com.week8.assignment.entity.Task;
import com.week8.assignment.enums.Priority;
import com.week8.assignment.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByEmployeeEmail(String email);

    List<Task> findByStatus(Status status);

    List<Task> findByPriority(Priority priority);
}