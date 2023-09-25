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
    
    public String imprimirCatalogo(){
        String exportMenu = "";
        for (Libro libro : catalogo) {
            exportMenu = exportMenu + libro.infoLibroToString();
        }
        return exportMenu;
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
    
    
    public boolean eliminarLibroIsbnConfirm (String isbn){
        for (Libro libro : catalogo) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)){
                catalogo.remove(libro);
                return true;
            }          
        }
        return false;
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
    
    public String buscarLibroApellidoToString (String apellido){
        String infoLibroExport = "";
        for (Libro libro : catalogo) {
            if (libro.getAutor().getApellido().equalsIgnoreCase(apellido)){
                infoLibroExport = libro.infoLibroToString();
                break;
            }            
        }
        return infoLibroExport;
    }
}
