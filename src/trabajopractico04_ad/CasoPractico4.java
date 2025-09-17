/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package trabajopractico04_ad;

/**
 *
 * @author Sergio Montenegro
 */
public class CasoPractico4 {

    public static void main(String[] args){
        
        Cuenta cuenta1 = new Cuenta("Oscar Perez");
        Cuenta cuenta2 = new Cuenta("Juan Cruz", 10000);
        
        System.out.println(String.format("%.2f",(cuenta1.consultarSaldo())));
        System.out.println(String.format("%.2f",(cuenta1.consultarSaldo(1400))));
        
        System.out.println("");
        
        System.out.println(String.format("%.2f",(cuenta2.consultarSaldo())));
        System.out.println(String.format("%.2f",(cuenta2.consultarSaldo(1400))));
        
        System.out.println("");
        
        cuenta1.depositar(500000);
        cuenta2.extraer(15000);
        cuenta2.extraer(1000);
        
        System.out.println("");
        
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        
        System.out.println("Total de cuentas creadas: "+ Cuenta.mostrarTotalCuentas());
        
    }
}
