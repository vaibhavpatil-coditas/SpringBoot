package com.week8.assignment.controller;

import com.week8.assignment.dto.request.CreateTaskRequest;
import com.week8.assignment.dto.request.UpdatePriorityRequest;
import com.week8.assignment.dto.request.UpdateStatusRequest;
import com.week8.assignment.dto.response.TaskResponse;
import com.week8.assignment.enums.Priority;
import com.week8.assignment.enums.Status;
import com.week8.assignment.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService service;

    @PostMapping
    public ResponseEntity<TaskResponse> createTask(@RequestBody CreateTaskRequest request) {
        return ResponseEntity.ok(service.createTask(request));
    }

    @GetMapping
    public ResponseEntity<List<TaskResponse>> getAll() {
        return ResponseEntity.ok(service.getAllTasks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getTaskById(id));
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<TaskResponse> updateStatus(
            @PathVariable Long id,
            @RequestBody UpdateStatusRequest request) {
        return ResponseEntity.ok(service.updateStatus(id, request.getStatus()));
    }

    @PutMapping("/{id}/priority")
    public ResponseEntity<TaskResponse> updatePriority(
            @PathVariable Long id,
            @RequestBody UpdatePriorityRequest request) {
        return ResponseEntity.ok(service.updatePriority(id, request.getPriority()));
    }

    @GetMapping("/employee/{email}")
    public ResponseEntity<List<TaskResponse>> getByEmail(@PathVariable String email) {
        return ResponseEntity.ok(service.getTasksByEmail(email));
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<TaskResponse>> getByStatus(@PathVariable Status status) {
        return ResponseEntity.ok(service.getTasksByStatus(status));
    }

    @GetMapping("/priority/{priority}")
    public ResponseEntity<List<TaskResponse>> getByPriority(@PathVariable Priority priority) {
        return ResponseEntity.ok(service.getTasksByPriority(priority));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}
