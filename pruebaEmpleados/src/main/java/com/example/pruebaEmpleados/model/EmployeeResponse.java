package com.example.pruebaEmpleados.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeResponse {
    private String status;
    private Employee[] data;
    private String message;

    // Getters y setters
    
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("data")
    public Employee[] getData() {
        return data;
    }

    public void setData(Employee[] data) {
        this.data = data;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
