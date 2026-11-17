/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inametest;

/**
 *
 * @author Aarya
 */
public abstract class ParentClass implements INameTest {

    private String name;
    private int total;

    public ParentClass(String name, int total) {

        this.name = name;
        this.total = total;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getTotal() {
        return total;
    }

}
