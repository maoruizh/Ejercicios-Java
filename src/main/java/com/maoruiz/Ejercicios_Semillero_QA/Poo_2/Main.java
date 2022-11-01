package com.maoruiz.Ejercicios_Semillero_QA.Poo_2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Mao", "Ruiz", 8431834, 30, 2811058, "Toyota");
        cliente.setMarca("Toyota");
        cliente.mostrarDatos();

        Vendedor vendedor = new Vendedor("Raul", "Zuluaga", 1036610998, 40, 2551058);
        vendedor.setConcesionario("Poblautos");
        vendedor.mostrarDatos();
    }
}
