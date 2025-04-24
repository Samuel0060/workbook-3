package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            bufReader.readLine();

            String input;

            while ((input = bufReader.readLine()) != null) {
                // Split the line using |
                String[] tokens = input.trim().split("\\|");

                // Copy values into matching variables
                String employeeId = tokens[0];
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                float payRate = Float.parseFloat(tokens[3]);

                // Create a new Employee object using those variables
                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                // Store the employee in the array
                System.out.println(employee);
            }
            bufReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
