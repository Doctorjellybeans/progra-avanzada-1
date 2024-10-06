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
        String message = "La tarifa actual de las cabañas es de $"+ actualFee.getCabinFeePerNight();
        feeView.showCabinFee(message);
    }
    
    private void queryActivityFee() {
        String message = "La tarifa actual de las actividades es de $"+ actualFee.getActivityFeePerPerson();
        feeView.showActivityFee(message);
    }
    
    private void queryCampingFee() {
        String message = "La tarifa actual del camping es de $"+ actualFee.getCampingFeePerNight();
        feeView.showCampingFee(message);
    }
    
    private void returnToMainMenu() {
        feeView.dispose();
    }
}
