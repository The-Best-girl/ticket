package com.example.demo.bean;

public class user {
    private int id;
    private String name;
    private String pwd;
    private String email;
    private String discription;

    public user() {
    }

    public user(int id, String name, String pwd, String email, String discription) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.email = email;
        this.discription = discription;
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
