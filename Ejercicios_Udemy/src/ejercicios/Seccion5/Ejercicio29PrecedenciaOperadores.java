package ejercicios.Seccion5;

public class Ejercicio29PrecedenciaOperadores {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = ++x + y--; // x = 6, y = 10
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        //Ejemplo de precedencia de operadores
        int resultado = 4 + 5 * 6 / 3 - 2;
        System.out.println("resultado = " + resultado);
        //primero es la * luego va la / despues la + y finalmente la -

        // Cuando se usan () estos toman la prioridad 1
        resultado = (4 + 5) * (6 / 3) - 2;
        System.out.println("resultado = " + resultado);

    }
}
