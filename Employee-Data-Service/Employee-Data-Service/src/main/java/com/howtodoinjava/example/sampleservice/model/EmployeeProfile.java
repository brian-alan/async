package com.howtodoinjava.example.sampleservice.model;

import java.io.Serializable;

public class EmployeeProfile implements Serializable{
    private static final long serialVersionUID = 123456789L;
    private  String profile;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "EmployeeProfile [profile='" + profile + "']";
    }
}
