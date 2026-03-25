package com.week8.assignment.dto.request;

import com.week8.assignment.enums.Priority;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdatePriorityRequest {

    private Priority priority;

}
