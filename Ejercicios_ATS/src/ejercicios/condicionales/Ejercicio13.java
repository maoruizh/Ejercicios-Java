package ejercicios.condicionales;

import javax.swing.*;

public class Ejercicio13 {
    public static void main(String[] args) {

        //Hacer un programa que simule una pequeña funcion de un cajero, el cual tiene un saldo inicial de 1000.
        //El menu de opciones sera el siguiente
        //1. ingresar dinero a la cuenta 2. Retirar dinero de la cuenta. 3. Salir.

        int saldoinicial = 1000;
        int transaccion;
        float ingreso, retiro,saldoActual;

        transaccion=Integer.parseInt(JOptionPane.showInputDialog("¡BIENVENIDO A TU CAJERO AUTOMATICO!\n" +
        " Que operacion deseas realizar el dia de hoy? \n"
        + "1. INGRESAR dinero a la cuenta.\n"
        + "2. RETIRAR dinero de la cuenta.\n"
        + "3. SALIR."));

        switch (transaccion){
            case 1:
                ingreso=Float.parseFloat(JOptionPane.showInputDialog("Cuanto dinero deseas INGRESAR?: "));
                saldoActual = saldoinicial+ingreso;
                JOptionPane.showMessageDialog(null,"Tu nuevo saldo es: "+saldoActual);
                break;

            case 2:
                retiro=Float.parseFloat(JOptionPane.showInputDialog("Cuanto dinero deseas RETIRAR?: "));
                if (retiro>saldoinicial){
                    JOptionPane.showMessageDialog(null,"Fondos INSUFICIENTES");
                }else {
                    saldoActual= saldoinicial-retiro;
                    JOptionPane.showMessageDialog(null,"Tu nuevo saldo es: "+saldoActual);
                }
                break;

            case 3:
                break;

            default:
                JOptionPane.showMessageDialog(null,"La opcion que escogiste es incorrecta");
        }

        JOptionPane.showMessageDialog(null,"Hasta pronto!!");
    }
}
