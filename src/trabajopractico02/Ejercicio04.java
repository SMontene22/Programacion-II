/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico02;

import java.util.Scanner;

/**
 *
 * @author Sergio Montenegro
 * Calculadora de Descuento según categoría. 
 */
public class Ejercicio04 {
 
    static final double A = 0.10, B = 0.15, C = 0.20;   
    public static void main (String[] args){
         Scanner input = new Scanner(System.in);
         
         System.out.print("Ingrese el precio del producto: ");
         double precio = input.nextDouble();
         
         System.out.print("Ingrese la categoría (A, B, C): ");
         char categoria = input.next().toUpperCase().charAt(0);
         
         switch (categoria){
             case 'A':
                 System.out.println("Descuento aplicado: " + (A*100) + " %");
                 System.out.println("Precio final: $"+ (precio-(precio*A)));
                 break;
             case 'B':
                 System.out.println("Descuento aplicado: " + (B*100) + " %");
                 System.out.println("Precio final: $"+ (precio-(precio*B)));
                 break;
             case 'C':
                 System.out.println("Descuento aplicado: " + (C*100) + " %");
                 System.out.println("Precio final: $"+ (precio-(precio*C)));
                 break;
             default:
                 System.out.println("Error, no existe esa categoria...");
                 
         }
         
         
     }
}
