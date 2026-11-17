/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inametest;

/**
 *
 * @author Aarya
 */
import java.util.Scanner;

public class MainClassTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter total: ");
        int total = input.nextInt();

        ChildClass obj = new ChildClass(name, total);

        obj.printReport();

    }
}
