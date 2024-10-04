package org.example.Model;

import java.util.Scanner;

public class Client {

    // Atributos
    private String run;
    private String name;
    private String email;
    private String phoneNumber;

    // Constructor
    public Client(String run, String name, String email, String phoneNumber) {
        this.run = run;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Metodos

    // Muestra informacion del cliente
    public void showClientInfo() {
        System.out.println("--------- CLIENT INFO ---------");
        System.out.println("Run: " + run);
        System.out.println("Nombre: " + name);
        System.out.println("Email: " + email);
        System.out.println("Telefono: " + phoneNumber);
        System.out.println("-------------------------------");
    }

    // Getters and setters
    public String getRun() {return run;}

    public void setRun(String run) { this.run = run; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
