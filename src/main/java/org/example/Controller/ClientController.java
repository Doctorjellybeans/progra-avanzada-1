/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Controller;

import java.util.List;
import org.example.View.ClientRelated.*;
import org.example.Model.Client;
import org.example.Model.ClientMap;

/**
 *
 * @author doctorjellybeans
 */
public class ClientController {
    // Atributos
    private ClientView clientView;
    private ClientMap clientMapModel;
    
    // Constructor
    public ClientController(ClientView clienView, ClientMap clientMapModel) {
        this.clientView = clienView;
        this.clientMapModel = clientMapModel;
        
        // client view
        this.clientView.getClientButtonAdd().addActionListener(e -> addClient());
        this.clientView.getClientButtonRemove().addActionListener(e -> removeClient());
        this.clientView.getClientButtonSearch().addActionListener(e -> searchClient());
        this.clientView.getClientButtonShowList().addActionListener(e -> showClientList());
        this.clientView.getClientButtonReturn().addActionListener(e -> returnToMainMenu());
    }
    
    // -------------- Interaccion con el modelo -------------- \\
    
    
    // --------------- Interaccion con la vista --------------- \\ 
    
    // En caso de presionar agregar cliente
    private void addClient() {
        AddClientView addClientView = new AddClientView();
        
        // Logica al presionar boton de salir
        addClientView.getClientReturnButton().addActionListener(e -> {
            addClientView.dispose(); 
        });
        
        // Logica al presionar boton de confirmar
        addClientView.getClientConfirmButton().addActionListener(e -> {
            // Obtener campo rut
            String run = addClientView.getRunTextPanel().getText();
            String name = addClientView.getNameTextPanel().getText();
            String email = addClientView.getPhoneTextPanel().getText();
            String phoneNumber = addClientView.getPhoneTextPanel().getText();
            
            Client client = new Client(run, name, email, phoneNumber);
            clientMapModel.addClientToMap(client);
            
            addClientView.showSuccessMessage("Cliente añadido correctamente");
            addClientView.dispose();
        });
        
        
        
        
        // Desplegar la ventana
        addClientView.setLocationRelativeTo(null);
        addClientView.setVisible(true); 
    }
    
    // En caso de presionar remover cliente
    private void removeClient() {
        // lanzar ventana 
        RemoveClientView removeClientView = new RemoveClientView();
        
        // Logica al presionar el boton de confirmar
        removeClientView.getAddClientConfirmButton().addActionListener(e -> {
            String id = removeClientView.getRemoveClientTextField().getText();
            
            Client client = clientMapModel.removeClientFromMap(id); 
            if (client != null) {
                removeClientView.showSuccessMessage("Cliente eliminado\n nombre: "+client.getName());
            } else {
                removeClientView.showSuccessMessage("ERROR la id ingresada no existe");
            }
            removeClientView.dispose();
            
        });
        
        // Logica al presionar boton de salir
        removeClientView.getAddClientReturnButton().addActionListener(e -> {
            removeClientView.dispose();
        });
        
        removeClientView.setLocationRelativeTo(null);
        removeClientView.setVisible(true);
    }
    
    // En caso de presionar buscar cliente
    private void searchClient() {
        // Pedir el ID al usuario (a través de la vista)
        String clientId = clientView.promptClientId();
        
        if (clientId == null) {
            // Si el usuario presiona "Cancelar", cerrar la ventana
            clientView.dispose(); 
            return;
        }

        if (!clientId.trim().isEmpty()) {
            // Buscar en el modelo
            Client client = clientMapModel.getClientInMap(clientId);
            
            if (client != null) {
                // Mostrar informacion del cliente (a traves de la vista)
                clientView.showClientInfo(client);
            } else {
                // Mostrar mensaje de error si no se encuentra el cliente
                clientView.showErrorMessage("Cliente no encontrado");
            }
        } else {
            // Manejar el caso de un ID vacio o no valido
            clientView.showErrorMessage("Por favor, ingrese un ID válido");
        }
    }
    
    // En caso de presionar mostrar lista clientes
    private void showClientList() {
        List<Client> clientList = clientMapModel.getAllClients();
        
        if (clientList.isEmpty()) {
            clientView.showErrorMessage("No hay clientes en la lista");
        } else {
            clientView.displayClients(clientList);
        }
    }
    
    // En caso de presionar devolverse al menu principal
    private void returnToMainMenu() {
        clientView.dispose();
    }
    
}
