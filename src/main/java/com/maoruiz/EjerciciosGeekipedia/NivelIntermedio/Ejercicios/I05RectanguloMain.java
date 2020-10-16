package com.maoruiz.EjerciciosGeekipedia.NivelIntermedio.Ejercicios;

import java.util.Scanner;

public class I05RectanguloMain {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Dame el valor de la base: ");
        int base = entrada.nextInt();
        
        System.out.print("Dame el valor de la altura: ");
        int altura = entrada.nextInt();
        
        I05Rectangulo mensajero = new I05Rectangulo(base, altura);
        mensajero.Imprimir();
    }
    
}
