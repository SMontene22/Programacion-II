package trabajopractico04_ad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sergio Montenegro
 */
public class CasoPractico3 {
    
    public static void main(String[] args){
        
        Producto prod1 = new Producto("Monitor");
        Producto prod2 = new Producto("Teclado",30);
        Producto prod3 = new Producto("CPU",150);
        Producto prod4 = new Producto("Fuente");
        
        System.out.println("Precios bases:");
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
        System.out.println(prod4);
        
        System.out.println("");
        
        System.out.println("Precios con descuentos:");
        // Aplico los descuentos directamente, sin validaciones en el porcentaje.
        System.out.println(prod1.getNombre() + " Precio sin IVA: $" + String.format("%.2f",(prod1.aplicarDescuento(0.2))));
        System.out.println(prod2.getNombre() + " Precio sin IVA: $" + String.format("%.2f",(prod2.aplicarDescuento(0.1))));
        // aplico un descuento del 20% = 30 / monto minimo 20
        System.out.println(prod3.getNombre() + " Precio sin IVA: $" + String.format("%.2f",(prod3.aplicarDescuento(0.2,20))));
        // aplico un descuento del 15% = 15 / monto minimo 20
        System.out.println(prod4.getNombre() + " Precio sin IVA: $" + String.format("%.2f",(prod4.aplicarDescuento(0.15,20))));
        
        System.out.println("");
        
        System.out.println("Precios totales");
        
        System.out.println(prod1.getNombre() + " Precio con IVA: $" + String.format("%.2f",(prod1.calcularPrecioFinal(prod1.aplicarDescuento(0.2)))));
        System.out.println(prod2.getNombre() + " Precio con IVA: $" + String.format("%.2f",(prod2.calcularPrecioFinal(prod2.aplicarDescuento(0.1)))));
        System.out.println(prod3.getNombre() + " Precio con IVA: $" + String.format("%.2f",(prod3.calcularPrecioFinal(prod3.aplicarDescuento(0.2,20)))));
        System.out.println(prod4.getNombre() + " Precio con IVA: $" + String.format("%.2f",(prod4.calcularPrecioFinal(prod4.aplicarDescuento(0.15,20)))));
        
        System.out.println("");
        
        System.out.println("Precios con el nuevo IVA: ");
        Producto.cambiarIVA(0.15);
        System.out.println(prod1.getNombre() + " Precio con IVA: $" + String.format("%.2f",(prod1.calcularPrecioFinal(prod1.aplicarDescuento(0.2)))));
        System.out.println(prod2.getNombre() + " Precio con IVA: $" + String.format("%.2f", (prod2.calcularPrecioFinal(prod2.aplicarDescuento(0.1)))));
        System.out.println(prod3.getNombre() + " Precio con IVA: $" + String.format("%.2f", (prod3.calcularPrecioFinal(prod3.aplicarDescuento(0.2,20)))));
        System.out.println(prod4.getNombre() + " Precio con IVA: $" + String.format("%.2f", (prod4.calcularPrecioFinal(prod4.aplicarDescuento(0.15,20)))));
        
    }
}
