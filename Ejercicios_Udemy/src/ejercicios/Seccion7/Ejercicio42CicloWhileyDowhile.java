package ejercicios.Seccion7;

public class Ejercicio42CicloWhileyDowhile {
    public static void main(String[] args) {
        // ciclo while es el mas comun y se caracteriza por tener un condicion verdadera o falsa de por medio

        int numero = 1;

        /*while (numero < 5) {
            System.out.println("numero = " + numero);
            numero++;
        }
        */

        //la diferencia con el ciclo Dowhile es que la condicion no se evalua al inicio sino que se hace al final

        do {
            System.out.println("numero = " + numero);
            numero++;

        } while (numero < 5);
    }
}
