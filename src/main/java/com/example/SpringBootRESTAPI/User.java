package com.example;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    private Integer userID;
    @Column(unique = true)
    private String userName;
    @Column(name="firstName")
    private String firstName;
    private String lastName;
    @Column(unique=true)
    private String mobileNumber;
    @Column(unique = true)
    private String emailID;
    private String address1;
    private String address2;

    public User(){

    }
    public User(int userID) {
        this.userID = userID;
    }

    public User(String userName) {
        this.userName = userName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }



}
