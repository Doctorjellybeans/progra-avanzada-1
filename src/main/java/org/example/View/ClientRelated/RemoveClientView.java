/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.View.ClientRelated;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author doctorjellybeans
 */
public class RemoveClientView extends javax.swing.JFrame {

    // Constructor
    public RemoveClientView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        removeClientTextField = new javax.swing.JTextField();
        addClientReturnButton = new javax.swing.JButton();
        addClientConfirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese la id del cliente a eliminar");

        removeClientTextField.setText("jTextField1");

        addClientReturnButton.setText("Salir");

        addClientConfirmButton.setText("Confirmar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addClientReturnButton))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeClientTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(addClientConfirmButton)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeClientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addClientConfirmButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addClientReturnButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Metodos
    public void showSuccessMessage(String message) {
        javax.swing.JOptionPane.showMessageDialog(this, message, "Confirmación", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Getters
    public JButton getAddClientConfirmButton() {
        return addClientConfirmButton;
    }

    public JButton getAddClientReturnButton() {
        return addClientReturnButton;
    }

    public JTextField getRemoveClientTextField() {
        return removeClientTextField;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClientConfirmButton;
    private javax.swing.JButton addClientReturnButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField removeClientTextField;
    // End of variables declaration//GEN-END:variables
}
