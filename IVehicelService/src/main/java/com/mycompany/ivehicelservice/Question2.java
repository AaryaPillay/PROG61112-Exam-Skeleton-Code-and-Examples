/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ivehicelservice;

/**
 *
 * @author Aarya
 */
import java.util.Scanner;
public class Question2 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        // Ask the user for the vehicle type
        System.out.print("Enter vehicle type: ");
        String vehicleType = input.nextLine();

        // Ask the user for the city
        System.out.print("Enter city: ");
        String city = input.nextLine();

        // Ask the user for the number of services
        System.out.print("Enter total number of services: ");
        int serviceTotal = input.nextInt();

        // Create a VehicleServiceReport object
        VehicleServiceReport report =
                new VehicleServiceReport(vehicleType, city, serviceTotal);

        // Display the report
        System.out.println();

        report.printServiceReport();
    }
}
