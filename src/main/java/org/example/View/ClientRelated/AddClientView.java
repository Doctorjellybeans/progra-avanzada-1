/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.View.ClientRelated;

import javax.swing.JButton;
import javax.swing.JTextPane;

/**
 *
 * @author doctorjellybeans
 */
public class AddClientView extends javax.swing.JFrame {
    
    // COnstructor
    public AddClientView() {
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        runScrollPanel = new javax.swing.JScrollPane();
        runTextPanel = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        nameScrollPanel = new javax.swing.JScrollPane();
        nameTextPanel = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        emailScrollPanel = new javax.swing.JScrollPane();
        emailTextPanel = new javax.swing.JTextPane();
        phoneScrollPanel = new javax.swing.JScrollPane();
        phoneTextPanel = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        clientConfirmButton = new javax.swing.JButton();
        clientReturnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresa un run");

        runScrollPanel.setViewportView(runTextPanel);

        jLabel2.setText("Ingresa un nombe:");

        nameScrollPanel.setViewportView(nameTextPanel);

        jLabel3.setText("Ingresa un email:");

        emailScrollPanel.setViewportView(emailTextPanel);

        phoneScrollPanel.setViewportView(phoneTextPanel);

        jLabel4.setText("Ingresa un numero de telefono:");

        clientConfirmButton.setText("Confirmar");
        clientConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientConfirmButtonActionPerformed(evt);
            }
        });

        clientReturnButton.setText("Salir");
        clientReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientReturnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clientReturnButton))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(phoneScrollPanel)
                            .addComponent(emailScrollPanel)
                            .addComponent(nameScrollPanel)
                            .addComponent(runScrollPanel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(clientConfirmButton)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(runScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clientConfirmButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clientReturnButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientConfirmButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientConfirmButtonActionPerformed

    private void clientReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientReturnButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientReturnButtonActionPerformed
    
    // Metodos
    public void showSuccessMessage(String message) {
        javax.swing.JOptionPane.showMessageDialog(this, message, "Confirmación", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Getters para los botones y los paneles de texto
    public JButton getClientConfirmButton() {
        return clientConfirmButton;
    }

    public JButton getClientReturnButton() {
        return clientReturnButton;
    }

    public JTextPane getEmailTextPanel() {
        return emailTextPanel;
    }

    public JTextPane getNameTextPanel() {
        return nameTextPanel;
    }

    public JTextPane getPhoneTextPanel() {
        return phoneTextPanel;
    }

    public JTextPane getRunTextPanel() {
        return runTextPanel;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientConfirmButton;
    private javax.swing.JButton clientReturnButton;
    private javax.swing.JScrollPane emailScrollPanel;
    private javax.swing.JTextPane emailTextPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane nameScrollPanel;
    private javax.swing.JTextPane nameTextPanel;
    private javax.swing.JScrollPane phoneScrollPanel;
    private javax.swing.JTextPane phoneTextPanel;
    private javax.swing.JScrollPane runScrollPanel;
    private javax.swing.JTextPane runTextPanel;
    // End of variables declaration//GEN-END:variables
}
