/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareamodulo6;

/**
 *
 * @author Denni
 */
class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Especialidad: " + especialidad;
    }
}
