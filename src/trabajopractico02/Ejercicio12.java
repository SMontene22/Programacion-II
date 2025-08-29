/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico02;

import java.util.Scanner;
/**
 *
 * @author Sergio Montenegro
 * Modificación de un array de precios y visualización de resultados
 */
public class Ejercicio12 {
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios Originales: ");
        mostrarVector(precios);
        System.out.println("Precios Modificados: ");
        precios[2]=129.99;
        mostrarVector(precios);
        
    }

    public static void mostrarVector(double[] precios) {
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $" + precios[i]);
            
        }
    }
}
