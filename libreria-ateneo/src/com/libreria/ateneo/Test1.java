package com.libreria.ateneo;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Test1 {

    public static void main(String[] args) {
        Catalogo cat = new Catalogo();
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("--- Bienvenido a Ateneo Libros System ---");
            System.out.println("1. Agregar libro.");
            System.out.println("2. Mostrar catálogo.");
            System.out.println("3. Buscar libro por apellido.");
            System.out.println("4. Eliminar libro.");
            System.out.println("5. Salir.");
            System.out.println("");
            System.out.println("Seleccione una opción: ");

            int opcion = scn.nextInt();
            scn.nextLine();
            
            switch (opcion) {
                case 1:
                    //Añadir libro
                    System.out.println("Ingrese nombre del autor: ");
                    String nombre = scn.nextLine();
                    
                    System.out.println("Ingrese apellido del autor: ");
                    String apellido = scn.nextLine();
                    
                    System.out.println("Ingrese nacionalidad del autor: ");
                    String nacionalidad = scn.nextLine();
                    
                    System.out.println("Ingrese título del libro: ");
                    String titulo = scn.nextLine();
                    
                    System.out.println("Ingrese precio del libro: ");
                    int precio = scn.nextInt();
                    scn.nextLine();
                    
                    System.out.println("Ingrese ISBN del libro: ");
                    String isbn = scn.nextLine();
                    
                    Autor autor = new Autor(nombre, apellido, nacionalidad);
                    Libro libro = new Libro(titulo, autor, precio, isbn);
                    
                    cat.agregaLibros(libro);
                    break;
                case 2:
                    //Mostrar libros
                    cat.mostrarCatalogo();
                    break;
                case 3:
                    //Buscar libro por apellido
                    System.out.println("Ingrese el apellido del autor a buscar: ");
                    String apellidoAutor = scn.nextLine();
                    cat.buscarLibroApellido(apellidoAutor);
                    break;
                case 4:
                    System.out.println("Ingrese el ISBN a eliminar");
                    String isbnAEliminar = scn.nextLine();
                    cat.eliminarLibroIsbn(isbnAEliminar);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    throw new AssertionError();
            }
        }

    }

}
