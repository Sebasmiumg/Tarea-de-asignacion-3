/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ers.jose;

/**
 *
 * @author Sebas
 */
 public class GestionEmpleados {
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Juan Perez", "001", 3000);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Ana Lopez", "002", 20, 150);

        System.out.println("Informacion del empleado asalariado:");
        empleadoAsalariado.mostrarInformacion();
        System.out.println("Salario calculado: $" + empleadoAsalariado.calcularSalario());

        System.out.println("\nInformacion del empleado por horas:");
        empleadoPorHoras.mostrarInformacion();
        System.out.println("Salario calculado: $" + empleadoPorHoras.calcularSalario());
    }

    public static abstract class Empleado {
        protected String nombre;
        protected String id;
        protected double salarioBase;

        public Empleado(String nombre, String id, double salarioBase) {
            this.nombre = nombre;
            this.id = id;
            this.salarioBase = salarioBase;
        }

        public abstract double calcularSalario();

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre + ", ID: " + id + ", Salario Base: $" + salarioBase);
        }
    }

    public static class EmpleadoAsalariado extends Empleado {
        public EmpleadoAsalariado(String nombre, String id, double salarioBase) {
            super(nombre, id, salarioBase);
        }

        @Override
        public double calcularSalario() {
            return salarioBase; // Aquí se podrían añadir bonos o deducciones si fuera necesario
        }
    }

    public static class EmpleadoPorHoras extends Empleado {
        private double tarifaPorHora;
        private int horasTrabajadas;

        public EmpleadoPorHoras(String nombre, String id, double tarifaPorHora, int horasTrabajadas) {
            super(nombre, id, tarifaPorHora * horasTrabajadas);
            this.tarifaPorHora = tarifaPorHora;
            this.horasTrabajadas = horasTrabajadas;
        }

        @Override
        public double calcularSalario() {
            return tarifaPorHora * horasTrabajadas;
        }
    }
}



