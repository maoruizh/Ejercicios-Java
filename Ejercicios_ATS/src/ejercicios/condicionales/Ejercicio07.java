package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {

        //Hacer un programa que pida tres numeros y los orde de mayor a menor.

        int num1, num2, num3;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame el primer numero: ");
        num1 = entrada.nextInt();

        System.out.print("Dame el segundo numero: ");
        num2 = entrada.nextInt();

        System.out.print("Dame el tercer numero: ");
        num3 = entrada.nextInt();

        if (num1>num2 && num2>num3){
            System.out.println("El orden seria: "+num1+"-"+num2+"-"+num3);

        } else if (num1>num3 && num3>num2){
            System.out.println("El orden seria: "+num1+"-"+num3+"-"+num2);

        } else if (num2>num1 && num1>num3){
            System.out.println("El orden seria: "+num2+"-"+num1+"-"+num3);

        } else if (num2>num3 && num3>num1){
            System.out.println("El orden seria: "+num2+"-"+num3+"-"+num1);

        } else if (num3>num1 && num1>num2){
            System.out.println("El orden seria: "+num3+"-"+num1+"-"+num2);

        } else {
            System.out.println("El orden seria: "+num3+"-"+num2+"-"+num1);
        }
    }
}
