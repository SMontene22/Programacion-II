package trabajopractico04_ad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sergio Montenegro
 */
public class CasoPractico2 {
    
    public static void main(String[] args){
        
        
        Alumno alum1 = new Alumno("Juan Perez", 7);
        Alumno alum2 = new Alumno("Oscar Gonzalez");
        Alumno alum3 = new Alumno("Mario Gomez", 4);
        Alumno alum4 = new Alumno("Mario Gonzalez", 9);
    
        alum1.actualizarPromedio(8);
        double notas[] = {7.5, 9.5, 6.0} ;
        alum2.actualizarPromedio(notas);
        alum3.actualizarPromedio(5);
        double notas2[] = {8.0, 8.5, 10} ;
        alum4.actualizarPromedio(notas2);
        
        System.out.println(alum1);
        System.out.println(alum2);
        System.out.println(alum3);
        System.out.println(alum4);
        System.out.println("");
        
        System.out.println("Nota mínima para aprobar: " + Alumno.getNotaAprobacion());
        
        if (alum1.getPromedio() >= Alumno.getNotaAprobacion()){
            System.out.println("El alumno " + (alum1.getNombre()) + " Aprobo");
        } else System.out.println("El alumno " + (alum1.getNombre()) + " NO aprobo");
        
        if (alum2.getPromedio() >= Alumno.getNotaAprobacion()){
            System.out.println("El alumno " + (alum2.getNombre()) + " Aprobo");
        } else System.out.println("El alumno " + (alum2.getNombre()) + " NO aprobo");
        
        if (alum3.getPromedio() >= Alumno.getNotaAprobacion()){
            System.out.println("El alumno " + (alum3.getNombre()) + " Aprobo");
        } else System.out.println("El alumno " + (alum3.getNombre()) + " NO aprobo");
        
        if (alum4.getPromedio() >= Alumno.getNotaAprobacion()){
            System.out.println("El alumno " + (alum4.getNombre()) + " Aprobo");
        } else System.out.println("El alumno " + (alum4.getNombre()) + " NO aprobo");
        
        System.out.println("");
        
       

        Alumno.cambiarNotaAprobacion(4.0);
        System.out.println("Nueva nota mínima para aprobar: " + Alumno.getNotaAprobacion());

        if (alum1.getPromedio() >= Alumno.getNotaAprobacion()){
            System.out.println("El alumno " + (alum1.getNombre()) + " Aprobo");
        } else System.out.println("El alumno " + (alum1.getNombre()) + " NO aprobo");
        
        if (alum2.getPromedio() >= Alumno.getNotaAprobacion()){
            System.out.println("El alumno " + (alum2.getNombre()) + " Aprobo");
        } else System.out.println("El alumno " + (alum2.getNombre()) + " NO aprobo");
        
        if (alum3.getPromedio() >= Alumno.getNotaAprobacion()){
            System.out.println("El alumno " + (alum3.getNombre()) + " Aprobo");
        } else System.out.println("El alumno " + (alum3.getNombre()) + " NO aprobo");
        
        if (alum4.getPromedio() >= Alumno.getNotaAprobacion()){
            System.out.println("El alumno " + (alum4.getNombre()) + " Aprobo");
        } else System.out.println("El alumno " + (alum4.getNombre()) + " NO aprobo");
        
        
    }
    
        
}
