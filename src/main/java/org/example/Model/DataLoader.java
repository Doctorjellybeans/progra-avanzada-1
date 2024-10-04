/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataLoader {
    private ClientMap clientMap; // Suponiendo que tienes una clase ClientMap para manejar clientes

    public DataLoader(ClientMap clientMap) {
        this.clientMap = clientMap;
    }

    public void loadClientsFromCSV(String filePath) {
        String line;
        String csvSplitBy = ";"; // Asumiendo que los datos están separados por comas

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                if (data.length == 4) { // Asegurarse de que hay cuatro campos
                    String run = data[0];
                    String name = data[1];
                    String email = data[2];
                    String phoneNumber = data[3];
                    Client client = new Client(run, name, email, phoneNumber);
                    clientMap.addClientToMap(client); // Método para agregar el cliente al mapa
                }
            }
            System.out.println("CSV cargado correctamente");
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de errores
        }
    }
}
