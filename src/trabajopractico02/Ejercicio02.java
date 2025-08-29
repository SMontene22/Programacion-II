/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico02;

import java.util.Scanner;

/**
 *
 * @author Sergio Montenegro
 * Determinar el Mayor de Tres Números.
 */
public class Ejercicio02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int num3 = input.nextInt();
        
        int mayor;
        
        if (num1>num2 && num1>num3){
            mayor = num1;
        } else if (num2>num1 && num2>num3){
            mayor = num2;
            
        } else {
            mayor = num3;
        }
        
        System.out.println("El mayor es: " + mayor);
       
    }
    
}
