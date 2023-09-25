package com.libreria.ateneo;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Test2 {

    public static void main(String[] args) {
        Catalogo cat = new Catalogo();

        while (true) {
            String menu = "--- Bienvenido a Ateneo Libros System ---\n"
                    + "1. Agregar libro.\n"
                    + "2. Mostrar catálogo.\n"
                    + "3. Buscar libro por apellido.\n"
                    + "4. Eliminar libro. \n"
                    + "5. Salir.\n";

            String strOpcion = JOptionPane.showInputDialog(menu);
            int opcion = Integer.parseInt(strOpcion);

            switch (opcion) {
                case 1:
                    //Añadir libro
                    String nombre = JOptionPane.showInputDialog("Ingrese nombre del autor: ");

                    String apellido = JOptionPane.showInputDialog("Ingrese apellido del autor: ");

                    String nacionalidad = JOptionPane.showInputDialog("Ingrese nacionalidad del autor: ");

                    String titulo = JOptionPane.showInputDialog("Ingrese título del libro: ");

                    String precioIngresado = JOptionPane.showInputDialog("Ingrese precio del libro: ");
                    int precio = Integer.parseInt(precioIngresado);

                    String isbn = JOptionPane.showInputDialog("Ingrese ISBN del libro: ");

                    Autor autor = new Autor(nombre, apellido, nacionalidad);
                    Libro libro = new Libro(titulo, autor, precio, isbn);
                    cat.agregaLibros(libro);

                    break;
                case 2:
                    //Mostrar libros
                    if (!cat.imprimirCatalogo().isEmpty()) {
                        JOptionPane.showMessageDialog(null, cat.imprimirCatalogo());
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay libros en catálogo");
                    }

                    break;
                case 3:
                    //Buscar libro por apellido
                    String apellidoAutor = JOptionPane.showInputDialog("Ingrese el apellido del autor a buscar: ");
                    JOptionPane.showMessageDialog(null, cat.buscarLibroApellidoToString(apellidoAutor));
                    break;
                case 4:
                    String isbnAEliminar = JOptionPane.showInputDialog("Ingrese el ISBN a eliminar");
                    if (cat.eliminarLibroIsbnConfirm(isbnAEliminar)) {
                        JOptionPane.showMessageDialog(null, "Libro eliminado con éxito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Libro no encontrado.");
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    return;
                default:
                    throw new AssertionError();
            }
        }

    }

}
