package org.example;

import java.util.*;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Park {

    // Atributos
    private HashMap<Client,ArrayList<Reserve>> reserveList2;
    private ArrayList<Reserve> reserveList;
    private int maxCampingCapacity;
    private int maxCabinCapacity;
    private int maxActitvityCapacity;

    // Constructor

    public Park(int maxCampingCapacity, int maxCabinCapacity, int maxActitvityCapacity) {
        this.reserveList2 = new HashMap<>();
        this.maxCampingCapacity = maxCampingCapacity;
        this.maxCabinCapacity = maxCabinCapacity;
        this.maxActitvityCapacity = maxActitvityCapacity;
    }

    // Metodos
    // Añade una reserva a la lista de reservas
    public void addReserve(Client client, Reserve reserve) {
        ArrayList<Reserve> reservesOfClient = reserveList2.get(client);
        if (reservesOfClient == null) {
            reservesOfClient = new ArrayList<>();
            reserveList2.put(client,reservesOfClient);
        }

        if (this.isFull(reserve)) {
            reservesOfClient.add(reserve);
            System.out.println("Reserva añadida exitosamente");
        } else {
            System.out.println("Capacidad maxima alcanzada para el tipo de reserva");
        }
    }

    public void addReserve(Client client, Reserve reserve, Reserve reserve2 ) {
        ArrayList<Reserve> reservesOfClient = reserveList2.get(client);
        if (reservesOfClient == null) {
            reservesOfClient = new ArrayList<>();
            reserveList2.put(client,reservesOfClient);
        }

        if (this.isFull(reserve)) {
            reservesOfClient.add(reserve);
            reservesOfClient.add(reserve2);
            System.out.println("Reservas alcanzadas exitosamente");
        }
        else {
            System.out.println("Capacidad maxima alcanzada para el tipo de reserva");
        }

    }

    // Cancela una reserva existente
    public void cancelReserve(Scanner scanner) {
        System.out.println("Ingrese la id de la reserva que desea cancelar");
        int reserveId = Integer.parseInt(scanner.nextLine());

        // Busca y cancela una reserva
        for (Map.Entry<Client, ArrayList<Reserve>> entry : reserveList2.entrySet()) {
            ArrayList<Reserve> reservas = entry.getValue();
            reservas.removeIf(reserve -> reserve.getReserveId() == reserveId);
            if (reservas.isEmpty()) {
                reserveList2.remove(entry.getKey());
            }
        }
        System.out.println("Reserva cancelada con éxito!");
    }

    public void searchReserve(Scanner scanner) {
        System.out.println("Ingrese la ID del cliente para buscar sus reservas:");
        String clientId = scanner.nextLine();

        // Buscar cliente con la ID proporcionada
        Client clientToFind = null;
        for (Client client : reserveList2.keySet()) {
            if (Objects.equals(client.getRun(), clientId)) {
                clientToFind = client;
                break;
            }
        }

        if (clientToFind == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        // Obtener las reservas del cliente encontrado
        ArrayList<Reserve> reservas = reserveList2.get(clientToFind);

        if (reservas == null || reservas.isEmpty()) {
            System.out.println("No hay reservas para este cliente.");
        } else {
            System.out.println("Reservas para el cliente " + clientToFind.getName() + ":");
            for (Reserve reserva : reservas) {
                reserva.showDetails();
            }
        }    }

    // Mostrar las reservas ingresadas
    public void showReserveList() {
        for (Map.Entry<Client, ArrayList<Reserve>> entry : reserveList2.entrySet()) {
            Client client = entry.getKey();
            ArrayList<Reserve> reservas = entry.getValue();
            System.out.println("Reservas para " + client.getRun() + ":");
            for (Reserve reserva : reservas) {
                reserva.showDetails();
            }
        }
    }

    //Mostrar las reservas de camping
    public void showCampingReserveList() {
        for(Map.Entry<Client, ArrayList<Reserve>> entry : reserveList2.entrySet()) {
            Client client = entry.getKey();
            ArrayList<Reserve> reservas = entry.getValue();

            //Acá se filtra para reservas de camping
            List<Reserve> campingReserves = reservas.stream().filter(reserve -> reserve instanceof  CampingReserve).toList();

            if(!campingReserves.isEmpty()) {
                System.out.println("Reservas de camping para cliente "+client.getRun()+ "(" + client.getName() + ":");
                for (Reserve reserve : campingReserves) {
                    reserve.showDetails();
                }
            }
            else {
                System.out.println("No existen reservas para el camping");
            }
        }
    }

    //Mostrar las reservas de cabañas
    public void showCabinReserveList() {
        for(Map.Entry<Client, ArrayList<Reserve>> entry : reserveList2.entrySet()) {
            Client client = entry.getKey();
            ArrayList<Reserve> reservas = entry.getValue();

            //Acá se filtra para reservas de cabañas
            List<Reserve> campingReserves = reservas.stream().filter(reserve -> reserve instanceof  CabinReserve).toList();

            if(!campingReserves.isEmpty()) {
                System.out.println("Reservas de cabaña para cliente "+client.getRun()+ "(" + client.getName() + ":");
                for (Reserve reserve : campingReserves) {
                    reserve.showDetails();
                }
            }
            else {
                System.out.println("No existen reservas para cabañas");
            }
        }
    }

    //Mostrar las reservas de actividades
    public void showActivityReserveList() {
        for(Map.Entry<Client, ArrayList<Reserve>> entry : reserveList2.entrySet()) {
            Client client = entry.getKey();
            ArrayList<Reserve> reservas = entry.getValue();

            //Acá se filtra para reservas de cabañas
            List<Reserve> campingReserves = reservas.stream().filter(reserve -> reserve instanceof  ActivityReserve).toList();

            if(!campingReserves.isEmpty()) {
                System.out.println("Reservas de actividades para cliente "+client.getRun()+ "(" + client.getName() + ":");
                for (Reserve reserve : campingReserves) {
                    reserve.showDetails();
                }
            }
            else {
                System.out.println("No existen reservas para actividades");
            }
        }
    }

    // Verificar si se alcanzo la capacidad maxima
    public boolean isFull(Reserve newReserve) {

        // Contar reservas de cada tipo
        long countCampingReserves = reserveList2.values().stream().flatMap(ArrayList::stream).filter(reserve -> reserve instanceof CampingReserve).count();
        long countActivityReserves = reserveList2.values().stream()
                .flatMap(ArrayList::stream)
                .filter(reserve -> reserve instanceof ActivityReserve)
                .count();
        long countCabinReserves = reserveList2.values().stream()
                .flatMap(ArrayList::stream)
                .filter(reserve -> reserve instanceof CabinReserve)
                .count();

        // Verificar espacio disponible
        if (newReserve instanceof CampingReserve && countCampingReserves < maxCampingCapacity) {
            return true;
        } else if (newReserve instanceof CabinReserve && countCabinReserves < maxCabinCapacity) {
            return true;
        } else if (newReserve instanceof ActivityReserve && countActivityReserves < maxActitvityCapacity) {
            return true;
        }
        return false;
    }

    // Getters and setters
    public HashMap<Client, ArrayList<Reserve>> getReserveList2() {
        return reserveList2;
    }

    public void setReserveList2(HashMap<Client, ArrayList<Reserve>> reserveList2) {
        this.reserveList2 = reserveList2;
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

    public int getMaxActivityCapacity() {
        return maxActitvityCapacity;
    }

    public void setMaxActivityCapacity(int maxActivityCapacity) {
        this.maxActitvityCapacity = maxActivityCapacity;
    }
}
