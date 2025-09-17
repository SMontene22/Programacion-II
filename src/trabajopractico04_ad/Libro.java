/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico04_ad;

/**
 *
 * @author Sergio Montenegro
 */
public class Libro {
    private String titulo;
    private String autor;
    private static String editorial = "Independiente";
    
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public Libro(String titulo,String autor, String editorial){
        this.titulo = titulo;
        this.autor = autor;
        Libro.editorial = editorial;
    }
    
    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    // toSring
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    public void actualizarTitulo(String prefijo, String titulo){
        this.titulo = prefijo + " " + titulo;
    }
    
    public void actualizarTitulo(String titulo){
        this.titulo = titulo;
    }
    
    // Método estático para cambiar la editorial
    public static void cambiarEditorial(String nueva) {
        if (nueva != null && !nueva.isEmpty()) {
            editorial = nueva;
        }
    }

}
