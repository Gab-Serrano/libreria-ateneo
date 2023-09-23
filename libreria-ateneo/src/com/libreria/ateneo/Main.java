package com.libreria.ateneo;

/**
 *
 * @author Gabriel
 */
public class Main {
    
    public static void main(String[] args) {
        Catalogo cat = new Catalogo();
        Autor jk = new Autor("JK", "Rowlin", "Británica");
        Autor gm = new Autor("Gabriel", "García Márquez", "Colombiana");
        Autor mc = new Autor("Miguel", "de Cervantes", "Español");
        Libro harry = new Libro("Harry Potter", jk, 19000, "123456");
        Libro cien = new Libro("Cien Años de Soledad", gm, 25000, "0987765");
        Libro quijote = new Libro("Don Quijote de la Mancha", mc, 30000, "89865");
        
        cat.agregaLibros(harry);
        cat.agregaLibros(cien);
        cat.agregaLibros(quijote);
        
        cat.mostrarCatalogo();
        
        cat.eliminarLibroIsbn("89865");
        
        System.out.println("---------------------------------------------------");
        
        cat.mostrarCatalogo();
        
        System.out.println("---------------------------------------------------");
        System.out.println("");
        
        cat.buscarLibroApellido("Rowlin");
    }
}
