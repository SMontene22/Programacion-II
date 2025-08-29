/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico02;

import java.util.Scanner;

/**
 *
 * @author Sergio Montenegro
 * Cálculo del Precio Final con impuesto y descuento.
 */
public class Ejercicio08 {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = input.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = input.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoTotal = impuesto / 100;
        double descuentoTotal = descuento / 100;
        return precioBase + (precioBase * impuestoTotal) - (precioBase * descuentoTotal);
    }
    
    
}

