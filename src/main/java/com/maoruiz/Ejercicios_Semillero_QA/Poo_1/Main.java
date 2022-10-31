package com.maoruiz.Ejercicios_Semillero_QA.Poo_1;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("8431834", "Mao", "Ruiz", 32, "Masculino");
        alumno.setMateria("Ingles");
        alumno.mostrarDatos();

        Profesor profesor = new Profesor("9856321", "Juan Camilo", "Hernández", 36, "Masculino");
        profesor.setMateria("Programación");
        profesor.mostrarDatos();
    }
}