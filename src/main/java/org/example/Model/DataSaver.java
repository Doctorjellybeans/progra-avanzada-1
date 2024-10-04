/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataSaver {
    private ClientMap clientMap;

    public DataSaver(ClientMap clientMap) {
        this.clientMap = clientMap;
    }

    public void saveClientsToCSV(String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            List<Client> clients = clientMap.getAllClients(); // Método para obtener todos los clientes
            for (Client client : clients) {
                String line = String.join(";", client.getRun(), client.getName(), client.getEmail(), client.getPhoneNumber());
                bw.write(line);
                bw.newLine();
            }
            System.out.println("CSV actualizado correctamente");
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de errores
        }
    }
}
