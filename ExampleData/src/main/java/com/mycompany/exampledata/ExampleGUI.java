// NOTE: IGNORE THIS FILE ONLY USE IF THE STRAITS ARE DIRE hah get it because of the band hah

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exampledata;

/**
 *
 * @author Aarya
 */
//Main GUI Class
//Responsible for:
//---------------------
//Creating the buttons
//Creating the labels
//Creating the text area
//Loading the information
//Saving the information
//Creating the menus
//Clearing the screen
//Closing the application
//---------------------

//GUI Imports
import javax.swing.*;
import java.awt.*;

//File handlinf imports
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ExampleGUI extends JFrame {

    // =================================
    // 1. DECLARE GUI COMPONENTS
    // =================================

    private JButton btnLoad;
    private JButton btnSave;

    private JTextArea txtOutput;

    private JLabel lblRecordsProcessed;

    // Create object of implementing class
    private ExampleData exampleData;


    // =================================
    // 2. CONSTRUCTOR
    // =================================

    public ExampleGUI() {

        // Set window title
        setTitle("Example GUI Application");

        // Set window size
        setSize(500, 400);

        // Close application when X is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create object
        exampleData = new ExampleData();


        // =================================
        // 3. CREATE COMPONENTS
        // =================================

        btnLoad = new JButton("Load Data");

        btnSave = new JButton("Save Data");

        txtOutput = new JTextArea();

        // Make text area read-only
        txtOutput.setEditable(false);

        // Create label
        lblRecordsProcessed = new JLabel("");


        // =================================
        // 4. CREATE SCROLL PANE
        // =================================

        JScrollPane scrollPane =
                new JScrollPane(txtOutput);


        // =================================
        // 5. CREATE LAYOUT
        // =================================

        setLayout(new BorderLayout());

        // Top panel
        JPanel topPanel = new JPanel();

        topPanel.add(new JLabel("Records Processed:"));

        topPanel.add(lblRecordsProcessed);

        // Bottom panel
        JPanel bottomPanel = new JPanel();

        bottomPanel.add(btnLoad);

        bottomPanel.add(btnSave);

        // Add panels and scroll pane
        add(topPanel, BorderLayout.NORTH);

        add(scrollPane, BorderLayout.CENTER);

        add(bottomPanel, BorderLayout.SOUTH);


        // =================================
        // 6. BUTTON EVENT HANDLING
        // =================================

        // Load button
        btnLoad.addActionListener(e -> {
            loadData();
        });

        // Save button
        btnSave.addActionListener(e -> {
            saveData();
        });


        // =================================
        // 7. CREATE MENU
        // =================================

        createMenu();


        // =================================
        // 8. DISPLAY WINDOW
        // =================================

        setLocationRelativeTo(null);

        setVisible(true);
    }


    // =================================
    // 9. LOAD DATA METHOD
    // =================================

    private void loadData() {

        // Create output String
        String output = "DATA LOG\n";

        // Get total
        output += "Total: "
                + exampleData.GetTotal() + "\n";

        // Get average
        output += "Average: "
                + Math.round(exampleData.GetAverage()) + "\n";

        // Get values over limit
        output += "Over limit: "
                + exampleData.GetOverLimit() + "\n";

        // Get values under limit
        output += "Under limit: "
                + exampleData.GetUnderLimit() + "\n";

        // Display information in text area
        txtOutput.setText(output);

        // Display number of records processed
        lblRecordsProcessed.setText(
                String.valueOf(
                        exampleData.GetRecordsProcessed()
                )
        );
    }


    // =================================
    // 10. SAVE DATA METHOD
    // =================================

    private void saveData() {

        // Try to write information to file
        try (BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter("data.txt")
                )) {

            // Save text area contents
            writer.write(txtOutput.getText());

            // Display success message
            JOptionPane.showMessageDialog(
                    this,
                    "Data saved successfully!"
            );

        } catch (IOException e) {

            // Handle file errors
            JOptionPane.showMessageDialog(
                    this,
                    "Error saving data: " + e.getMessage()
            );
        }
    }


    // =================================
    // 11. CREATE MENU METHOD
    // =================================

    private void createMenu() {

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menus
        JMenu fileMenu = new JMenu("File");

        JMenu toolsMenu = new JMenu("Tools");


        // Create menu items
        JMenuItem exitItem = new JMenuItem("Exit");

        JMenuItem loadItem =
                new JMenuItem("Load Data");

        JMenuItem saveItem =
                new JMenuItem("Save Data");

        JMenuItem clearItem =
                new JMenuItem("Clear");


        // Add items to menus
        fileMenu.add(exitItem);

        toolsMenu.add(loadItem);

        toolsMenu.add(saveItem);

        toolsMenu.add(clearItem);


        // Add menus to menu bar
        menuBar.add(fileMenu);

        menuBar.add(toolsMenu);


        // Add menu bar to JFrame
        setJMenuBar(menuBar);


        // =================================
        // 12. MENU EVENT HANDLING
        // =================================

        // Exit menu item
        exitItem.addActionListener(e -> {

            System.exit(0);
        });


        // Load menu item
        loadItem.addActionListener(e -> {

            loadData();
        });


        // Save menu item
        saveItem.addActionListener(e -> {

            saveData();
        });


        // Clear menu item
        clearItem.addActionListener(e -> {

            txtOutput.setText("");

            lblRecordsProcessed.setText("");
        });
    }


    // =================================
    // 13. MAIN METHOD
    // =================================

    public static void main(String[] args) {

        // Start GUI application
        SwingUtilities.invokeLater(() -> {

            new ExampleGUI();
        });
    }
}

