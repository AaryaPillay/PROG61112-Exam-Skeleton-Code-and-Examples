/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exampledata;

/**
 *
 * @author Aarya
 */

// Import JUnit
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//note: test class does not need a main() method
//Remember the following layout:
//-------------------------------------
//  @Test
//      public void TestName() {

//          ClassName object = new ClassName();

//          int expected = 10;

//          int actual = object.MethodName();

//          assertEquals(expected, actual);
//      }
//--------------------------------------


public class ExampleDataTest {
    // =================================
    // TEST 1: VALUES OVER LIMIT
    // =================================

    @Test
    public void GetOverLimit_ReturnsNumberOfValues() {

        // Create object
        ExampleData data = new ExampleData();

        // Expected result
        int expected = 2;

        // Actual result
        int actual = data.GetOverLimit();

        // Compare expected and actual
        assertEquals(expected, actual);
    }


    // =================================
    // TEST 2: VALUES UNDER LIMIT
    // =================================

    @Test
    public void GetUnderLimit_ReturnsNumberOfValues() {

        // Create object
        ExampleData data = new ExampleData();

        // Expected result
        int expected = 4;

        // Actual result
        int actual = data.GetUnderLimit();

        // Compare expected and actual
        assertEquals(expected, actual);
    }
}

//dont forget to change the pom file
//just use this pom file and change the file name and class names :)
    