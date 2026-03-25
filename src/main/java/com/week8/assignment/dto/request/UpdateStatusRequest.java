package com.week8.assignment.dto.request;

import com.week8.assignment.enums.Status;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateStatusRequest {

    private Status status;

}
