package com.pluralsight;

public class Employee {
    String employeeid;
    String name;
    int hoursWorked;
    float payRate;

    public Employee(String employeeid, String name, int hoursWorked, float payRate) {
        this.employeeid = employeeid;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public String getemployeeid() {
        return employeeid;
    }

    public void setemployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public float getGrossPay(float grossPay){
        return hoursWorked * rateOfPay;

    }

}
