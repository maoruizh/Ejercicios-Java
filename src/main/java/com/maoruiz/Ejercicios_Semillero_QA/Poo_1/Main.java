package com.maoruiz.Ejercicios_Semillero_QA.Poo_1;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("1040789664", "Juan Pablo", "Rivera", 22, "Masculino");
        alumno.setMatricula("12345");
        alumno.mostrarDatos();

        Profesor profesor = new Profesor("9856321", "Juan Camilo", "Hernández", 36, "Masculino");
        profesor.setMateria("Programacion");
        profesor.mostrarDatos();
    }
}