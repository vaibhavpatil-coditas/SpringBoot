package com.week8.assignment.service;

import com.week8.assignment.dto.request.CreateTaskRequest;
import com.week8.assignment.dto.response.TaskResponse;
import com.week8.assignment.enums.Priority;
import com.week8.assignment.enums.Status;

import java.util.List;

public interface TaskService {

    TaskResponse createTask(CreateTaskRequest request);

    List<TaskResponse> getAllTasks();

    TaskResponse getTaskById(Long id);

    TaskResponse updateStatus(Long id, Status status);

    TaskResponse updatePriority(Long id, Priority priority);

    List<TaskResponse> getTasksByEmail(String email);

    List<TaskResponse> getTasksByStatus(Status status);

    List<TaskResponse> getTasksByPriority(Priority priority);

    void deleteTask(Long id);
}