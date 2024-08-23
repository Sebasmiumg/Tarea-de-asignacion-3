/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ers.jose;

/**
 *
 * @author Sebas
 */
public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // Se asume que el libro está disponible al ser creado
    }

    // Métodos
    public void prestar() {
        if (this.disponible) {
            this.disponible = false;
            System.out.println("El libro '" + this.titulo + "' ha sido prestado con exito.");
        } else {
            System.out.println("El libro '" + this.titulo + "' no esta disponible para prestamo.");
        }
    }

    public void devolver() {
        this.disponible = true;
        System.out.println("El libro '" + this.titulo + "' ha sido devuelto y ahora esta disponible.");
    }

    public void consultar_disponibilidad() {
        if (this.disponible) {
            System.out.println("El libro '" + this.titulo + "' esta disponible para prestamo.");
        } else {
            System.out.println("El libro '" + this.titulo + "' no esta disponible para prestamo.");
        }
    }

    // Método para ejecutar el programa de prueba
    public static void main(String[] args) {
        Libro libro1 = new Libro("1984", "George Orwell");
        libro1.consultar_disponibilidad();
        libro1.prestar();
        libro1.consultar_disponibilidad();
        libro1.devolver();
        libro1.consultar_disponibilidad();
    }
}
