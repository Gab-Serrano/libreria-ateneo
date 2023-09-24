package com.libreria.ateneo;

/**
 *
 * @author Gabriel
 */
public class Autor {
    private String nombre;
    private String apellido;
    private String nacionalidad;

    //Constructor
    public Autor() {
    }

    public Autor(String nombre, String apellido, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + '}';
    }
    
    //Custom
    
    public void imprimirInfo(){
        System.out.println("Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nNacionalidad: " + this.nacionalidad);
    }
    
}
