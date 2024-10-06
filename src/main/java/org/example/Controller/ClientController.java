/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Controller;

import org.example.View.ClientView;

/**
 *
 * @author doctorjellybeans
 */
public class ClientController {
    // Atributos
    private ClientView clientView;
    
    // Constructor
    public ClientController(ClientView clienView) {
        this.clientView = clienView;
        this.clientView.getClientButtonAdd().addActionListener(e -> addClient());
        this.clientView.getClientButtonRemove().addActionListener(e -> removeClient());
        this.clientView.getClientButtonReturn().addActionListener(e -> returnToMainMenu());
        this.clientView.getClientButtonSearch().addActionListener(e -> searchClient());
        this.clientView.getClientButtonShowList().addActionListener(e -> showClientList());
    }
    
    
    // Acciones de cada JButton en Vista de clientes
    private void addClient() {
        
    }
    
    private void removeClient() {
    
    }
    
    private void returnToMainMenu() {
    
    }
    
    private void searchClient() {
    
    }
    
    private void showClientList() {
    
    }
    
}
