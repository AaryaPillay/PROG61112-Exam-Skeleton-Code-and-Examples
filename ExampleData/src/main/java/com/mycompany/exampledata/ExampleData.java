/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exampledata;

/**
 *
 * @author Aarya
 */
//Implementing the interface
//only change the following:
//-----------------------
//class and interface names
//array variable name
//data supplied
//the limit
//comparison or calculation required
//------------------------

public class ExampleData implements IExample{

     // Store the data
    private int[][] data;

    // Set the limit specified in the question
    private final int LIMIT = 500;

    // Constructor
    public ExampleData() {

        // Replace these values with the data
        // supplied in the examination question

        data = new int[][] {
            {300, 150, 700},
            {250, 200, 600}
        };
    }
    
    // Return the original data
    @Override
    public int[][] GetData() {

        return data;
    }

    // Calculate the total
    @Override
    public int GetTotal() {

        int total = 0;

        // Loop through rows
        for (int i = 0; i < data.length; i++) {

            // Loop through columns
            for (int j = 0; j < data[i].length; j++) {

                total += data[i][j];
            }
        }

        return total;
    }

    // Calculate the average
    @Override
    public double GetAverage() {

        int total = GetTotal();
        int count = 0;

        // Count all individual values
        for (int i = 0; i < data.length; i++) {

            count += data[i].length;
        }

        // Convert to double to avoid integer division
        return (double) total / count;
    }

    // Count values over the limit
    @Override
    public int GetOverLimit() {

        int count = 0;

        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[i].length; j++) {

                if (data[i][j] > LIMIT) {

                    count++;
                }
            }
        }

        return count;
    }

    // Count values under the limit
    @Override
    public int GetUnderLimit() {

        int count = 0;

        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[i].length; j++) {

                if (data[i][j] < LIMIT) {

                    count++;
                }
            }
        }

        return count;
    }

    // Return the number of records processed
    @Override
    public int GetRecordsProcessed() {

        return data.length;
    }
}