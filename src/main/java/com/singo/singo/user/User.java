package com.singo.singo.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;

    public User(){

    }
    public User(int id, String firstName, String lastName, String email, String password, String role) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User(@JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName,
     @JsonProperty("email") String email, @JsonProperty("password") String password, @JsonProperty("role") String role) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.role = role;
    }

    public User( String email, String password, String role) {
    this.email = email;
    this.password = password;
    this.role = role;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole( String role) {
        this.role = role;
    }


}
