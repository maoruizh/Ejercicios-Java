package ejercicios.Seccion5;

public class Ejercicio27OperadorTernario {
    public static void main(String[] args) {
        //sirve para simplificar el IF-ELSE con cadenas o  booleanos
        int numero = 11;
        String resultado = (numero % 2 == 0) ? "Es numero par" : "Es numero impar";
        System.out.println( numero + " " + resultado);


        boolean res = numero % 2 == 0;
        if (res)
            System.out.println(numero + " " + "Es numero es par");
        else
            System.out.println(numero + " " + "Es numero es impar");


    }
}
