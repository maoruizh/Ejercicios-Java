package com.maoruiz.EjerciciosUdemy.Seccion4;

public class Ejercicio15Flotantes {
    public static void main(String[] args) {
        //float, double
        System.out.println("bits tipo float:" + Float.SIZE);
        System.out.println("bytes tipo float:" + Float.BYTES);
        System.out.println("valor minimo tipo float:" + Float.MIN_VALUE);
        System.out.println("valor maximo tipo float:" + Float.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo double:" + Double.SIZE);
        System.out.println("bytes tipo double:" + Double.BYTES);
        System.out.println("valor minimo tipo double:" + Double.MIN_VALUE);
        System.out.println("valor maximo tipo double:" + Double.MAX_VALUE);

        float floatVar = 1.05F;
        double doubleVar = 1.0D;

        float floatVar2 = 10.0F;
        double doubleVar2 = 10.15D;
    }
}
