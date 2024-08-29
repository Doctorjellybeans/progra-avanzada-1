package org.example;

import java.time.LocalDate;

public class CabinReserve extends Reserve {

    // Atributos
    private int numPerson;
    private static final double CABIN_FEE = 100.0;

    // Constructor
    public CabinReserve(int reserveId, Client client, LocalDate startDate, LocalDate endDate, int numPerson) {
        super(reserveId,client,startDate,endDate);
        this.numPerson = numPerson;
        calculateCost();
    }

    // Metodos
    // Calcula el costo en base a la tarifa por cabaña y duracion de la estancia
    public void calculateCabinCost() {
        long days = java.time.temporal.ChronoUnit.DAYS.between(startDate,endDate); //que es esta wea?
        this.totalCost = CABIN_FEE * days;
    }

    @Override // Muestra detalles de la reserva de la cabaña
    public void showDetails() {
        System.out.println("#------------------ RESERVE INFO ------------------#");
        System.out.println("Id de la reserva de cabaña: " + reserveId);
        System.out.println("Run del cliente asociado: " + client.getRun());
        System.out.println("Fecha de inicio : " + startDate);
        System.out.println("Fecha de termino: " + endDate);
        System.out.println("Numero de personas: " + numPerson);
        System.out.println("Costo total: " + totalCost);
        System.out.println("#------------------ RESERVE INFO ------------------#");
        return;
    }

    // Getters and setters
    public int getNumPerson() {
        return numPerson;
    }

    public void setNumPerson(int numPerson) {
        this.numPerson = numPerson;
    }
}
