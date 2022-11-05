package poo2;

public class Persona1 {
    public String nombre;
    public String apellido;
    public int numCedula;
    public int edad;
    public int celular;

    public Persona1(String nombre, String apellido, int numCedula, int edad, int celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCedula = numCedula;
        this.edad = edad;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(int numCedula) {
        this.numCedula = numCedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

}