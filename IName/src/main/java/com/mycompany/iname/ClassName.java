/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iname;

/**
 *
 * @author Aarya
 */

//Standard structure for Class Implementing the Interface class
//Structure 2

public class ClassName implements IName {

    // Method 1
    //calculates the total
    @Override
    public int Method1(int[][] data) {

        int total = 0;

        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[i].length; j++) {

                total += data[i][j];

            }
        }

        return total;
    }

    // Method 2
    //calculates the average
    @Override
    public double Method2(int[][] data) {

        int total = Method1(data);

        int count = 0;

        for (int i = 0; i < data.length; i++) {
            count += data[i].length;
        }

        return (double) total / count;
    }

    // Method 3
    //finds highest/max
    @Override
    public int Method3(int[][] data) {

        int max = data[0][0];

        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[i].length; j++) {

                if (data[i][j] > max) {
                    max = data[i][j];
                }

            }
        }

        return max;
    }

    // Method 4
    //finds lowest/min
    @Override
    public int Method4(int[][] data) {

        int min = data[0][0];

        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[i].length; j++) {

                if (data[i][j] < min) {
                    min = data[i][j];
                }

            }
        }

        return min;
    }

}


