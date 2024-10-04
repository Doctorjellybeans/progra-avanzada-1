package org.example.Model;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.example.Controller.MainController;
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
        Window mainView = new Window();
        mainView.setVisible(true);
        
        //Se inicializa el controlador
        MainController controller = new MainController(mainView, clientMap, park, fee, filePath);
        
        dataSaver.saveClientsToCSV(filePath);
        //
    }
}