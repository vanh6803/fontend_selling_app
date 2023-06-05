package com.example.myapplication.Models;

public class Product {
    private int id;
    private String name;
    private int price;
    private String description;
    private Detail detail;
    private String color;
    private int quantity;
    private String status;
    private Manufacturer manufacturer;

    private String image;
    public Product() {
    }


    public Product(int id, String name, int price, String description, Detail detail, String color, int quantity, String status, Manufacturer manufacturer, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.detail = detail;
        this.color = color;
        this.quantity = quantity;
        this.status = status;
        this.manufacturer = manufacturer;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

