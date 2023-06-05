package com.example.myapplication.Models;

public class Manufacturer {
    private String _id;
    private String name;
    private String logo;

    public Manufacturer(String _id, String name, String logo) {
        this._id = _id;
        this.name = name;
        this.logo = logo;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
