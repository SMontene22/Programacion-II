/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package trabajopractico04_ad;

/**
 *
 * @author Sergio Montenegro
 */
public class Alumno {
    
    private String nombre;
    private double promedio;
    private static double notaAprobacion = 6;
    
    public Alumno(String nombre){
        this.nombre = nombre;
        this.promedio = 0;
    }
    
    public Alumno(String nombre,double promedio){
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public void actualizarPromedio(double nuevoPromedio) {
        this.promedio = nuevoPromedio;
    }

    public void actualizarPromedio(double[] notas) {
        if (notas != null && notas.length > 0) {
            double suma = 0;
            for (double nota : notas) {
                suma += nota;
            }
            this.promedio = suma / notas.length;
        }
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public static double getNotaAprobacion() {
        return notaAprobacion;
    }
    
    // toString
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", promedio=" + promedio + '}';
    }

    // Método estático para cambiar la nota de Aprobación
    public static void cambiarNotaAprobacion(double nueva) {
        if (nueva >= 0 && nueva <= 10) {
            notaAprobacion = nueva;
        }
    }

}
