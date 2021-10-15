
package tarea5oop;

import java.time.LocalDate;
import java.time.Month;
import  tarea5oop.Entidades.CuentaBancaria;
import  tarea5oop.Entidades.Estudiante;
import java.util.Arrays;
public class Tarea5OOP {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(965,10000,1345,30000);
       
        
        System.out.println("------------------------------------------------------");
        System.out.println("| Nombre equipo |   MP  |   W   |   D   |   L   |   GF  |   GA  |   GD  |   pTS  |");
        
        cuenta.transferenciaBancaria(100,1234,"BCR","pAGO ");
        cuenta.tranferenciaMovil(2000, 657897);
        cuenta.transferenciaBancaria(213,246,"BAC","pAGO AL ");
        cuenta.tranferenciaMovil(54, 67895);
        cuenta.transferenciaBancaria(234,5356,"BNA","pAGO CASA");
        cuenta.tranferenciaMovil(2345, 6787);
        
        cuenta.imprimirTransferencias();
        System.out.println(""+cuenta.getTranferencias().size());
       
    }
    
}
