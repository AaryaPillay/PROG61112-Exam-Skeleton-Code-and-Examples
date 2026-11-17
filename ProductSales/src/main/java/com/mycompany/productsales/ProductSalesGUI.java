/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsales;

/**
 *
 * @author Aarya
 */


import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//=======================
//Note:
//JFrame for the window.
//JLabel for Years Processed.
//JTextArea for displaying the report.
//JButton for Load and Save.
//JScrollPane for scrolling.
//=======================


public class ProductSalesGUI extends JFrame {

    private JButton btnLoad;
    private JButton btnSave;

    private JTextArea txtOutput;

    private JLabel lblYearsProcessed;

    private ProductSales productSales;

    // Constructor
    public ProductSalesGUI() {

        setTitle("Product Sales Application");
        setSize(500, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        productSales = new ProductSales();

        // Create components
        btnLoad = new JButton("Load Products Data");
        btnSave = new JButton("Save Product Data");

        txtOutput = new JTextArea();
        txtOutput.setEditable(false);

        lblYearsProcessed = new JLabel("");

        JScrollPane scrollPane =
                new JScrollPane(txtOutput);

        // Layout
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Years Processed:"));
        topPanel.add(lblYearsProcessed);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(btnLoad);
        bottomPanel.add(btnSave);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        // Button events
        btnLoad.addActionListener(e -> loadData());
        btnSave.addActionListener(e -> saveData());

        // Create menus
        createMenu();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Load data
    //Q2.2: load data, calculate and save to file
    //event handling, calculations, file handling
    private void loadData() {

        String output = "DATA LOG\n";

        output += "Total Sales: "
                + productSales.GetTotalSales() + "\n";

        output += "Average Sales: "
                + Math.round(productSales.GetAverageSales()) + "\n";

        output += "Sales over limit: "
                + productSales.GetSalesOverLimit() + "\n";

        output += "Sales under limit: "
                + productSales.GetSalesUnderLimit() + "\n";

        txtOutput.setText(output);

        lblYearsProcessed.setText(
                String.valueOf(productSales.GetProductsProcessed())
        );
    }

    // Save data
        //save product data button: into file called data.txt
    //Note: ---------
        //FileWriter("data.txt") creates or opens the file.
        //BufferedWriter writes text efficiently
        //writer.write() writes the text area contents to the file
        //try automatically closes the file when finished
        //catch handles errors
    //--------------
    private void saveData() {

        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter("data.txt"))) {

            writer.write(txtOutput.getText());

            JOptionPane.showMessageDialog(
                    this, "Data saved successfully!"
            );

        } catch (IOException e) {

            JOptionPane.showMessageDialog(
                    this, "Error saving data!"
            );
        }
    }

    // Create menu
    //Q2.3:Menu System
    //Components Used Here:----------------
    //JMenuBar:     The main menu bar
    //JMenu:    A menu heading, such as File
    //JMenuItem:    An option inside a menu, such as Exit
    //--------------------------------------

    private void createMenu() {

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu toolsMenu = new JMenu("Tools");

        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem loadItem = new JMenuItem("Load Product Data");
        JMenuItem saveItem = new JMenuItem("Save Product Data");
        JMenuItem clearItem = new JMenuItem("Clear");

        fileMenu.add(exitItem);

        toolsMenu.add(loadItem);
        toolsMenu.add(saveItem);
        toolsMenu.add(clearItem);

        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);

        setJMenuBar(menuBar);

        exitItem.addActionListener(e -> System.exit(0));

        loadItem.addActionListener(e -> loadData());

        saveItem.addActionListener(e -> saveData());

        clearItem.addActionListener(e -> {
            txtOutput.setText("");
            lblYearsProcessed.setText("");
        });
    }

    // Main method
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new ProductSalesGUI();
        });
    }
}
