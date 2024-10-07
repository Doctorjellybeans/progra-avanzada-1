package org.example.App;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.example.Controller.MainController;
import org.example.Model.ClientMap;
import org.example.Model.DataLoader;
import org.example.Model.DataSaver;
import org.example.Model.Fee;
import org.example.Model.Park;
import org.example.View.*;

public class Main {
    public static void main(String[] args) {

        // Manejo de i/o
        Scanner scanner = new Scanner(System.in);
        ClientMap clientMap = new ClientMap();
        Park park = new Park(10,25,15);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Fee fee = new Fee(20.0, 100.0, 15.0);
        DataSaver dataSaver = new DataSaver(clientMap);
        String filePath = "C:\\Users\\negas\\Documents\\NetBeansProjects\\progra-avanzada-1\\src\\main\\java\\org\\example\\Datos_Iniciales.csv";
        
        
        //Cargar Datos iniciales
        DataLoader dataLoader = new DataLoader(clientMap);
        dataLoader.loadClientsFromCSV(filePath);

        //Se inicializa la vista
        MenuView mainView = new MenuView();
        mainView.setVisible(true);
        mainView.setLocationRelativeTo(null);
        
        //Se inicializa el controlador
        MainController controller = new MainController(mainView, filePath, park, formatter, fee, clientMap);
        
        dataSaver.saveClientsToCSV(filePath);
        //
    }
}