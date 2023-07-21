package com.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class LoginBean {

    private String username;
    private String password;

    public String login() {
        // Perform authentication logic here
        // For demonstration purposes, always redirect to a welcome page
        return "welcome";
    }

    // Getters and setters (omitted for brevity)
}

