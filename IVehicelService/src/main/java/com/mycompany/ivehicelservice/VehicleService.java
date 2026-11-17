/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ivehicelservice;

/**
 *
 * @author Aarya
 */
public abstract class VehicleService implements IVehicleService {
// Variables
    private String vehicleType;
    private String city;
    private int serviceTotal;

    // Constructor
    public VehicleService(String vehicleType, String city, int serviceTotal) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.serviceTotal = serviceTotal;
    }

    // Get vehicle type
    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    // Get city
    @Override
    public String getCity() {
        return city;
    }

    // Get number of services
    @Override
    public int getServiceTotal() {
        return serviceTotal;
    }
    
}
