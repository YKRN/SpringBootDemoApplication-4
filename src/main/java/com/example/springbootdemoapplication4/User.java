package com.example.springbootdemoapplication4;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class User {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String name;
    private String email;
    private String password;
    private String gender;
    private String note;
    private boolean married;
    private LocalDate birthday;
    private String profession;
    final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }



    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    public void setMarried(boolean married) {
        this.married = married;
    }
    public boolean isMarried() {
        return married;
    }


    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", note='" + note + '\'' +
                ", married=" + married +
                ", birthday=" + birthday +
                ", profession='" + profession + '\'' +
                '}';
    }



// getters
    // setters

    // override toString()

}
