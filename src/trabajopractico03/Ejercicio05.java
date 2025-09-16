package trabajopractico03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sergio Montenegro
 */
public class Ejercicio05 {
    
    public static void main(String[] args){
        NaveEspacial nave1 = new NaveEspacial();
        nave1.crearNave("Apolo 001", 50);
        nave1.despegar();
        nave1.mostrarEstado();
        
        nave1.avanzar(30);
        nave1.avanzar(30);
        nave1.recargarCombustible(20);
        nave1.avanzar(30);
        
        nave1.mostrarEstado();
        
    }
}
