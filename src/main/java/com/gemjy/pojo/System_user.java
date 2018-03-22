package com.gemjy.pojo;

public class System_user {
    private String id;

    private String userName;

    private String password;

    public System_user(String id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public System_user() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}