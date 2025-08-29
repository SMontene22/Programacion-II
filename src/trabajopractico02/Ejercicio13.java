/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico02;

/**
 *
 * @author Sergio Montenegro
 * Impresión recursiva de arrays antes y después de modificar un elemento.
 */
public class Ejercicio13 {
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios Originales: ");
        int ini=0;
        mostrarVector(ini , precios);
        System.out.println("Precios Modificados: ");
        precios[2]=129.99;
        ini = 0;
        mostrarVector(ini, precios);        
    }

    public static void mostrarVector(int i, double[] precios) {
        if (i < precios.length) {
            System.out.println("Precio: $" + precios[i]);
            mostrarVector(i + 1, precios);
        }       
    }
}