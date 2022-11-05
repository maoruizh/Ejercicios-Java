package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {

        //hacer un programa que pida un numero entre 0 y 99999 y decir cuantos caracteres tiene

        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Dame un numero que este entre 0 y 99999: ");
        numero = entrada.nextInt();

        System.out.println("el numero tiene " + Integer.toString(numero).length()+ " caracteres");

    }
}
