package com.lxisoft.authentication;

public class LogIn {

    private String userName;
    private String passWord;


    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public LogIn() {
        this.userName = "admin";
        this.passWord = "admin@1";
    }

    
    
    
}
