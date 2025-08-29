/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico02;

import java.util.Scanner;

/**
 *
 * @author Sergio Montenegro
 * Contador de Positivos, Negativos y Ceros (for).
 */
public class Ejercicio06 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int cero = 0;
                
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número entero " + i + ":");
            int num = input.nextInt();
            if (num == 0){
                cero++;
            } else if(num<0){
                neg++;
            } else pos++;
        }
        System.out.println("La suma total de números positivos es: " + pos);
        System.out.println("La suma total de números negativos es: " + neg);
        System.out.println("La suma total de números ceros es: " + cero);

    }
}