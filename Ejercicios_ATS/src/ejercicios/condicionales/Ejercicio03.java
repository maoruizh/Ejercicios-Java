package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        //Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula

        char letra;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame una letra :");
        letra =  entrada.nextLine().charAt(0);

        if (Character.isUpperCase(letra)){
            System.out.println("El caracter esta en MAYUSCULA");

        }else System.out.println("El caracter esta en minuscula");

    }
}
