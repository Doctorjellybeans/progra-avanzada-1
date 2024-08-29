package org.example;

import java.time.LocalDate;

public class CampingReserve extends Reserve {

    // Atributos
    private int numTent;
    private static final double CAMPING_FEE = 20.0;

    // Constructor
    public CampingReserve(int reserveId, Client client, LocalDate startDate, LocalDate endDate, int numTent) {
        super(reserveId, client, startDate, endDate);
        this.numTent = numTent;
        calculateCost();
    }

    // Metodos
    @Override // calcula costos en base al numero de tiendas
    public void calculateCost() {
        long days = java.time.temporal.ChronoUnit.DAYS.between(startDate,endDate);
        this.totalCost = days * numTent * CAMPING_FEE;
    }

    @Override // Muestra detalles especificos de la reserva de camping
    public void showDetails() {
        System.out.println("#------------------ RESERVE INFO ------------------#");
        System.out.println("Id de la reserva de camping: " + reserveId);
        System.out.println("Run cliente asociado: " + client.getRun());
        System.out.println("Fecha de inicio : " + startDate);
        System.out.println("Fecha de termino: " + endDate);
        System.out.println("Costo total: " + totalCost);
        System.out.println("#------------------ RESERVE INFO ------------------#");
        return;
    }

    // Getters and setters
    public int getNumTent() {
        return numTent;
    }

    public void setNumTent(int numTent) {
        this.numTent = numTent;
    }
}
