package com.clive.springtree.pojo;

import java.util.Date;

/**
 *用户类
 * created by clive tao on 2020 7/8
  */
public class Admin {
    private int id;
    private String userName;
    private String password;
    private String phone;
    private String email;
    private Date createAt;
    private Date loginLast;

    public Admin() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getLoginLast() {
        return loginLast;
    }

    public void setLoginLast(Date loginLast) {
        this.loginLast = loginLast;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin(int id, String userName, String password, String phone, String email, Date createAt, Date loginLast) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.createAt = createAt;
        this.loginLast = loginLast;
    }
}
