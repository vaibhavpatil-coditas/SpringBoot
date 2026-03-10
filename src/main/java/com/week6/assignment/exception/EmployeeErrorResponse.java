package com.week6.assignment.exception;

public class EmployeeErrorResponse {

    private int statusCode;
    private String message;
    private long timeStamp;

    public EmployeeErrorResponse() {
    }

    public EmployeeErrorResponse(int statusCode, String message, long timeStamp) {
        this.statusCode = statusCode;
        this.message = message;
        this.timeStamp = timeStamp;
    }

}