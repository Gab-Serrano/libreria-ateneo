package com.libreria.ateneo;

/**
 *
 * @author Gabriel Serrano
 * @version 
 */
public class Libro {
    
    private String titulo;
    private Autor autor;
    private int precio;
    private String isbn;

    //Constructor vacío
    public Libro() {
    }

    //Constructor con parámetros
    public Libro(String titulo, Autor autor, int precio, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.isbn = isbn;
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", isbn=" + isbn + '}';
    }
    
    //Métodos personalizados / custom
    public void imprimirInfo (){
        System.out.println("Título: " + this.titulo + "\nAutor: " + this.autor + "\nPrecio: " + this.precio + "\nISBN: " + this.isbn);
    }
    
    public String infoLibroToString (){
        return "titulo = " + titulo + "\n" + autor.infoAutorToString() + "\nprecio = " + precio + "\nisbn = " + isbn;
    }
   
    public double calcularIva (){
        double IVA = 0.19;
        
        return this.precio * IVA;
    }
    
    public void ajustarPrecio (){
        double iva = this.calcularIva();
        this.precio = (int) (this.precio - iva);
    }
}
