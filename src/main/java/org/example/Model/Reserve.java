package org.example.Model;

import java.time.LocalDate;

public abstract class Reserve {

    // Atributos para clase-subclase
    protected int reserveId;
    protected Client client;
    protected LocalDate startDate;
    protected LocalDate endDate;
    protected double totalCost;

    // Constructor
    public Reserve(int reserveId, Client client, LocalDate startDate, LocalDate endDate) {
        this.reserveId = reserveId;
        this.client = client;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalCost = 0.0;
    }

    // Metodos
    // calcular costo en base a las tarifas
    public void calculateCost() {


    }

    // muestra detalles especificos de las tarifas y las cabañas
    public void showDetails() {

    }

    // Getters and setters
    public int getReserveId() {
        return reserveId;
    }

    public void setReserveId(int reserveId) {
        this.reserveId = reserveId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
