/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package trabajopractico04_ad;

/**int numero: Número de cuenta autogenerado. 
● String titular: Titular de la cuenta. 
● double saldo: Saldo disponible. 
● static int ultimoNumero: Base para autoincrementar la numeración. (por 
defecto 100) 
● static int totalCuentas: Contador global de cuentas creadas. (por defecto 0)
 *
 * @author Sergio Montenegro
 */
public class Cuenta {
    private int numero;
    private String titular;
    private double saldo;
    
    private static int ultimoNumero = 100;
    private static int totalCuentas = 0;
    
    // Constructores
    public Cuenta(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.numero = ++ultimoNumero;
        totalCuentas++;
    }

    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.numero = ++ultimoNumero;
        totalCuentas++;
    }
    
    // Getters y Setters
    
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Métodos
    public double consultarSaldo() {
        return saldo;
    }

    public double consultarSaldo(double cotizacionDolar) {
        if (cotizacionDolar > 0) {
            return saldo / cotizacionDolar;
        } else {
            return 0;
        }
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito Efectuado");
        }
    }

    public void extraer(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Extracción realizada");
        } 
        else System.out.println("Saldo Insuficiente");
        
    }
    
    public static int mostrarTotalCuentas() {
        return totalCuentas;
    }

     // toString
    @Override
    public String toString() {
        return "Cuenta Nº: " + numero +
               "\nTitular: " + titular +
               "\nSaldo: $" + String.format("%.2f", saldo);
    }

}
