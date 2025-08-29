/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico02;

import java.util.Scanner;

/**
 *
 * @author Sergio Montenegro
 * Composición de funciones para calcular costo de envío y total de compra.
 */
public class Ejercicio09 {
    
    static final double Internacional = 10, Nacional = 5; 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio base del paquete: ");
        double precioProducto = input.nextDouble();

        System.out.print("Ingrese el peso del paquete en Kg: ");
        double peso = input.nextDouble();
        
        char envio;
        do{
            System.out.print("Ingrese la zona de envio: ( Nacional (N) / Internacional (I): ");
            envio = input.next().toUpperCase().charAt(0);
            if ( envio !='N' && envio !='I'){
                System.out.println("Error. Envio incorrecto");
            }
        } while ( envio !='N' && envio !='I');
 
        
        double costoEnvio = calcularCostoEnvio(peso, envio);
        
        double precioTotal = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + precioTotal);
    }

    public static double calcularCostoEnvio(double peso, char envio) {
        double costo;
        if (envio == 'N'){
            return costo = peso * Nacional;
        } else{
            return costo = peso * Internacional;
        }
    }
    
    public static double calcularTotalCompra(double precio, double costoEnvio) {
        double total;
        return total = precio + costoEnvio;
        
    }
    
    
}

