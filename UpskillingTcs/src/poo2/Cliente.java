package poo2;

import javax.swing.*;

public class Cliente extends Persona1 {
    public String Marca;

    public Cliente(String nombre, String apellido, int numCedula, int edad, int celular, String marca) {
        super(nombre, apellido, numCedula, edad, celular);
        Marca = marca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void mostrarDatos() { //porque no se pide la cédula del alumno y porque se inicia con Null,
        JOptionPane.showMessageDialog(null, "Cliente \nNombre: " + getNombre() + "\nApellido: " + getApellido() + "\nNumero de cédula: " + getNumCedula() + "\nEdad: " + getEdad()
                + "\nNumero de celular: " + getCelular() + "\nMarca: " + getMarca());
    }
}

