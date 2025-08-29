/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico02;

import java.util.Scanner;

/**
 *
 * @author smont
 * Cálculo de descuento especial usando variable global
 */
public class Ejercicio11 {
    
    static double DESCUENTO_ESPECIAL = 0.10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: $");
        double precio = input.nextDouble();
        
        System.out.println("El precio final con descuento es: $" + calcularDescuentoEspecial(precio));
    }

    public static double calcularDescuentoEspecial(double precio) {
        
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        System.out.println("El descuento aplicado es de: $" + descuentoAplicado);
        return precio - descuentoAplicado;
    }
    
    
}