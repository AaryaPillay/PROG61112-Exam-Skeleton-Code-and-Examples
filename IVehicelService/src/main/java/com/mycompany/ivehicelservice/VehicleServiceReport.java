/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ivehicelservice;

/**
 *
 * @author Aarya
 */
public class VehicleServiceReport extends VehicleService {

    // Constructor
    public VehicleServiceReport(String vehicleType,
            String city, int serviceTotal) {

        // Call the parent constructor
        super(vehicleType, city, serviceTotal);
    }

    // Method to print the service report
    public void printServiceReport() {

        System.out.println("VEHICLE SERVICE REPORT");
        System.out.println("----------------------");

        System.out.println("Vehicle Type: " + getVehicleType());
        System.out.println("City: " + getCity());
        System.out.println("Number of Services: " + getServiceTotal());
    }
}
