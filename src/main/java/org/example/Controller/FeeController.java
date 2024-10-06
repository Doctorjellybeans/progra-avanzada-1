/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Controller;

import org.example.View.FeeRelated.FeeView;
import javax.swing.*;
import org.example.Model.Fee;
public class FeeController {
    // Atributos
    private FeeView feeView;
    private Fee actualFee;
    
    // Constructor
    public FeeController(FeeView feeView, Fee newFee) {
        // Vista principal
        this.feeView = feeView;
        this.actualFee = newFee;
        
        // Botones de la vista
        this.feeView.getFeeButtonQueryCabin().addActionListener(e -> queryCabinFee());
        this.feeView.getFeeButtonQueryActivities().addActionListener(e -> queryActivityFee());
        this.feeView.getFeeButtonQueryCamping().addActionListener(e -> queryCampingFee());
        this.feeView.getFeeButtonReturn().addActionListener(e -> returnToMainMenu());
    }
    
    // Acciones de cada JButton en Vista de clientes
    private void queryCabinFee() {
        JDialog cabinFee = new JDialog(feeView, "Tarifa de cabañas");
        cabinFee.setBounds(100,100,320,100);
        JLabel fee = new JLabel("    La tarifa actual de las cabañas es de $" + actualFee.getCabinFeePerNight());
        cabinFee.setLocationRelativeTo(null);
        cabinFee.add(fee);
        cabinFee.setVisible(true);
    }
    
    private void queryActivityFee() {
        JDialog cabinFee = new JDialog(feeView, "Tarifa de actividades");
        cabinFee.setBounds(100,100,320,100);
        JLabel fee = new JLabel("    La tarifa actual de las actividades es de $" + actualFee.getActivityFeePerPerson());
        cabinFee.setLocationRelativeTo(null);
        cabinFee.add(fee);
        cabinFee.setVisible(true);
    }
    
    private void queryCampingFee() {
        JDialog cabinFee = new JDialog(feeView, "Tarifa del camping");
        cabinFee.setBounds(100,100,320,100);
        JLabel fee = new JLabel("    La tarifa actual del camping es de $" + actualFee.getCampingFeePerNight());
        cabinFee.setLocationRelativeTo(null);
        cabinFee.add(fee);
        cabinFee.setVisible(true);
    }
    
    private void returnToMainMenu() {
        feeView.dispose();
    }
}
