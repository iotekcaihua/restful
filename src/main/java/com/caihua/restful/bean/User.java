package com.caihua.restful.bean;

public class User {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String addr;
    private String hobby;

    public User(int id, String name, String gender, int age, String addr, String hobby) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.addr = addr;
        this.hobby = hobby;
    }

    public User(int id) {
        this.id = id;
    }

    public User() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
