/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareamodulo6;

/**
 *
 * @author Denni
 */
public class Main {
    public static void main(String[] args) {
        
        Doctor doctor = new Doctor("Bartolomeo Panfilo", 85, "Psiquiatria Forense");
        Deportista deportista = new Deportista("Clarinetin Nipobuceno", 49, "Tiro con Arco");

    
        System.out.println("Información del Doctor: " + doctor.getInfo());
        System.out.println("Información del Deportista: " + deportista.getInfo());
    }
}