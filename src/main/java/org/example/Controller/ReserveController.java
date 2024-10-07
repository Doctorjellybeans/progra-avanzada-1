/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.example.View.ReserveRelated.*;
import org.example.Model.*;

public class ReserveController {
    // Atributos
    private ReserveView reserveView;
    private Park parkModel;
    private ClientMap clientMapModel;
    
    // Constructor
    public ReserveController(ReserveView reserveView, Park park, ClientMap clientMap) {
        // Vista
        this.reserveView = reserveView;
        this.parkModel = park;
        clientMapModel = clientMap;
        
        // Botones
        this.reserveView.getReserveButtonAdd().addActionListener(e -> addReserve());
        this.reserveView.getReserveButtonEdit().addActionListener(e -> editReserve());
        this.reserveView.getReserveButtonRemove().addActionListener(e -> removeReserve());
        this.reserveView.getReserveButtonSearchByFilter().addActionListener(e -> searchReserveByFilter());
        this.reserveView.getReserveButtonSearchById().addActionListener(e -> searchReserveById());
        this.reserveView.getReserveButtonShowList().addActionListener(e -> showReserveList());
        this.reserveView.getReserveButtonReturn().addActionListener(e -> returnToMainMenu());
    }
    
    
    // Acciones de cada JButton en Vista de clientes
    public void addReserve() {
        AddReserveView addReserveView = new AddReserveView();
        
        // Logica al presionar boton de salir
        addReserveView.getSalida().addActionListener(e -> {
            addReserveView.dispose(); 
        });
        
        // Logica al presionar boton de confirmar
        addReserveView.getClientConfirmButton().addActionListener(e -> {
            // Obtener campo rut
            String reserveID = addReserveView.getReserveID().getText();
            String clientID = addReserveView.getClientID().getText();
            String startDate = addReserveView.getStartDate().getText();
            String endDate = addReserveView.getEndDate().getText();
            String personTents = addReserveView.getQuantity().getText();
            String reserveType = addReserveView.getReserveType().getText();
            
            Client client = clientMapModel.getClientInMap(clientID);
            
            //Para camping
            if(reserveType.equals("1"))
            {
                LocalDate start = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                int tents = Integer.parseInt(personTents);
                int ID = Integer.parseInt(reserveID);
                CampingReserve newReserve = new CampingReserve(ID,clientID,start,end,tents);  
                parkModel.addReserve(client, newReserve);
            }
            //Para actividad
            if(reserveType.equals("2"))
            {
                LocalDate start = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                int tents = Integer.parseInt(personTents);
                int ID = Integer.parseInt(reserveID);
                ActivityReserve newReserve = new ActivityReserve(ID,clientID,start,end,"Trekking",tents);  
                parkModel.addReserve(client, newReserve);
            }
            //Para cabaña
            if(reserveType.equals("3"))
            {
                LocalDate start = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                int tents = Integer.parseInt(personTents);
                int ID = Integer.parseInt(reserveID);
                CabinReserve newReserve = new CabinReserve(ID,clientID,start,end,tents); 
                parkModel.addReserve(client, newReserve);
            }
            
            
            javax.swing.JOptionPane.showConfirmDialog(addReserveView,"Reserva añadida correctamente");
            addReserveView.dispose();
        });

        // Desplegar la ventana
        addReserveView.setLocationRelativeTo(null);
        addReserveView.setVisible(true); 
       
    }
    
    public void editReserve() {
        EditReserveView editReserve = new EditReserveView();
        editReserve.getSalida().addActionListener(e -> {
            editReserve.dispose(); 
        });
        
        editReserve.getClientConfirmButton().addActionListener(e -> {
            Reserve actualReserve = parkModel.searchReserve(editReserve.getReserveID().getText());
            if( actualReserve != null){
                String newStartDate = editReserve.getStartDate().getText();
                String newEndDate = editReserve.getEndDate().getText();
                String newPersonTents = editReserve.getPersonTents().getText();
              
                actualReserve.setStartDate(LocalDate.parse(newStartDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                actualReserve.setEndDate(LocalDate.parse(newEndDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                
                
                javax.swing.JOptionPane.showConfirmDialog(reserveView, "Reserva actualizada correctamente");
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(reserveView, "El ID ingresado no existe");
            }
            editReserve.dispose();
        });
        // Desplegar la ventana
        editReserve.setLocationRelativeTo(null);
        editReserve.setVisible(true); 
    }
    
    public void removeReserve() {
    
    }
    
    public void searchReserveByFilter() {
        ReserveTypeView filtered = new ReserveTypeView();
        
        filtered.getSalida().addActionListener(e -> {
                filtered.dispose();
        });
    }
    
    public void searchReserveById() {
    
    }
    
    public void showReserveList() {
    
    }
    
    public void selectReserveType(){
        ReserveTypeView reserveType = new ReserveTypeView();
        
        // Logica al presionar boton de salir
        reserveType.getSalida().addActionListener(e -> {
            reserveType.dispose(); 
        });
        reserveType.setLocationRelativeTo(null);
        reserveType.setVisible(true);
    }
    
    public void returnToMainMenu() {
        reserveView.dispose();
    }
}
