package com.example.SpringSample.login.domain.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class SignupForm {

    private String userId;
    private String password;
    private String userName;
    @DateTimeFormat(pattern = "yyy/MM/dd")
    private Date birthdate;
    private int age;
    private boolean marriage;

}
