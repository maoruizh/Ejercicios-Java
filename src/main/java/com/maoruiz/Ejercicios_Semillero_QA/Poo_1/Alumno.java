package com.maoruiz.Ejercicios_Semillero_QA.Poo_1;

import javax.swing.*;

public class Alumno extends Persona {

    public String matricula;

    public Alumno(String cedula, String nombre, String apellido, int edad, String genero) {
        super(cedula, nombre, apellido, edad, genero);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Alumno \nNombre: "+getNombre()+"\nApellido: " +
                ""+getApellido()+"\nEdad: "+getEdad()+"\nGenero: "+getGenero()+"\nCedula: "+getCedula()+"\nMatricula del vehiculo: "+getMatricula());
    }
}
