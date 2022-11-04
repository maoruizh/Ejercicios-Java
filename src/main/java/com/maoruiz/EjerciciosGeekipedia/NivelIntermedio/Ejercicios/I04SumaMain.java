package com.maoruiz.EjerciciosGeekipedia.NivelIntermedio.Ejercicios;
import java.util.Scanner;

public class I04SumaMain {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Dame el primer valor: ");
        int valorUno = entrada.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        int valorDos = entrada.nextInt();
        
        I04Suma valores = new I04Suma(valorUno, valorDos);
        valores.Imprimir();
    }    
}
