/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ers.jose;

/**
 *
 * @author Sebas
 */
public class Main_Ejercicio_3 {
    public static void main(String[] args) {
        // Creación de una instancia de la clase concreta Electronico
        Electronico laptop = new Electronico("Laptop Dell", 1200.00, 10);

        // Muestra el inventario inicial
        laptop.consultar_inventario();

        // Agregar unidades al inventario
        laptop.agregar_cantidad(5);

        // Vender algunas unidades
        laptop.vender(8);

        // Mostrar el inventario después de vender
        laptop.consultar_inventario();

        // Intentar vender más unidades de las que están disponibles
        laptop.vender(10);
    }

    // Clase abstracta Producto
    public static abstract class Producto {
        protected String nombre;
        protected double precio;
        protected int cantidad;

        public Producto(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        // Método abstracto para agregar cantidad al inventario
        public abstract void agregar_cantidad(int cantidad);

        // Método abstracto para vender el producto
        public abstract void vender(int cantidad);

        // Método concreto para consultar el inventario
        public void consultar_inventario() {
            System.out.println("Inventario actual de " + nombre + ": " + cantidad + " unidades disponibles.");
        }
    }

    // Clase concreta Electronico que extiende Producto
    public static class Electronico extends Producto {

        public Electronico(String nombre, double precio, int cantidad) {
            super(nombre, precio, cantidad);
        }

        // Implementación del método para agregar cantidad al inventario
        @Override
        public void agregar_cantidad(int cantidad) {
            this.cantidad += cantidad;
            System.out.println("Se han agregado " + cantidad + " unidades al inventario de " + nombre + ".");
        }

        // Implementación del método para vender el producto
        @Override
        public void vender(int cantidad) {
            if (this.cantidad >= cantidad) {
                this.cantidad -= cantidad;
                System.out.println("Se han vendido " + cantidad + " unidades de " + nombre + ".");
            } else {
                System.out.println("Esta operacion no se pudo realizar. No hay en existencia suficientes unidades de " + nombre + " en inventario.");
            }
        }
    }
}
