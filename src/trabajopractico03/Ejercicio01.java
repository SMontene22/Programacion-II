/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico03;

/**
 *
 * @author Sergio Montenegro
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiantes estudiante1= new Estudiantes();
        estudiante1.setEstudiante("Juan", "Perez", "Programación", 8.5);
        estudiante1.mostrarInfo();
        estudiante1.bajarCalificación(1);
        estudiante1.mostrarInfo();
        estudiante1.subirCalificación(1);
        estudiante1.mostrarInfo();
    }
   
}
