package com.example.usuario.myapplication;

/**
 * Created by usuario on 17/03/2018.
 */

public class User {
    private String name,location,compania;

    public User(String name, String location, String compania) {
        this.name = name;
        this.location = location;
        this.compania = compania;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
}
