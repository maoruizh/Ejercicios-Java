package ejercicios.Seccion6;

public class Ejercicio36Switch {
    public static void main(String[] args) {

        int numero = 2;
        String texto = "numero desconocido";

        switch (numero){
            case 1:
                texto = "numero uno";
                break;

            case 2:
                texto = "numero dos";
                break;

            case 3:
                texto = "numero tres";
                break;

            default:
                texto = "numero desconocido";
                break;
        }
        System.out.println("texto = " + texto);
    }
}
