package org.example;

public class Fee {

    // Atributos
    private double campingFeePerNight;
    private double cabinFeePerNight;
    private double activityFeePerPerson;

    // Constructor
    public Fee(double campingFeePerNight, double cabinFeePerNight, double activityFeePerPerson) {
        this.campingFeePerNight = campingFeePerNight;
        this.cabinFeePerNight = cabinFeePerNight;
        this.activityFeePerPerson = activityFeePerPerson;
    }

    // Metodos
    public void campingFee()
    {
        System.out.println("La tarifa actual del camping es " + campingFeePerNight);
        System.out.println(" ");
    }

    public void cabinFee()
    {
        System.out.println("La tarifa actual del cabin es " + cabinFeePerNight);
        System.out.println(" ");
    }

    public void activityFee()
    {
        System.out.println("La tarifa actual de la actividad es " + activityFeePerPerson);
        System.out.println(" ");
    }

    // Actualizar la tarifa del camping
    public void updateCampingFee(double newFee) {
        this.campingFeePerNight = newFee;
    }

    // Actualizar la tarifa de las cabañas
    public void updateCabinFee(double newFee) {
        this.cabinFeePerNight = newFee;
    }

    // Actualizar la tarifa de las actividades
    public void updateActivityFee(double newFee) {
        this.activityFeePerPerson = newFee;
    }


    // Getters and setters
    public double getCampingFeePerNight() {
        return campingFeePerNight;
    }

    public void setCampingFeePerNight(double campingFeePerNight) {
        this.campingFeePerNight = campingFeePerNight;
    }

    public double getCabinFeePerNight() {
        return cabinFeePerNight;
    }

    public void setCabinFeePerNight(double cabinFeePerNight) {
        this.cabinFeePerNight = cabinFeePerNight;
    }

    public double getActivityFeePerPerson() {
        return activityFeePerPerson;
    }

    public void setActivityFeePerPerson(double activityFeePerPerson) {
        this.activityFeePerPerson = activityFeePerPerson;
    }
}
