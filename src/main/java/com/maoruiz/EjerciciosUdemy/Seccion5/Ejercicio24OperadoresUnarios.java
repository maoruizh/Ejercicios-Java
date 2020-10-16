package com.maoruiz.EjerciciosUdemy.Seccion5;

public class Ejercicio24OperadoresUnarios {
    public static void main(String[] args) {
        //Unario sirve para invertir de positivo a negativo

        int a = 3;
        int b = -a;
        System.out.println("b = " + b);

        // complemento sirve para invertir los boolean
         boolean c = true;
         boolean d = !c;
        System.out.println("d = " + d);

        // postincremento
        int e = 3; // e se incrementa en la proxima ocurrencia ahi es donde se incrementa
        int f = e++;
        System.out.println("e = " + e);
        System.out.println("f = " + f);


        // preincremento
        int g = 3; // H se incrementa previamente
        int h = ++g;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // postdecremento
        int i = 3; // i se decrementa en la proxima ocurrencia ahi es donde se incrementa
        int j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        // predecremento
        int k = 3; // h se decrementa previamente
        int l = --k;
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
