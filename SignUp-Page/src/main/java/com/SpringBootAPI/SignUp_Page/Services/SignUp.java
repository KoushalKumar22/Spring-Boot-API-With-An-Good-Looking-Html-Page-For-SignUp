package com.SpringBootAPI.SignUp_Page.Services;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "NewUserSignUp")
public class SignUp {
    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Name")
    private String name;

    @Column(name = "Username")
    private String username;

    @Column(name = "EmailId")
    private String emailid;

    @Column(name = "PhoneNo")
    private Long phnumber;

    @Column(name = "Password")
    private String password;

    @Column(name = "ConfirmPassword")
    private String cpassword;

    @Column(name = "City")
    private String city;

    @Column(name = "Address")
    private String address;

    @Column(name = "Gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    // Getters and Setters
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Long getPhnumber() {
        return phnumber;
    }

    public void setPhnumber(Long phnumber) {
        this.phnumber = phnumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "SignUp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", emailid='" + emailid + '\'' +
                ", phnumber=" + phnumber +
                ", password='" + password + '\'' +
                ", cpassword='" + cpassword + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                '}';
    }
}
