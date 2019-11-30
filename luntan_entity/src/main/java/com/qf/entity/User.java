package com.qf.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer uid;

    private String username;

    private String userpassword;

    private String useremail;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userbirthday;

    private Boolean usersex;

    private Integer userclass;

    private String userstatement;

    private Date userregdate;

    private Integer userpoint;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public Date getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(Date userbirthday) {
        this.userbirthday = userbirthday;
    }

    public Boolean getUsersex() {
        return usersex;
    }

    public void setUsersex(Boolean usersex) {
        this.usersex = usersex;
    }

    public Integer getUserclass() {
        return userclass;
    }

    public void setUserclass(Integer userclass) {
        this.userclass = userclass;
    }

    public String getUserstatement() {
        return userstatement;
    }

    public void setUserstatement(String userstatement) {
        this.userstatement = userstatement == null ? null : userstatement.trim();
    }

    public Date getUserregdate() {
        return userregdate;
    }

    public void setUserregdate(Date userregdate) {
        this.userregdate = userregdate;
    }

    public Integer getUserpoint() {
        return userpoint;
    }

    public void setUserpoint(Integer userpoint) {
        this.userpoint = userpoint;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", useremail='" + useremail + '\'' +
                ", userbirthday=" + userbirthday +
                ", usersex=" + usersex +
                ", userclass=" + userclass +
                ", userstatement='" + userstatement + '\'' +
                ", userregdate=" + userregdate +
                ", userpoint=" + userpoint +
                '}';
    }
}