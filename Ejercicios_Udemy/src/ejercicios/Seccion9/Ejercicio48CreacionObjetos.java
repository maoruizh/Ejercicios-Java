package ejercicios.Seccion9;
import ejercicios.Seccion8.Ejercicio46CreacionClase;

public class Ejercicio48CreacionObjetos {
    public static void main(String[] args) {
        // Creacion de un objeto

        Ejercicio46CreacionClase persona1 = new Ejercicio46CreacionClase();

        //llamando a un metodo del objeto creado

        System.out.println("Valores por defecto del objeto Ejercicio46CreacionClase");
        persona1.desplegarNombre();

        //modificar valores del objeto creado
        persona1.nombre = "juan";
        persona1.apellidoPaterno = "Esparza";
        persona1.apellidoMaterno = "Lara";

        // volvemos a llamar el metodo
        System.out.println("\nNuevos valores del objeto");
        persona1.desplegarNombre();

        //creacion de un segundo objeto
        Ejercicio46CreacionClase persona2 = new Ejercicio46CreacionClase();
        persona2.nombre = "Carlos";

        // volvemos a llamar el metodo
        System.out.println("\nsegundos valores nuevos");
        persona2.desplegarNombre();




    }
}
