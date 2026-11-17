/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iproductsales;

/**
 *
 * @author Aarya
 */

public class MainPSQ1 {

    public static void main(String[] args) {

        // One-dimensional array
        String[] quarters = {
            "Quarter 1",
            "Quarter 2",
            "Quarter 3"
        };

        // Two-dimensional array
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        // Create ProductSales object
        ProductSales sales = new ProductSales();

        // Display sales report
        System.out.println("PRODUCT SALES REPORT");
        System.out.println("------------------------------");

        System.out.println("YEAR       Q1    Q2    Q3");

        for (int i = 0; i < productSales.length; i++) {

            System.out.print("YEAR " + (i + 1) + "     ");

            for (int j = 0; j < productSales[i].length; j++) {

                System.out.print(productSales[i][j] + "    ");

            }

            System.out.println();
        }

        // Display calculations
        System.out.println("\n------------------------------");
        System.out.println("PRODUCT SALES SUMMARY");
        System.out.println("------------------------------");

        System.out.println("Total Sales: "
                + sales.TotalSales(productSales));

        System.out.println("Average Sales: "
                + sales.AverageSales(productSales));

        System.out.println("Maximum Sales: "
                + sales.MaxSale(productSales));

        System.out.println("Minimum Sales: "
                + sales.MinSale(productSales));

    }
}

