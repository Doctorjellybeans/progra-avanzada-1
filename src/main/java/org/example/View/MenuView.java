package org.example.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuView extends JFrame {

    private JButton clientMenuButton;
    private JButton reserveMenuButton;
    private JButton feeMenuButton;
    private JButton parkMenuButton;
    private JButton exitMenuButton;

    public MenuView() {
        // Configuración de la ventana
        setTitle("Sistema de Administración");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        // Crear botones
        clientMenuButton = new JButton("Administrar Clientes");
        reserveMenuButton = new JButton("Administrar Reservas");
        feeMenuButton = new JButton("Administrar Tarifas");
        parkMenuButton = new JButton("Administrar Parque");
        exitMenuButton = new JButton("Salir");

        // Agregar botones al layout
        add(clientMenuButton);
        add(reserveMenuButton);
        add(feeMenuButton);
        add(parkMenuButton);
        add(exitMenuButton);

        // Hacer la ventana visible
        setVisible(true);
    }
    
    // Getters de botones ventana main
    public JButton getClientMenuButton() {
        return clientMenuButton;
    }

    public JButton getReserveMenuButton() {
        return reserveMenuButton;
    }

    public JButton getFeeMenuButton() {
        return feeMenuButton;
    }

    public JButton getParkMenuButton() {
        return parkMenuButton;
    }

    public JButton getExitMenuButton() {
        return exitMenuButton;
    }
    

    // Métodos para asignar ActionListener a los botones
    public void setClientButtonListener(ActionListener listener) {
        clientMenuButton.addActionListener(listener);
    }

    public void setReserveButtonListener(ActionListener listener) {
        reserveMenuButton.addActionListener(listener);
    }

    public void setFeeButtonListener(ActionListener listener) {
        feeMenuButton.addActionListener(listener);
    }

    public void setParkButtonListener(ActionListener listener) {
        parkMenuButton.addActionListener(listener);
    }

    public void setExitButtonListener(ActionListener listener) {
        exitMenuButton.addActionListener(listener);
    }
}
