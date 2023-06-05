package com.example.myapplication.Models;

import java.util.List;

public class ApiResponseManufacturer {
    private List<Manufacturer> data;
    private String message;

    public List<Manufacturer> getData() {
        return data;
    }

    public void setData(List<Manufacturer> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
