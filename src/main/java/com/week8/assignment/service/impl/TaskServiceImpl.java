package com.week8.assignment.service.impl;

import com.week8.assignment.dto.request.CreateTaskRequest;
import com.week8.assignment.dto.response.TaskResponse;
import com.week8.assignment.entity.Task;
import com.week8.assignment.enums.Priority;
import com.week8.assignment.enums.Status;
import com.week8.assignment.exception.TaskNotFoundException;
import com.week8.assignment.mapper.TaskMapper;
import com.week8.assignment.repository.TaskRepository;
import com.week8.assignment.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository repository;
    private final TaskMapper mapper;

    @Override
    public TaskResponse createTask(CreateTaskRequest request) {
        Task task = mapper.toEntity(request);
        return mapper.toResponse(repository.save(task));
    }

    @Override
    public List<TaskResponse> getAllTasks() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public TaskResponse getTaskById(Long id) {
        Task task = repository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found"));
        return mapper.toResponse(task);
    }

    @Override
    public TaskResponse updateStatus(Long id, Status status) {
        Task task = repository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found"));

        task.setStatus(status);
        task.setUpdatedDate(LocalDateTime.now());

        return mapper.toResponse(repository.save(task));
    }

    @Override
    public TaskResponse updatePriority(Long id, Priority priority) {
        Task task = repository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found"));

        task.setPriority(priority);
        return mapper.toResponse(repository.save(task));
    }

    @Override
    public List<TaskResponse> getTasksByEmail(String email) {
        return repository.findByEmployeeEmail(email)
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public List<TaskResponse> getTasksByStatus(Status status) {
        return repository.findByStatus(status)
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public List<TaskResponse> getTasksByPriority(Priority priority) {
        return repository.findByPriority(priority)
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}