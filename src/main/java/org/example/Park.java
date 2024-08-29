package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Park {

    // Atributos
    private HashMap<Client,ArrayList<Reserve>> reserveList2;
    private ArrayList<Reserve> reserveList;
    private int maxCampingCapacity;
    private int maxCabinCapacity;
    private int maxActitvityCapacity;

    // Constructor

    public Park(int maxCampingCapacity, int maxCabinCapacity, int maxActitvityCapacity) {
        this.reserveList = new ArrayList<>();
        this.reserveList2 = new HashMap<>();
        this.maxCampingCapacity = maxCampingCapacity;
        this.maxCabinCapacity = maxCabinCapacity;
        this.maxActitvityCapacity = maxActitvityCapacity;
    }

    // Metodos
    // Añade una reserva a la lista de reservas
    public void addReserve(Reserve reserve) {
        if (this.isFull(reserve)) {
            reserveList.add(reserve);
            System.out.println("Reserva añadida exitosamente");
        } else {
            System.out.println("Capacidad maxima alcanzada para el tipo de reserva");
        }
    }

    // Cancela una reserva existente
    public void cancelReserve(Scanner scanner) {
        System.out.println("Ingrese la id de la reserva que desea cancelar");
        int reserveId = Integer.parseInt(scanner.nextLine());

        // Cancelar solo si la id encontrada es igual a la proporcionada
        reserveList.removeIf(reserve -> reserve.getReserveId() == reserveId);
        System.out.println("Reserva cancelada con exito!");
    }
    
    public void searchReserve(Scanner scanner) {
        System.out.println("Ingrese el id de la reserva que desea buscar");
        int idReserve = Integer.parseInt(scanner.nextLine());
        boolean found = false; // Agregar esta variable para el control de flujo

        for (Reserve reserve : reserveList) {
            if (reserve.getReserveId() == idReserve) { // usar getter para mayor encapsulamiento
                System.out.println("La reserva sí existe!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("La reserva no existe!");
        }
    }

    // Mostrar las reservas ingresadas
    public void showReserveList() {
        for (Reserve reserve : reserveList) {
            reserve.showDetails();
        }
        System.out.println("Total de reservas = " + reserveList.size());
    }

    // Verificar si se alcanzo la capacidad maxima
    public boolean isFull(Reserve newReserve) {

        // Uso de stream en lista de reservas para filtrar y contar cada vez que condicion
        // (si clase es una instancia de subclase -> true) sea verdadera
        long countCampingReserves = reserveList.stream().filter(reserve -> reserve instanceof CampingReserve).count();
        long countActivityReserves = reserveList.stream().filter(reserve -> reserve instanceof ActivityReserve).count();
        long countCabinReserves = reserveList.stream().filter(reserve -> reserve instanceof CabinReserve).count();

        // Queda espacio aun?
        if (newReserve instanceof CampingReserve && countCampingReserves < maxCampingCapacity) {
            return true; // si
        } else if ( (newReserve instanceof CabinReserve) && (countCabinReserves < maxCabinCapacity) ) {
            return true; // si
        } else if ( (newReserve instanceof ActivityReserve) && (countActivityReserves < maxActitvityCapacity) ) {
            return true; // si
        }
        return false; // no
    }

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
