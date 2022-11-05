package ejercicios.operadores;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {

        //Construir un programa que calcule y muestre en pantalla las raices de la ecuacion de
        // segundo grado de coeficientes reales
        // ax2 + bx + c = 0

        int a, b, c, x1, x2;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame el valor de a: ");
        a=entrada.nextInt();

        System.out.print("Dame el valor de b: ");
        b=entrada.nextInt();

        System.out.print("Dame el valor de c: ");
        c=entrada.nextInt();

        x1= (int)((-b) + ((Math.sqrt(Math.pow(b,2)))-4*a*c))/(2*a);
        x2= (int)((-b) - ((Math.sqrt(Math.pow(b,2)))-4*a*c))/(2*a);

        System.out.println("La raiz positiva de la ecuacion es: "+x1);
        System.out.println("La raiz negativa de la ecuacion es: "+x2);

    }
}
