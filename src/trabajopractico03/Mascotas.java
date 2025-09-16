/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico03;

/**
 *
 * @author Sergio Montenegro
 */
public class Mascotas {
    private String nombre;
    private String especie;
    private int edad;
    
    public void mostrarInfo(){
        System.out.println("Nombre:" + nombre);
        System.out.println("Especie:" + especie);
        System.out.println("edad:" + edad);
    }
    
    public void cumplirAnio(){
        edad += 1;
    }
    
    public void setMascotas (String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
}
