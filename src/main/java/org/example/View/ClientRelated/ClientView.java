/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.View.ClientRelated;

import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.example.Model.Client;

/**
 *
 * @author negas
 */
public class ClientView extends javax.swing.JFrame {
    // Constructor
    public ClientView() {
        
        
        initComponents();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientTitle = new javax.swing.JLabel();
        clientButtonAdd = new javax.swing.JButton();
        clientButtonRemove = new javax.swing.JButton();
        clientButtonSearch = new javax.swing.JButton();
        clientButtonShowList = new javax.swing.JButton();
        clientButtonReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clientTitle.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        clientTitle.setText("Gestion de clientes");

        clientButtonAdd.setText("Agregar");

        clientButtonRemove.setText("Eliminar");

        clientButtonSearch.setText("Buscar");

        clientButtonShowList.setText("Lista de Clientes");

        clientButtonReturn.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(clientTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clientButtonShowList, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(clientButtonSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clientButtonAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(clientButtonRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clientButtonReturn))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(clientTitle)
                .addGap(18, 18, 18)
                .addComponent(clientButtonAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientButtonRemove)
                .addGap(18, 18, 18)
                .addComponent(clientButtonSearch)
                .addGap(18, 18, 18)
                .addComponent(clientButtonShowList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(clientButtonReturn))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Metodos adicionales
    public String promptClientId() {
        return javax.swing.JOptionPane.showInputDialog(this, "Ingrese el ID del cliente:", "Buscar Cliente", javax.swing.JOptionPane.QUESTION_MESSAGE);
    }
    
    public void showClientInfo(Client client) {
        String clientInfo = "Cliente encontrado:\n" +
                            "ID: " + client.getRun() + "\n" +
                            "Nombre: " + client.getName() + "\n" +
                            "Email: " + client.getEmail() + "\n" +
                            "Teléfono: " + client.getPhoneNumber();
        javax.swing.JOptionPane.showMessageDialog(this, clientInfo, "Resultado de Búsqueda", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void displayClients(List<Client> list) {
        StringBuilder clientList = new StringBuilder();
        clientList.append("Lista de Clientes:\n");
        
        for (Client client : list) {
            clientList.append(client.getRun())
                      .append(" - ")
                      .append(client.getName())
                      .append("\n");
        }

        // Mostrar la lista de clientes en un JOptionPane
        javax.swing.JOptionPane.showMessageDialog(null, clientList.toString(), "Clientes Registrados", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void showErrorMessage(String message) {
        javax.swing.JOptionPane.showMessageDialog(this, message, "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    
    // Getters para botones
    public JButton getClientButtonAdd() {
        return clientButtonAdd;
    }

    public JButton getClientButtonRemove() {
        return clientButtonRemove;
    }

    public JButton getClientButtonReturn() {
        return clientButtonReturn;
    }

    public JButton getClientButtonSearch() {
        return clientButtonSearch;
    }

    public JButton getClientButtonShowList() {
        return clientButtonShowList;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientButtonAdd;
    private javax.swing.JButton clientButtonRemove;
    private javax.swing.JButton clientButtonReturn;
    private javax.swing.JButton clientButtonSearch;
    private javax.swing.JButton clientButtonShowList;
    private javax.swing.JLabel clientTitle;
    // End of variables declaration//GEN-END:variables
}
