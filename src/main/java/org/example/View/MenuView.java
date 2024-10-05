package org.example.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuView extends JFrame {

    private JButton clientButton;
    private JButton reserveButton;
    private JButton feeButton;
    private JButton parkButton;
    private JButton exitButton;

    public MenuView() {
        // Configuración de la ventana
        setTitle("Sistema de Administración");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        // Crear botones
        clientButton = new JButton("Administrar Clientes");
        reserveButton = new JButton("Administrar Reservas");
        feeButton = new JButton("Administrar Tarifas");
        parkButton = new JButton("Administrar Parque");
        exitButton = new JButton("Salir");

        // Agregar botones al layout
        add(clientButton);
        add(reserveButton);
        add(feeButton);
        add(parkButton);
        add(exitButton);

        // Hacer la ventana visible
        setVisible(true);
    }

    // Métodos para asignar ActionListener a los botones
    public void setClientButtonListener(ActionListener listener) {
        clientButton.addActionListener(listener);
    }

    public void setReserveButtonListener(ActionListener listener) {
        reserveButton.addActionListener(listener);
    }

    public void setFeeButtonListener(ActionListener listener) {
        feeButton.addActionListener(listener);
    }

    public void setParkButtonListener(ActionListener listener) {
        parkButton.addActionListener(listener);
    }

    public void setExitButtonListener(ActionListener listener) {
        exitButton.addActionListener(listener);
    }
}
