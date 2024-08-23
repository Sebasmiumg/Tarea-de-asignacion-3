/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ers.jose;

import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class Diferencia_de_Edad {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el año de nacimiento de la primera persona
        System.out.print("Ingrese el año de nacimiento de la primera persona: ");
        int anioNacimientoPersona1 = scanner.nextInt();

        // Solicitar el año de nacimiento de la segunda persona
        System.out.print("Ingrese el año de nacimiento de la segunda persona: ");
        int anioNacimientoPersona2 = scanner.nextInt();

        // Calcular la diferencia de edad y determinar quién es mayor
        int diferencia = Math.abs(anioNacimientoPersona1 - anioNacimientoPersona2);
        if (anioNacimientoPersona1 < anioNacimientoPersona2) {
            System.out.println("La primera persona es mayor.");
        } else if (anioNacimientoPersona1 > anioNacimientoPersona2) {
            System.out.println("La segunda persona es mayor.");
        } else {
            System.out.println("Ambas personas tienen la misma edad.");
        }

        // Mostrar la diferencia de edad
        System.out.println("La diferencia de edad entre ambas personas es de " + diferencia + " años.");
        
        scanner.close();
    }
}

