/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package trabajopractico04_ad;

/**
 *
 * @author Sergio Montenegro
 */
public class Producto {

    private String nombre;
    private double precioBase;
    private static double IVA = 0.21;
    
    public Producto(String nombre){
        this.nombre = nombre;
        this.precioBase = 100;
    }
    
    public Producto(String nombre, double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
    
    public double aplicarDescuento(double descuento){
        return precioBase - (precioBase*descuento);
    }
    
    public double aplicarDescuento(double descuento, double minimo){
        if ((precioBase*descuento) >= minimo) {
            return precioBase - (precioBase*descuento);
        } else
            return precioBase - minimo;
    }
    
    public double calcularPrecioFinal(double precioBase){
        return precioBase*(1+IVA);
    }
    
    // Método estático para cambiar el IVA
    public static void cambiarIVA (double nuevoIVA){
        if (nuevoIVA > 0) {
            IVA = nuevoIVA;
        }
    }

    // ToString
    @Override
    public String toString() {
        return "Producto:" + 
               "\nNombre = " + nombre + " / Precio Base = $" + precioBase;
    }

    // Getters y Setters    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public static double getIVA() {
        return IVA;
    }
    
    
    
}   

