package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {

        //Hacer un programa que tome dos numeros y diga si ambos son pares o impares.

        int numero1, numero2;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame el primer numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Dame el segundo numero: ");
        numero2 = entrada.nextInt();

        if (numero1%2 ==0 && numero2%2==0){
            System.out.println("Ambos numero son pares");

        }
        else if (numero1%2!=0 && numero2%2!=0){
            System.out.println("Ambos numero son impares");

        }
        else if (numero1%2 ==0 && numero2%2!=0) {
            System.out.println("Numero 1 es par y numero 2 es impar");

        }
        else  {
            System.out.println("Numero 1 es impar y numero 2 es par");
        }
    }
}
