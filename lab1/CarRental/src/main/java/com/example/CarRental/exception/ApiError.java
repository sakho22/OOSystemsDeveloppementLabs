package com.example.CarRental.exception;

public class ApiError {
    private String status;
    private String message;

    public ApiError(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
