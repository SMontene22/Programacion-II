/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico03;

/**
 * 
 * @author Sergio Montenegro
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;    
    
    
    public void setAnioPublicacion(int anio){
        if (anio<= 0){
            System.out.println("Ingreso un año erroneo, se cargara 0");
            this.anioPublicacion = 0;
        }else{
            this.anioPublicacion = anio;
        }
    }
    
    public void setLibro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }
    
    public void getLibro(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Año de publicación: "+ anioPublicacion);        
    }
}
