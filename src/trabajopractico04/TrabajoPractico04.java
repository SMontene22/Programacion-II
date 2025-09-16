/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico04;

/**
 *
 * @author Sergio Montenegro
 */
public class TrabajoPractico04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1,"Juan Perez", "Administrativo", 100000);
        Empleado empleado2 = new Empleado("Oscar Gomez", "Jefe");
        Empleado empleado3 = new Empleado(1,"Pedro Gonzalez", "Operario",15000 );
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        
        empleado1.actualizarSalario(10.0);
        empleado2.actualizarSalario(100);
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        
        System.out.println("Total de empleados en la Empresa: "+ empleado1.mostrarTotalEmpleados());
        empleado3.darBaja();
        System.out.println("Total de empleados en la Empresa: "+ empleado1.mostrarTotalEmpleados());
        
    }
    
}
