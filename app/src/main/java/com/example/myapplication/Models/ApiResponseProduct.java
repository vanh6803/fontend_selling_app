package com.example.myapplication.Models;

import java.util.List;

public class ApiResponseProduct {
    private List<Product> data;
    private String message;

    public List<Product> getData() {
        return data;
    }

    public void setData(List<Product> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
