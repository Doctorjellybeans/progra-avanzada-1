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
        List<Reserve> reserveList = park.showActivityReserveList();
        if (reserveList == null) {
            parkView.showErrorMessage("ERROR, lista nula");
        } else  if (reserveList.isEmpty()){
            parkView.showErrorMessage("No hay clientes con reservas en las actividades");
        } else {
            parkView.showCampingClients(reserveList);
        }
        
    }
    
    private void clientsInCabin() {
        List<Reserve> reserveList = park.showCabinReserveList();
        
        if (reserveList == null) {
            parkView.showErrorMessage("ERROR, lista nula");
        } else  if (reserveList.isEmpty()){
            parkView.showErrorMessage("No hay clientes con reservas en las cabañas");
        } else {
            parkView.showCampingClients(reserveList);
        }
    }
    
    private void clientsInCamping() {
        List<Reserve> reserveList = park.showCampingReserveList();
        if (reserveList == null) {
            parkView.showErrorMessage("ERROR, lista nula");
        } else  if (reserveList.isEmpty()){
            parkView.showErrorMessage("No hay clientes con reservas en los campings");
        } else {
            parkView.showCampingClients(reserveList);
        }
        
    }
    
    private void returnToMainMenu() {
        parkView.dispose();
    }
}
