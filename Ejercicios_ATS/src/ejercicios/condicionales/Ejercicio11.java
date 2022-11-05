package ejercicios.condicionales;

import javax.swing.*;

public class Ejercicio11 {
    public static void main(String[] args) {

        // Construir un programa que simule el funcionamiento de una calculadora que pueda realizar las 4 operaciones
        // aritmeticas basicas (suma, resta, multiplicacion y division) con valores numericos enteros.
        // el usuario debe especificar la operacion con el primer caracter del primer parametro de la linea de comandos:
        // S o s para la suma, R o r para la resta, M o m para la multiplicacion y D o d para la division.

        int numero1, numero2, suma, resta, multiplicacion, division;
        char operacion;

        numero1= Integer.parseInt(JOptionPane.showInputDialog("Dame el primer numero: "));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Dame el segundo numero: "));
        operacion= JOptionPane.showInputDialog("Cual operacion deseas realizar").charAt(0);

        switch (operacion){
            case 'S':
            case 's': suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+ suma);
                break;

            case 'R':
            case 'r': resta = numero1 - numero2;
                JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+ resta);
                break;

            case 'M':
            case 'm': multiplicacion = numero1 * numero2;
                JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es: "+ multiplicacion);
                break;

            case 'D':
            case 'd': division = numero1 / numero2;
                JOptionPane.showMessageDialog(null,"El resultado de la division es: "+ division);
                break;

            default:JOptionPane.showMessageDialog(null,"La operacion es incorrecta");











        }




    }
}
