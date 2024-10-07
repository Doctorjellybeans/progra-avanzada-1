package org.example.Model;

import java.time.LocalDate;

public class ActivityReserve extends Reserve {

    // Atributos
    private String activityName;
    private int numPeople;
    private static final double ACTIVITY_FEE = 15.0;

    // Constructor
    public ActivityReserve(int reserveId, String clientId, LocalDate startDate, LocalDate endDate, String activityName, int numPeople) {
        super(reserveId, clientId, startDate, endDate);
        this.activityName = activityName;
        this.numPeople = numPeople;
    }

    // Metodos
    // Calcula el costo en base a las tarifas por participante
    @Override
    public void calculateCost() {
        this.totalCost = numPeople * ACTIVITY_FEE;
    }

    @Override // Muestra detalles especificos de actividad guiada
    public void showDetails() {
        System.out.println("#------------------ RESERVE INFO ------------------#");
        System.out.println("ID actividad guiada: " + reserveId);
        System.out.println("Run cliente asociado: " + clientId);
        System.out.println("Fecha de inicio: " + startDate);
        System.out.println("Fecha de termino: " + endDate);
        System.out.println("Nombre de la actividad: " +  activityName);
        System.out.println("Numero de participantes: " + numPeople);
        System.out.println("Costo total: " + totalCost);
        System.out.println("#------------------ ------------ ------------------#");
    }

    // Getters and setters
    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }
}
