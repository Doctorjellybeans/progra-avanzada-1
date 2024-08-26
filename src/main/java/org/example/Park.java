package org.example;

import java.util.ArrayList;

public class Park {

    // Atributos
    private ArrayList<Reserve> reserveList;
    private int maxCampingCapacity;
    private int maxCabinCapacity;
    private int maxActitvityCapacity;

    // Constructor

    // Metodos

    // Getters and setters
    public ArrayList<Reserve> getReserveList() {
        return reserveList;
    }

    public void setReserveList(ArrayList<Reserve> reserveList) {
        this.reserveList = reserveList;
    }

    public int getMaxCampingCapacity() {
        return maxCampingCapacity;
    }

    public void setMaxCampingCapacity(int maxCampingCapacity) {
        this.maxCampingCapacity = maxCampingCapacity;
    }

    public int getMaxCabinCapacity() {
        return maxCabinCapacity;
    }

    public void setMaxCabinCapacity(int maxCabinCapacity) {
        this.maxCabinCapacity = maxCabinCapacity;
    }

    public int getMaxActitvityCapacity() {
        return maxActitvityCapacity;
    }

    public void setMaxActitvityCapacity(int maxActitvityCapacity) {
        this.maxActitvityCapacity = maxActitvityCapacity;
    }
}
