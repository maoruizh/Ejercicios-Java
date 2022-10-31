package com.maoruiz.Ejercicios_Semillero_QA.Poo_1;

import javax.swing.*;

public class Alumno extends Persona {
    public String Materia;

    public Alumno(String cedula, String nombre, String apellido, int edad, String genero) {
        super(cedula, nombre, apellido, edad, genero);
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }

    public void mostrarDatos (){ //porque no se pide la cédula del alumno y porque se inicia con Null,
        JOptionPane.showMessageDialog(null,"Alumno \nNombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()+"\nGenero: "+getGenero()
        +"\nCédula: "+getCedula()+"\nMateria: "+getMateria());
    }
}
