/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsales;

/**
 *
 * @author Aarya
 */
//=======================================================
//Start with creating the interface and implementing class
//as GUI uses methods from here
//========================================================

//==========================================
//Note: 
//Outer loop (i): moves between years/rows
//Inner loop (j): moves between products/columns
//==========================================

//========================================
//Calculation Patterns:
//---------------------
//Total:    total += sales[i][j];
//Count Values:     count++;
//Over limit:   sales[i][j] > limit  
//under limit:  sales[i][j] < limit 
//Average:  (double) total/count
//Number of rows:   sales.length
//----------------------
//=========================================

public class ProductSales implements IProductSales {

    //array to store the sales
    private int[][] sales;
    
    //sales limit
    private final int SALES_LIMIT = 500;

    // Constructor
    public ProductSales() {

        sales = new int[][] {
            {300, 150, 700},
            {250, 200, 600}
        };
    }

    // Return sales data
    @Override
    public int[][] GetProductSales() {
        return sales;
    }

    // Calculate total sales
    @Override
    public int GetTotalSales() {

        int total = 0;

        for (int i = 0; i < sales.length; i++) {

            for (int j = 0; j < sales[i].length; j++) {

                total += sales[i][j];
            }
        }

        return total;
    }

    // Calculate average sales
    @Override
    public double GetAverageSales() {

        int total = GetTotalSales();
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            count += sales[i].length;
        }

        return (double) total / count;
    }

    // Count sales over the limit
    @Override
    public int GetSalesOverLimit() {

        int count = 0;

        for (int i = 0; i < sales.length; i++) {

            for (int j = 0; j < sales[i].length; j++) {
                
                //checks if current sales are greater than 500
                if (sales[i][j] > SALES_LIMIT) {
                    count++;
                }
            }
        }

        return count;
    }

    // Count sales under the limit
    @Override
    public int GetSalesUnderLimit() {

        int count = 0;

        for (int i = 0; i < sales.length; i++) {

            for (int j = 0; j < sales[i].length; j++) {

                //checks if current sales are less than 500
                if (sales[i][j] < SALES_LIMIT) {
                    count++;
                }
            }
        }

        return count;
    }

    // Return number of years processed
    @Override
    public int GetProductsProcessed() {

        return sales.length;
    }
}

