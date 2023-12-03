package com.proj.validations;

public class ValidateLogin {

    String phone, password;

    public ValidateLogin(String phone, String password) {
        this.phone = phone;
        this.password = password;
    }

    public ValidateLogin() {

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validatePhone(String phone){
    return false;
    }

    public boolean validatePassword(String password){
        return false;
    }



}
