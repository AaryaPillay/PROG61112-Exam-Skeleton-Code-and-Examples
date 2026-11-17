/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inametest;

/**
 *
 * @author Aarya
 */
public class ChildClass extends ParentClass {

    public ChildClass(String name, int total) {

        super(name, total);

    }

    public void printReport() {

        System.out.println("REPORT");

        System.out.println("Name: " + getName());

        System.out.println("Total: " + getTotal());

    }

}
