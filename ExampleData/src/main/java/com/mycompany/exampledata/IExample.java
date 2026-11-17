/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.exampledata;

/**
 *
 * @author Aarya
 */
public interface IExample {
    // Returns the original data
    int[][] GetData();

    // Calculates the total
    int GetTotal();

    // Calculates the number of values over the limit
    int GetOverLimit();

    // Calculates the number of values under the limit
    int GetUnderLimit();

    // Returns the number of records processed
    int GetRecordsProcessed();

    // Calculates the average
    double GetAverage();
}
