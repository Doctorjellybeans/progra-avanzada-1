/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Controller;

import org.example.View.ParkRelated.ParkView;
import org.example.Model.*;
import javax.swing.*;
import java.util.*;

public class ParkController {
    // Atributos
    private ParkView parkView;
    private Park park;
    
    // Constructor
    public ParkController(ParkView parkView, Park park) {
        // Asignar vista
        this.parkView = parkView;
        this.park = park;
        
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
        List<Reserve> reserveList = park.showCampingReserveList();
        String[] List = (String[]) reserveList.toArray();
        parkView.showCampingClients(List);
    }
    
    private void returnToMainMenu() {
        parkView.dispose();
    }
}
