package trabajopractico03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Crear una clase NaveEspacial con los atributos: nombre, combustible. 
Métodos requeridos: despegar(), avanzar(distancia), 
recargarCombustible(cantidad), mostrarEstado(). 
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que 
se supere el límite al recargar. 
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin 
recargar, luego recargar y avanzar correctamente. Mostrar el estado al final. 
 * @author Sergio Montenegro
 */
public class NaveEspacial {
    
    public static double limite = 60;
    
    private String nombre;
    private double combustible;
    
    public void recargarCombustible(double cantidad){
        if ((cantidad > limite)||(combustible+cantidad > limite)){
            System.out.println("Error, limite de carga " + limite
                                + " se cargara hasta el limite");
            combustible = limite;
        } else{
            combustible+=cantidad;
            System.out.println("Carga realizada, combustible disponible: "+ combustible);
        }
            
    }
    
    public void crearNave(String nombre, double combustible){
        this.nombre = nombre;
        recargarCombustible(combustible);
    }
    
    public void despegar(){
        System.out.println("Nave "+ nombre + " motores en marcha...3...2...1...despegue!!");
    }
    
    public void avanzar(double distancia){
        if (combustible >= distancia){
            System.out.println("Avanzando");
            combustible-= distancia;
            System.out.println("Combustible disponible: " + combustible);
        } else
            System.out.println("Sin combustible suficiente para avanzar "
                    + "una distancia de "+ distancia);
    }
    
    public void mostrarEstado(){
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible);
    }
    
    
    
}
