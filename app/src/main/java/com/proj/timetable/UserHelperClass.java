package com.proj.timetable;

public class UserHelperClass {

    String username, password, name, phonenum;

    public UserHelperClass(String username, String password, String name, String phonenum) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.phonenum = phonenum;
    }


    public UserHelperClass() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }
}
