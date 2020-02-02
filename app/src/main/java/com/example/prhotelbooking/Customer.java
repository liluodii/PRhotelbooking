package com.example.prhotelbooking;

public class Customer {
    String firstname;
    String lastname;
    String username;
    String Password;
    String gender;
    int Image;

    public Customer(String firstname, String lastname, String username, String password, String gender, int image) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.Password = password;
        this.gender = gender;
        Image = image;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
