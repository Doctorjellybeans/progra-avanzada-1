package org.example.Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ClientMap {
    // Atributos
    private HashMap<String,Client> clientMap;

    // Constructor
    public ClientMap() {
        this.clientMap = new HashMap<>();
    }


    // Metodos
    // Añade un cliente al mapa de clientes
    public void addClientToMap(Client client) {
        if (client == null) { return; }

        // Verificamos si el cliente no fue añadido anteriormente
        if (clientMap.containsKey(client.getRun())) {
            System.out.println("El cliente ya fue ingresado en sistema, terminando proceso");
            return;
        } else {
            // lo ingresamos a el mapa
            clientMap.put(client.getRun(), client);
        }
    }

    public void removeClientFromMap(Scanner scanner) { // Pasar Scanner como argumento
        System.out.print("Ingrese el run del cliente que desea eliminar del sistema: ");

        // Verificamos si hay una línea disponible
        if (scanner.hasNextLine()) {
            String key = scanner.nextLine().trim();
            if (clientMap.containsKey(key)) {
                clientMap.remove(key);
                System.out.println("Cliente con RUN " + key + " eliminado exitosamente.");
            } else {
                System.out.println("El cliente con RUN " + key + " no se encuentra en el sistema.");
            }
        } else {
            System.out.println("No se encontró ninguna línea de entrada.");
        }
    }

    public Boolean searchForClientInMap(Scanner scanner) {
        System.out.println("#-------------------------- BUSCANDO ---------------------------#");
        System.out.print("Ingrese el run del cliente que desea buscar en el sistema: ");

        // Verificamos si hay una línea disponible
        if (scanner.hasNextLine()) {
            String key = scanner.nextLine().trim();
            if (clientMap.containsKey(key)) {
                System.out.println("El cliente con RUN " + key + " si se encuentra en el sistema");
                System.out.println("#---------------------------------------------------------------#");
                return true;
            } else {
                System.out.println("El cliente con RUN " + key + " no se encuentra en el sistema.");
                System.out.println("#---------------------------------------------------------------#");
                return false;
            }

        } else {
            System.out.println("No se encontró ninguna línea de entrada.");
            System.out.println("#---------------------------------------------------------------#");
            return false;
        }
    }

    public void showClientMap() {
        for (Map.Entry<String, Client> entry : clientMap.entrySet()) {
            // String clientId = entry.getKey(); por el momento no es necesaria esta linea de codigo
            Client client = entry.getValue();  // Obtiene el valor (objeto Cliente)
            client.showClientInfo(); // Mostrar la información del cliente en la consola
        }
    }
    
    //Metodo para obtener todos los clientes
    public List<Client> getAllClients() {
        return new ArrayList<>(clientMap.values()); // Devuelve una lista de todos los valores (clientes)
    }
    
    // Getters and setters
    public HashMap<String, Client> getClientMap() {
        return clientMap;
    }

    public void setClientMap(HashMap<String, Client> clientMap) {
        this.clientMap = clientMap;
    }
}
