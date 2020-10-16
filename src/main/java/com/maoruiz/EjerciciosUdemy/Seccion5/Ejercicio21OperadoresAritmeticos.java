package com.maoruiz.EjerciciosUdemy.Seccion5;

public class Ejercicio21OperadoresAritmeticos {

    public static void main(String[] args) {
        int a = 3, b = 2;
        int c = a+b;

        System.out.println("C = " + c);
        System.out.println("El resultado de la suma es: " + (a + b));
        System.out.println(a + b + " Es el resultado de la suma ");

        int d = a-b;
        System.out.println("d = " + d);
        System.out.println("El resultado de la resta es: " + (a - b));

        int e = a*b;
        System.out.println("e = " + e);

        int f = a/b;
        System.out.println("f = " + f);
        //Para que el resultado de en decimales, debemos tener una variable de tipo float y uno de los dos operandos tambien.
        float g = 3f/b;
        System.out.println("g = " + g);

        //Operador de modulo regresa el residuio de la division, es decir solo entrega la parte entera.
        int h = a%b;
        System.out.println("h = " + h);

        //tambien se puede usar para saber si un numero es par o impar
        int i = 13 % 2;
        System.out.println("i = " + i);
        if (i == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
    }
}
