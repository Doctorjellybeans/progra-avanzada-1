/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Controller;

import org.example.View.ReserveView;

public class ReserveController {
    // Atributos
    private ReserveView reserveView;
    
    // Constructor
    public ReserveController(ReserveView reserveView) {
        // Vista
        this.reserveView = reserveView;
        
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
    
    }
    
    public void editReserve() {
    
    }
    
    public void removeReserve() {
    
    }
    
    public void searchReserveByFilter() {
    
    }
    
    public void searchReserveById() {
    
    }
    
    public void showReserveList() {
    
    }
    
    public void returnToMainMenu() {
    
    }
}
