package com.week8.assignment.dto.response;

import com.week8.assignment.enums.Priority;
import com.week8.assignment.enums.Status;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class TaskResponse {
    private Long id;
    private String employeeName;
    private String employeeEmail;
    private String taskTitle;
    private String taskDescription;
    private Priority priority;
    private Status status;
}
