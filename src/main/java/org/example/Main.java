package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Manejo de i/o
        Scanner scanner = new Scanner(System.in);
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
                                break;
                            case 2:
                                System.out.println("Eliminar a un cliente");
                                break;
                            case 3:
                                System.out.println("Buscar a un cliente");
                                break;
                            case 4:
                                System.out.println("Mostrar lista de clientes");
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
                        System.out.println(" 2. Eliminar una reserva"                 );
                        System.out.println(" 3. Buscar una reserva"                   );
                        System.out.println(" 4. Mostrar lista de reservas"            );
                        System.out.println(" 0. Salir"                                );
                        System.out.println("=========================================");
                        choice = Integer.parseInt(scanner.nextLine());

                        switch (choice) {
                            case 1:
                                System.out.println("Ingresar una reserva");
                                break;
                            case 2:
                                System.out.println("Eliminar una reserva");
                                break;
                            case 3:
                                System.out.println("Buscar una reserva");
                                break;
                            case 4:
                                System.out.println("Mostrar lista de reservas");
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
                                System.out.println("Consultar tarifas en cabañas");
                                break;
                            case 2:
                                System.out.println("Consultar tarifas en camping");
                                break;
                            case 3:
                                System.out.println("Consultar tarifas en actividades");
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
                                System.out.println("Consultar clientes en cabañas");
                                break;
                            case 2:
                                System.out.println("Consultar clientes en camping");
                                break;
                            case 3:
                                System.out.println("Consultar clientes en actividades");
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