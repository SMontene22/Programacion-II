/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico03;

/**
 *
 * 
 * @author Sergio Montenegro
 */
public class Estudiantes {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    
    public void setEstudiante (String nombre, String apellido, String curso, double calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    
    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Clasificación: "+ calificacion);
    }
    
    public void subirCalificación(double nota){
        calificacion += nota;
    }
    
    public void bajarCalificación(double nota){
        if (calificacion > 0)
            calificacion -= nota;
            if (calificacion <0)
                calificacion = 0;
    }       
    
}
