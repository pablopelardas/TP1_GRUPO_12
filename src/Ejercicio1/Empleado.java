package Ejercicio1;

public class Empleado {
    
    private int id;
    private String nombre;
    private int edad;
    
    public Empleado( String nombre, int edad) {
        this.id = 0;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
