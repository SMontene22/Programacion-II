/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico04_ad;

/**
 *
 * @author Sergio Montenegro
 */
public class CasoPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien Años de Soledad","Gabriel García Márquez","Antartida" );
        Libro libro2 = new Libro("Rayuela","Cortazar","Planeta" );
        Libro libro3 = new Libro("Poesias Varias","Anonimo");
        Libro libro4 = new Libro("El principito","Antoine de Saint-Exupéry","Planeta");
        Libro libro5 = new Libro("Don Quijote"," Miguel de Cervantes Saavedra","Antartida");
        
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);
        System.out.println("");
        
        libro1.actualizarTitulo("Edición Especial", "Cien Años de Soledad");
        libro3.actualizarTitulo("Poesias para todos");
        
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);
        System.out.println("");
        
        Libro.cambiarEditorial("Agostini");
        
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);
    }
    
}
