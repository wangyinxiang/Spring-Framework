package com.spring.custom;

/**
 * 1. 创建组件
 * 该组件就是一个普通的 Java Bean，没有任何特别之处。
 */
public class User {

    private String id;
    private String userName;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
