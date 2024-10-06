package org.example.Controller;


import org.example.View.ReserveRelated.ReserveView;
import org.example.View.ParkRelated.ParkView;
import org.example.View.FeeRelated.FeeView;
import org.example.View.ClientRelated.ClientView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import org.example.Model.*;
import org.example.View.*;

public class MainController {

    private MenuView mainView;
    private Fee actualFee;

    public MainController(MenuView mainView, String path, Scanner scanner, Park park, DateTimeFormatter formatter, Fee fee) {
        //String filePath = path;
        //Se leen los valores iniciales del codigo
        this.actualFee = fee;
        
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
       ClientView clientView = new ClientView();
       new ClientController(clientView);
       clientView.setLocationRelativeTo(null);
       clientView.setVisible(true);
       
    }
    
    public void openReserveWindow() {
       ReserveView reserveView = new ReserveView();
       new ReserveController(reserveView);
       reserveView.setLocationRelativeTo(null);
       reserveView.setVisible(true);
    }
    
    public void openFeeWindow() {
       FeeView feeView = new FeeView();
       new FeeController(feeView, actualFee);
       feeView.setLocationRelativeTo(null);
       feeView.setVisible(true);
    }
    
    public void openParkWindow() {
       ParkView parkView = new ParkView();
       new ParkController(parkView);
       parkView.setLocationRelativeTo(null);
       parkView.setVisible(true);
    }
    
    public void exit() {
        System.exit(0);
    }
    
}