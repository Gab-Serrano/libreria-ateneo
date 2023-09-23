package com.libreria.ateneo;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Catalogo {
    private ArrayList<Libro> catalogo;

    public Catalogo() {
        this.catalogo = new ArrayList<>();
    }
    
    //Agregar libros
    public void agregaLibros(Libro libro){
        this.catalogo.add(libro);
    }
    
    //Mostrar libros
    public void mostrarCatalogo(){
        for (Libro libro : catalogo) {
            libro.imprimirInfo();
        }
    }
    
    //Eliminar libros
    public void eliminarLibroIsbn (String isbn){
        for (Libro libro : catalogo) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)){
                catalogo.remove(libro);
                break;
            }          
        }
    }
    
    //buscar por apellido autor
    public void buscarLibroApellido (String apellido){
        for (Libro libro : catalogo) {
            if (libro.getAutor().getApellido().equalsIgnoreCase(apellido)){
                libro.imprimirInfo();
                break;
            }
        }
    }
}
