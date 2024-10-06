/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Controller;

import org.example.View.FeeRelated.FeeView;

public class FeeController {
    // Atributos
    private FeeView feeView;
    
    // Constructor
    public FeeController(FeeView feeView) {
        // Vista principal
        this.feeView = feeView;
        
        // Botones de la vista
        this.feeView.getFeeButtonQueryCabin().addActionListener(e -> queryCabinFee());
        this.feeView.getFeeButtonQueryActivities().addActionListener(e -> queryActivityFee());
        this.feeView.getFeeButtonQueryCamping().addActionListener(e -> queryCampingFee());
        this.feeView.getFeeButtonReturn().addActionListener(e -> returnToMainMenu());
    }
    
    // Acciones de cada JButton en Vista de clientes
    private void queryCabinFee() {
        
    }
    
    private void queryActivityFee() {
    
    }
    
    private void queryCampingFee() {
    
    }
    
    private void returnToMainMenu() {
        feeView.dispose();
    }
}
