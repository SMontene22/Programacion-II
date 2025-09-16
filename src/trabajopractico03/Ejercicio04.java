package trabajopractico03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sergio Montenegro
 */
public class Ejercicio04 {
    
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        gallina1.setGallina(1, 3);
        gallina2.setGallina(2, 4);
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        gallina1.envejecer();
        gallina1.ponerHuevo(4);
        gallina1.envejecer();
        gallina1.ponerHuevo(4);
        
        gallina2.envejecer();
        gallina2.envejecer();
        gallina2.ponerHuevo(6);
        gallina2.ponerHuevo(4);
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        
    }
    
        
        
    
    
}
