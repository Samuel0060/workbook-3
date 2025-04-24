package com.pluralsight;

public class Employee {
    String employeeid;
    String name;
     double hoursWorked;
    float payRate;

    public Employee(String employeeid, String name, double hoursWorked, float payRate) {
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

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay(){
        return hoursWorked * payRate;

    }

    @Override
    public String toString() {
        return "ID: " + employeeid + ", Name: " + name +
                ", Hours Worked: " + hoursWorked +
                ", Pay Rate: $" + payRate +
                ", Gross Pay: $" + getGrossPay();
    }


}