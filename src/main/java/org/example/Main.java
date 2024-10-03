package org.example;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        // Manejo de i/o
        Scanner scanner = new Scanner(System.in);
        ClientMap clientMap = new ClientMap();
        Park park = new Park(10,25,15);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Fee fee = new Fee(20.0, 100.0, 15.0);
        
        // Se crea el JFrame principal para la ventana emergente
        JFrame mainFrame = new JFrame("Sistema gestor de reservas");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600);

        //Datos iniciales
        Client client1 = new Client("19654237-5", "Pedro Gonzales", "Pedro@mail.com", "+56978451263");
        clientMap.addClientToMap(client1);
        Client client2 = new Client("21258147-4", "Valentina Moreno", "Valentina@mail.com", "+56912365874");
        clientMap.addClientToMap(client2);
        Client client3 = new Client("20149751-k","Claudio Cubillos","Cubillos@mail.com","+56974258961");
        clientMap.addClientToMap(client3);
        ActivityReserve reserve1 = new ActivityReserve(123,client1,LocalDate.now(),LocalDate.now(),"Treking",4);
        park.addReserve(client1, reserve1);
        CampingReserve reserve2 = new CampingReserve(456, client2, LocalDate.now(), LocalDate.now(), 3);
        park.addReserve(client2, reserve2);
        CabinReserve reserve3 = new CabinReserve(789, client3, LocalDate.now(), LocalDate.now(), 3);
        ActivityReserve reserve4 = new ActivityReserve( 147, client3, LocalDate.now(), LocalDate.now(), "Pesca", 3);
        park.addReserve(client3, reserve3, reserve4);

        int choice;

        do {
            System.out.println("=========================================");
            System.out.println("       Sistema gestor de reservas"        );
            System.out.println("=========================================");
            System.out.println(" 1. Administrar de clientes"              );
            System.out.println(" 2. Administrar reservas"                 );
            System.out.println(" 3. Administrar tarifas"                  );
            System.out.println(" 4. Administrar parque"                   );
            System.out.println(" 0. Salir"                                );
            System.out.println("=========================================");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    do {
                        System.out.println("=========================================");
                        System.out.println("       Administrador de clientes"         );
                        System.out.println("=========================================");
                        System.out.println(" 1. Ingresar a un cliente"                );
                        System.out.println(" 2. Eliminar a un cliente"                );
                        System.out.println(" 3. Buscar a un cliente"                  );
                        System.out.println(" 4. Mostrar lista de clientes"            );
                        System.out.println(" 0. Salir"                                );
                        System.out.println("=========================================");
                        choice = Integer.parseInt(scanner.nextLine());

                        switch (choice) {
                            case 1:
                                System.out.println("Ingresar a un cliente");
                                System.out.print("Ingresar el run de el cliente: ");
                                String run = scanner.nextLine();
                                System.out.print("Ingrese nombre: ");
                                String name = scanner.nextLine();
                                System.out.print("Ingrese email: ");
                                String email = scanner.nextLine();
                                System.out.print("Ingrese telefono: ");
                                String phoneNumber = scanner.nextLine();

                                Client client = new Client(run, name, email, phoneNumber);
                                clientMap.addClientToMap(client);
                                break;
                            case 2:
                                System.out.println("Eliminar a un cliente");
                                clientMap.removeClientFromMap(scanner);
                                break;
                            case 3:
                                System.out.println("Buscar a un cliente");
                                clientMap.searchForClientInMap(scanner);
                                break;
                            case 4:
                                System.out.println("Mostrar lista de clientes");
                                clientMap.showClientMap();
                                break;
                            case 0:
                                System.out.println("Saliendo....");
                                break;
                            default:
                                System.out.println("Tecla incorrecta, continuando proceso...");
                                break;
                        }
                    } while (choice != 0);

                    // reset de choice para evitar problemas
                    choice = 10;
                    break;
                case 2:
                    do {
                        System.out.println("=========================================");
                        System.out.println("       Administrador de reservas"         );
                        System.out.println("=========================================");
                        System.out.println(" 1. Ingresar una reserva"                 );
                        System.out.println(" 2. Ingresar una reserva doble"           );
                        System.out.println(" 3. Eliminar una reserva"                 );
                        System.out.println(" 4. Buscar reserva por id de un cliente"  );
                        System.out.println(" 5. Mostrar lista de reservas"            );
                        System.out.println(" 0. Salir"                                );
                        System.out.println("=========================================");
                        choice = Integer.parseInt(scanner.nextLine());

                        switch (choice) {
                            case 1:
                                System.out.println("Ingresar una reserva");
                                System.out.print("Ingrese el id de la reserva: ");
                                int reserveId = Integer.parseInt(scanner.nextLine());

                                System.out.print("Ingrese el run del cliente que desea hacer la reserva: ");
                                String clientId = scanner.nextLine().trim();
                                Client client = clientMap.getClientMap().get(clientId);

                                // Aseguramos el buen formato de la fecha
                                LocalDate startDate = null;
                                while (startDate == null) {
                                    System.out.println("Ingrese la fecha de entrada (dd/mm/yyyy)");
                                    String inputDate = scanner.nextLine();

                                    try {
                                        startDate = LocalDate.parse(inputDate, formatter);
                                    } catch (DateTimeParseException e) {
                                        System.out.println("Fecha invalida, por favor introduce el formato CORRECTO");
                                    }
                                }

                                LocalDate endDate = null;
                                while (endDate == null) {
                                    System.out.println("Ingrese la fecha de salida (dd/mm/yyyy)");
                                    String inputDate = scanner.nextLine();

                                    try {
                                        endDate = LocalDate.parse(inputDate,formatter);
                                    } catch (DateTimeParseException e) {
                                        System.out.println("Fecha invalida, por favor introduce el formato CORRECTO lol");
                                    }
                                }

                                System.out.println("Seleccione el tipo de reserva");
                                boolean flag = false;
                                do {
                                    System.out.println("=========================================");
                                    System.out.println("      Seleccione el tipo de reserva"      );
                                    System.out.println("=========================================");
                                    System.out.println("    0. De Actividad"                      );
                                    System.out.println("    1. De cabañas"                        );
                                    System.out.println("    2. De campamentos"                    );
                                    System.out.println("=========================================");
                                    choice = Integer.parseInt(scanner.nextLine());

                                    switch (choice) {
                                        case 0:
                                            System.out.print("Ingrese el nombre de la actividad: ");
                                            String activityName = scanner.nextLine();
                                            System.out.print("Ingrese la cantidad de personas: ");
                                            int numPeople = Integer.parseInt(scanner.nextLine());

                                            ActivityReserve activityReserve = new ActivityReserve(reserveId, client, startDate, endDate, activityName, numPeople);
                                            park.addReserve(client, activityReserve);

                                            flag = true;
                                            break;

                                        case 1:
                                            System.out.println("Ingrese la cantidad de personas: ");
                                            int numTent = Integer.parseInt(scanner.nextLine());

                                            CampingReserve campingReserve = new CampingReserve(reserveId, client, startDate, endDate, numTent);
                                            park.addReserve(client,campingReserve);

                                            flag = true;
                                            break;
                                        case 2:
                                            System.out.println("Ingrese la cantidad de personas a alojar");
                                            int numPerson = Integer.parseInt(scanner.nextLine()); // numero de personas que van a alojarse

                                            CabinReserve cabinReserve = new CabinReserve(reserveId, client, startDate, endDate, numPerson);
                                            park.addReserve(client,cabinReserve);

                                            flag = true;
                                            break;
                                    }
                                } while (!flag);
                                choice = 10; // reset del choice
                                break;
                            case 3:
                                System.out.println("Eliminar una reserva");
                                park.cancelReserve(scanner);
                                break;
                            case 4:
                                System.out.println("Buscar una reserva");
                                park.searchReserve(scanner);
                                break;
                            case 5:
                                System.out.println("Mostrar lista de reservas");
                                park.showReserveList();
                                break;
                            case 0:
                                System.out.println("Saliendo....");
                                break;
                            default:
                                System.out.println("Tecla incorrecta, continuando proceso...");
                                break;
                        }
                    } while (choice != 0);
                    // reset de choice para evitar problemas
                    choice = 10;

                    break;
                case 3:
                    do {
                        System.out.println("=========================================");
                        System.out.println("       Administrador de tarifas"          );
                        System.out.println("=========================================");
                        System.out.println(" 1. Consultar tarifas en cabañas"         );
                        System.out.println(" 2. Cosnultar tarifas en camping"         );
                        System.out.println(" 3. Consultar tarifas en actividades"     );
                        System.out.println(" 0. Salir"                                );
                        System.out.println("=========================================");
                        choice = Integer.parseInt(scanner.nextLine());

                        switch (choice) {
                            case 1:
                                fee.campingFee();
                                break;
                            case 2:
                                fee.cabinFee();
                                break;
                            case 3:
                                fee.activityFee();
                                break;
                            case 0:
                                System.out.println("Saliendo....");
                                break;
                            default:
                                System.out.println("Tecla incorrecta, continuando proceso...");
                                break;
                        }
                    } while (choice != 0);
                    // reset de choice para evitar problemas
                    choice = 10;

                    break;
                case 4:
                    do {
                        System.out.println("=========================================");
                        System.out.println("       Administrador de parques"          );
                        System.out.println("=========================================");
                        System.out.println(" 1. Consultar clientes en cabañas"        );
                        System.out.println(" 2. Cosnultar clientes en camping"        );
                        System.out.println(" 3. Consultar clientes en actividades"    );
                        System.out.println(" 0. Salir"                                );
                        System.out.println("=========================================");
                        choice = Integer.parseInt(scanner.nextLine());

                        switch (choice) {
                            case 1:
                                park.showCabinReserveList();
                                break;
                            case 2:
                                park.showCampingReserveList();
                                break;
                            case 3:
                                park.showActivityReserveList();
                                break;
                            case 0:
                                System.out.println("Saliendo....");
                                break;
                            default:
                                System.out.println("Tecla incorrecta, continuando proceso...");
                                break;
                        }
                    } while (choice != 0);
                    // reset de choice para evitar problemas
                    choice = 10;

                    break;
                case 0:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Tecla incorrecta, continuando proceso...");
                    break;
            }

        } while (choice != 0);
    }
}