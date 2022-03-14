package com.howtodoinjava.example.sampleservice.model;

import java.io.Serializable;
import java.util.List;

public class EmployeeProfiles implements Serializable {

    private static final long serialVersionUID = 5610877654L;

    private List<EmployeeProfile> employeeProfileList;

    public List<EmployeeProfile> getEmployeeProfileList() {
        return employeeProfileList;
    }

    public void setEmployeeProfileList(List<EmployeeProfile> employeeProfileList) {
        this.employeeProfileList = employeeProfileList;
    }

    @Override
    public String toString() {
        return "EmployeeProfiles{" +
                "employeeProfileList=" + employeeProfileList +
                '}';
    }
}
