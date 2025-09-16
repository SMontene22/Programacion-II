/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico04;

/**
 *
 * @author Sergio Montenegro
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    double salario;
    
    private static int totalEmpleados = 0;
    
    private static int generadorId = 1;

    // Constructor
    public Empleado(int id, String nombre, String puesto, double salario) {
        setId(id);
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    // Constructor sobrecargado con generador de ID y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = generadorId;
        generadorId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100000; 
        totalEmpleados++;
    }
    
    public void actualizarSalario(double porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje / 100);
        }
    }
    
    // Método sobrecargado.
    public void actualizarSalario(int aumentoFijo) {
        if (aumentoFijo > 0) {
            this.salario += aumentoFijo;
        }
    }

    public void darBaja(){
        totalEmpleados -=1;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    public void setId(int id) {
        if (id >= generadorId){
            this.id = id;
            generadorId = id+1;
        } else {
            System.out.println("El id puede estar en uso, se asignará el id " + (generadorId));
            this.id = generadorId;
            generadorId++;
        }
    }
        
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }    
    
}
