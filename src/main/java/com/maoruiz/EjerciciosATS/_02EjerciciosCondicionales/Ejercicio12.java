package com.maoruiz.EjerciciosATS._02EjerciciosCondicionales;

import javax.swing.*;

public class Ejercicio12 {
    public static void main(String[] args) {

        //hacer un programa que pida una nota de 0 a 5 y mostrarla de la forma:
        //insuficiente, suficiente, buena, excelente.

        int nota;

        nota = Integer.parseInt(JOptionPane.showInputDialog("Dame una nota de 0 a 5: "));

        switch (nota){
            case 0:
            case 1:
                JOptionPane.showMessageDialog(null,"La nota es Insuficiente");
                break;

            case 2:
            case 3:
                JOptionPane.showMessageDialog(null,"La nota es Suficiente");
                break;

            case 4:
                JOptionPane.showMessageDialog(null,"La nota es Buena");
                break;

            case 5:
                JOptionPane.showMessageDialog(null,"La nota es Excelente");
                break;

            default:
                JOptionPane.showMessageDialog(null,"La nota es incorrecta");



        }
    }
}
