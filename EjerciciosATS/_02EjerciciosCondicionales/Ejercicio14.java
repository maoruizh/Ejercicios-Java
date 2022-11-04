package com.maoruiz.EjerciciosATS._02EjerciciosCondicionales;

import javax.swing.*;

public class Ejercicio14 {
    public static void main(String[] args) {

        //Hacer un progrma que pase de kg a otra unidad de medida de masa,
        // mostrar en pantalla un menu con las opciones posibles.

        int operacion;
        float libras =2.20462f;
        float toneladas =0.001f;
        float gramos =1000f;
        float kilos;
        float resultado;

        operacion=Integer.parseInt(JOptionPane.showInputDialog("¡BIENVENIDO A TU CONVERSOR DE MASAS!\n" +
                " Que conversion deseas realizar el dia de hoy? \n"
                + "1. CONVERTIR KG A LIBRAS.\n"
                + "2. CONVERTIR KG A TONELADAS.\n"
                + "3. CONVERTIR KG A GRAMOS.\n"
                + "4. SALIR."));

        switch (operacion){
            case 1:
                kilos=Float.parseFloat(JOptionPane.showInputDialog("Que valor en KG deseas convertir a LIBRAS  ?: "));
                resultado = kilos*libras;
                JOptionPane.showMessageDialog(null,"El resultado de la conversion es: "+resultado+" LIBRAS");
                break;

            case 2:
                kilos=Float.parseFloat(JOptionPane.showInputDialog("Que valor en KG deseas convertir a TONELADAS  ?: "));
                resultado = kilos*toneladas;
                JOptionPane.showMessageDialog(null,"El resultado de la conversion es: "+resultado+" TONELADAS");
                break;

            case 3:
                kilos=Float.parseFloat(JOptionPane.showInputDialog("Que valor en KG deseas convertir a GRAMOS  ?: "));
                resultado = kilos*gramos;
                JOptionPane.showMessageDialog(null,"El resultado de la conversion es: "+resultado+" GRAMOS");
                break;

            case 4:
                 break;

            default:
                JOptionPane.showMessageDialog(null,"La opcion que escogiste es incorrecta");
        }
        JOptionPane.showMessageDialog(null,"Hasta pronto!!");
    }
}
