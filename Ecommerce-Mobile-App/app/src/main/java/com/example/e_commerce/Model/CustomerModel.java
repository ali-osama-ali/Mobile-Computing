package com.example.e_commerce.Model;


public class CustomerModel {

    private int id;
    private String username,email,password,birthdate;

    public CustomerModel(int id, String username, String email, String password, String birthdate) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.birthdate=birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
