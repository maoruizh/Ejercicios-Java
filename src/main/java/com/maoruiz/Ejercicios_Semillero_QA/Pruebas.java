package com.maoruiz.Ejercicios_Semillero_QA;

import javax.swing.*;
import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer nombre:");
        String nombre1;
        nombre1 = sc.nextLine();
        System.out.print("Introduce el segundo nombre:");
        String nombre2;
        nombre2 = sc.nextLine();

        System.out.println("El primer nombre es " + nombre1 + " y el segundo nombre es " + nombre2);
        if (nombre1.equals(nombre2)) {
            System.out.println("Los dos nombres son iguales"); //No está funcionando bien
        } else System.out.println("Los nombres son diferentes");
        System.out.println("-----------------------------------------------------------------------------------------");

    /* Pedir dos palabras por teclado, indicar si son iguales.
        System.out.println("\nEste es el resultado del ejercicio # 4");
        String nombre1 = JOptionPane.showInputDialog("Introduce el primer nombre");
        String nombre2 = JOptionPane.showInputDialog("Introduce el segundo nombre");
        System.out.println("El primer nombre es " + nombre1 + " y el segundo nombre es " + nombre2);
        if (nombre1.equals(nombre2)){
            System.out.println("Los dos nombres son iguales"); //No está funcionando bien
        } else System.out.println("Los nombres son diferentes");
        System.out.println("-----------------------------------------------------------------------------------------");
*/
    }
}


/*

Scanner
    int codigo;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce");
    codigo=sc.nextInt();


Con JOptionPane
    int codigo;
    String texto=JOptionPane.showInputDialog("Introduce");
    codigo=Integer.parseInt(texto);

*/
