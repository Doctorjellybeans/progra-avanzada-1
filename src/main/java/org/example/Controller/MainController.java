package org.example.Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.example.Model.*;
import org.example.View.*;

public class MainController {

    private MenuView mainView;
    private ClientMap clientMap;
    private Park park;
    private Fee fee;
    private DataSaver dataSaver;
    private String filePath;

    public MainController(MenuView mainView, ClientMap clientMap, Park park, Fee fee, String path) {
        this.mainView = mainView;
        this.clientMap = clientMap;
        this.park = park;
        this.fee = fee;
        
        filePath = path;

        // Asignar listeners a los botones
        mainView.setClientButtonListener(new ClientButtonListener());
        mainView.setReserveButtonListener(new ReserveButtonListener());
        mainView.setFeeButtonListener(new FeeButtonListener());
        mainView.setParkButtonListener(new ParkButtonListener());
        mainView.setExitButtonListener(new ExitButtonListener());
    }

    // Listener para el botón de "Administrar clientes"
    class ClientButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Lógica para gestionar clientes (aquí puedes abrir un nuevo JFrame, etc.)
            System.out.println("Gestionar clientes");
            ClientView client = new ClientView();
            client.setVisible(true);
        }
    }

    // Listener para el botón de "Administrar reservas"
    class ReserveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Lógica para gestionar reservas
            System.out.println("Gestionar reservas");
            ReserveView reserve = new ReserveView();
            reserve.setVisible(true);
        }
    }

    // Listener para el botón de "Administrar tarifas"
    class FeeButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Lógica para gestionar tarifas
            System.out.println("Gestionar tarifas");
            FeeView fee = new FeeView();
            fee.setVisible(true);
        }
    }

    // Listener para el botón de "Administrar parque"
    class ParkButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Lógica para gestionar parque
            System.out.println("Gestionar parque");
            ParkView park = new ParkView();
            park.setVisible(true);
        }
    }

    // Listener para el botón de "Salir"
    class ExitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}