package cn.itcast.demo;

import java.io.Serializable;

public class User implements Serializable {

    private long id;

    private String username;

    private Integer age;

    private  String address;

    public User() {
    }

    public User(long id, String username, Integer age, String address) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
