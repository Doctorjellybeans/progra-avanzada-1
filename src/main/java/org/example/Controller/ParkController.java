/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Controller;

import org.example.View.ParkRelated.ParkView;

public class ParkController {
    // Atributos
    private ParkView parkView;
    
    // Constructor
    public ParkController(ParkView parkView) {
        // Asignar vista
        this.parkView = parkView;
        
        // Asignar listeners a botones
        this.parkView.getParkButtonClientsInActivities().addActionListener(e -> clientsInActivities());
        this.parkView.getParkButtonClientsInCabin().addActionListener(e -> clientsInCabin());
        this.parkView.getParkButtonClientsInCamping().addActionListener(e -> clientsInCamping());
        this.parkView.getParkButtonReturn().addActionListener(e -> returnToMainMenu());
    }
    
    // Acciones de los JButtons en la vista
    private void clientsInActivities() {
    
    }
    
    private void clientsInCabin() {
    
    }
    
    private void clientsInCamping() {
    
    }
    
    private void returnToMainMenu() {
        parkView.dispose();
    }
}
