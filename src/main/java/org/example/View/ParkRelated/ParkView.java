/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.View.ParkRelated;

import java.awt.Component;
import java.util.List;
import javax.swing.*;
import org.example.Model.*;

/**
 *
 * @author negas
 */
public class ParkView extends javax.swing.JFrame {

    /**
     * Creates new form ParkView
     */
    public ParkView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parkTitle = new javax.swing.JLabel();
        parkButtonClientsInCabin = new javax.swing.JButton();
        parkButtonClientsInCamping = new javax.swing.JButton();
        parkButtonClientsInActivities = new javax.swing.JButton();
        parkButtonReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parkTitle.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        parkTitle.setText("Administrador de parques");

        parkButtonClientsInCabin.setText("Consultar clientes en cabañas");
        parkButtonClientsInCabin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parkButtonClientsInCabinActionPerformed(evt);
            }
        });

        parkButtonClientsInCamping.setText("Consultar clientes en campings");

        parkButtonClientsInActivities.setText("Consultar clientes en actividades");

        parkButtonReturn.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(parkButtonClientsInCabin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parkButtonClientsInCamping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parkButtonClientsInActivities, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parkButtonReturn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(parkTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(parkTitle)
                .addGap(18, 18, 18)
                .addComponent(parkButtonClientsInCabin)
                .addGap(18, 18, 18)
                .addComponent(parkButtonClientsInCamping)
                .addGap(18, 18, 18)
                .addComponent(parkButtonClientsInActivities)
                .addGap(18, 18, 18)
                .addComponent(parkButtonReturn))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void parkButtonClientsInCabinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parkButtonClientsInCabinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parkButtonClientsInCabinActionPerformed
    
    //Metodos
    public void showCabinClients(List<Reserve> list){
        StringBuilder reserveList = new StringBuilder();
        reserveList.append("Lista de clientes en cabañas: \n");
        
        for( Reserve reserve : list){
            Client actualClient = reserve.getClient();
            reserveList.append(reserve.getReserveId()).append(" \n ").append("      ")
                    .append(actualClient.getName()).append("--").append(actualClient.getRun());
        }
    
        javax.swing.JOptionPane.showMessageDialog(null, reserveList.toString(), "Clientes en cabañas", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void showActivityClients(List<Reserve> list){
        StringBuilder reserveList = new StringBuilder();
        reserveList.append("Lista de clientes en actividades: \n");
        
        for( Reserve reserve : list){
            Client actualClient = reserve.getClient();
            reserveList.append(reserve.getReserveId()).append(" \n ").append("      ")
                    .append(actualClient.getName()).append("--").append(actualClient.getRun());
        }
    
        javax.swing.JOptionPane.showMessageDialog(null, reserveList.toString(), "Clientes en actividades", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void showCampingClients(List<Reserve> list){
        StringBuilder reserveList = new StringBuilder();
        reserveList.append("Lista de clientes en camping: \n");
        
        for( Reserve reserve : list){
            Client actualClient = reserve.getClient();
            reserveList.append(reserve.getReserveId()).append(" \n ").append("      ")
                    .append(actualClient.getName()).append("--").append(actualClient.getRun());
        }
    
        javax.swing.JOptionPane.showMessageDialog(null, reserveList.toString(), "Clientes en campings", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    
        public void showErrorMessage(String message) {
        javax.swing.JOptionPane.showMessageDialog(this, message, "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    // Getters para botones
    public JButton getParkButtonClientsInActivities() {
        return parkButtonClientsInActivities;
    }

    public JButton getParkButtonClientsInCabin() {
        return parkButtonClientsInCabin;
    }

    public JButton getParkButtonClientsInCamping() {
        return parkButtonClientsInCamping;
    }

    public JButton getParkButtonReturn() {
        return parkButtonReturn;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton parkButtonClientsInActivities;
    private javax.swing.JButton parkButtonClientsInCabin;
    private javax.swing.JButton parkButtonClientsInCamping;
    private javax.swing.JButton parkButtonReturn;
    private javax.swing.JLabel parkTitle;
    // End of variables declaration//GEN-END:variables
}
