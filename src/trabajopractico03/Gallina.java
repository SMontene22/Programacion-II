package trabajopractico03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sergio Montenegro
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public void setGallina(int idGallina, int edad){
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }
    
    public void ponerHuevo(int huevos){
        huevosPuestos += huevos;
    }
    
    public void envejecer(){
        edad++;
    }
    
    public void mostrarEstado(){
        System.out.println("Gallina: "+ idGallina);
        System.out.println("Edad: "+ edad);
        System.out.println("Huevos Puestos: " + huevosPuestos);
    }
}
