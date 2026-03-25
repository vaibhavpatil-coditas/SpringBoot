package com.week8.assignment.mapper;

import com.week8.assignment.dto.request.CreateTaskRequest;
import com.week8.assignment.dto.response.TaskResponse;
import com.week8.assignment.entity.Task;
import com.week8.assignment.enums.Status;

import java.time.LocalDateTime;

public class TaskMapper {
    public Task toEntity(CreateTaskRequest request) {
        Task task = new Task();
        task.setEmployeeName(request.getEmployeeName());
        task.setEmployeeEmail(request.getEmployeeEmail());
        task.setTaskTitle(request.getTaskTitle());
        task.setTaskDescription(request.getTaskDescription());
        task.setPriority(request.getPriority());
        task.setStatus(Status.ASSIGNED);
        task.setCreatedDate(LocalDateTime.now());
        return task;
    }

    public TaskResponse toResponse(Task task) {
        return TaskResponse.builder()
                .id(task.getId())
                .employeeName(task.getEmployeeName())
                .employeeEmail(task.getEmployeeEmail())
                .taskTitle(task.getTaskTitle())
                .taskDescription(task.getTaskDescription())
                .priority(task.getPriority())
                .status(task.getStatus())
                .build();
    }
}
