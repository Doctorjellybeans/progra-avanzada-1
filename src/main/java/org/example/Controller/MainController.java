package org.example.Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.example.Model.*;
import org.example.View.*;

public class MainController {

    private MenuView mainView;

    public MainController(MenuView mainView, String path) {
        //String filePath = path;
        
        // Asignar vista
        this.mainView = mainView;
        
        // Asignar listeners a cada boton
        this.mainView.getClientMenuButton().addActionListener(e -> openClientWindow());
        this.mainView.getReserveMenuButton().addActionListener(e -> openReserveWindow());
        this.mainView.getFeeMenuButton().addActionListener(e -> openFeeWindow());
        this.mainView.getParkMenuButton().addActionListener(e -> openParkWindow());
        this.mainView.getExitMenuButton().addActionListener(e -> exit());
        
        
    }
    
    public void openClientWindow() {
        
    }
    
    public void openReserveWindow() {
    
    }
    
    public void openFeeWindow() {
    
    }
    
    public void openParkWindow() {
        
    }
    
    public void exit() {
    
    }
    
}