package com.trainer.student.exception;

import java.time.LocalDateTime;

public class ErrorResponse {
    private int statuse;
    private String message;
    private LocalDateTime dateTime;

    public ErrorResponse(int statuse, String message, LocalDateTime dateTime) {
        this.statuse = statuse;
        this.message = message;
        this.dateTime = dateTime;
    }

    public int getStatuse() {
        return statuse;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
