/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iname;

/**
 *
 * @author Aarya
 */
//Standard structure for Main class: write a java app/display a report
//Structure 3


public class Main {

    public static void main(String[] args) {

        // 1. Create a one-dimensional array
        String[] names = {
            "Name1",
            "Name2",
            "Name3"
        };

        // 2. Create a two-dimensional array
        int[][] data = {
            {100, 200, 300},
            {400, 500, 600}
        };

        // 3. Create an object
        ClassName obj = new ClassName();

        // 4. Display heading
        System.out.println("REPORT");
        System.out.println("----------------------");

        // 5. Display array data
        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[i].length; j++) {

                System.out.print(data[i][j] + " ");

            }

            System.out.println();
        }

        // 6. Display calculations
        System.out.println("Total: "
                + obj.Method1(data));

        System.out.println("Average: "
                + obj.Method2(data));

        System.out.println("Maximum: "
                + obj.Method3(data));

        System.out.println("Minimum: "
                + obj.Method4(data));

    }
}

// store data in rows/colums: int[][] data
// create a list of names: String[] names
// create object: ClassName obj = new ClassName()
// display report: System.out.println()
// ask user for input: Scanner scanner = new Scanner(System.in)

//Step 2:
// if asks for user input instead of supplied data
// Change the following:

    //    int[][] data = {
    //        {100, 200, 300},
    //        {400, 500, 600}
    //    };

// to:

//        Scanner input = new Scanner(System.in);
//
//        int[][] data = new int[2][3];

//        for (int i = 0; i < data.length; i++) {

//          for (int j = 0; j < data[i].length; j++) {

//                System.out.print("Enter value: ");

//                data[i][j] = input.nextInt();

//            }
//        }

//calculation methods stay the same