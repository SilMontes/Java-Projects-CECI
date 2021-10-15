
package tarea5oop.Entidades;

import java.time.LocalDate;
import java.util.ArrayList;


public class CuentaBancaria {
    
    private int numCuenta;
    private double saldo;
    private final int numCedula;
    private int limiteRetiro;
    private ArrayList<Transferencia> tranferencias;
    
    public CuentaBancaria(int numCuenta,double saldo,int numCedula,int limiteRetiro ){
         this.numCuenta = numCuenta;
         this.saldo = saldo;
         this.numCedula = numCedula;
         this.limiteRetiro = limiteRetiro;
         tranferencias = new ArrayList<>() ;
    }
    
    public void tranferenciaMovil(double monto,int cuentaDestino){
        
        if(monto <= this.saldo){
            TMovil tmovil = new TMovil(fechHoy(),monto,cuentaDestino);
            tmovil.notificar();
            this.saldo -= monto;
            tranferencias.add(tmovil);
        }else{
            System.out.println("Fondos insuficientes para realizar la transferencia");
        }
        
    }
    public void transferenciaBancaria(double monto, int cuentaDestino,String nombreBanco,String motivo){
        if(monto <= this.saldo){ //String nombreBanco, String motivo, LocalDate fecha, double monto, int cuentaDestino)
            TBancaria tbancaria = new TBancaria(nombreBanco,motivo,fechHoy(),monto,cuentaDestino);
            this.saldo -= monto;
           tranferencias.add(tbancaria);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void imprimirTransferencias(){
        for(Transferencia t:tranferencias){
            t.imprimirDatos();
        }
    }
    public void depositar(double montoDeposito){
        if(montoDeposito > 0){
            saldo += montoDeposito;
            System.out.println("Exitoso");
        }else{
             System.out.println("El monto a depositar debe ser mayor a 0.");
        }
        
    }
    private LocalDate fechHoy(){
        return LocalDate.now();
    }
    //aplicar mas validaciones
    public void retiro(int montoRetirar){
        if(montoRetirar > limiteRetiro){
            System.out.println("No es posible realizar la transacción, existe un límite de retiro de :"+limiteRetiro);
        }else if(montoRetirar >saldo){
            System.out.println("Fondos insuficientes");
        }else if(montoRetirar < 0){
            System.out.println("Monto a retirar debe ser mayor a 0");
        }else{
            saldo -= montoRetirar;
            System.out.println("Exitoso");
        }
       
    }
    
    public int getNumCuenta(){
        return numCuenta;
    }
   
    public void setNumCuenta(int numCuenta){
        this.numCuenta = numCuenta;
    }
    
     public int getNumCedula(){
        return numCedula;
    }
     
    public double getSaldo(){
        return saldo;
    }
     // lo manejaremos con RETIRAR Y DEPOSITAR, NUNCA LO CAMBIAREMOS DIRECTAMENTE
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public int getLimiteRetiro(){
        return limiteRetiro;
    }
    
    public void setLimiteRetiro(int limiteRetiro){
        
        // Hacemos esto para no invalidar el límie del retiro
        if(limiteRetiro >= 0){
            this.limiteRetiro = limiteRetiro; 
        }else{
            System.out.println("Limite inválido");
        }
        
    }

    public ArrayList<Transferencia> getTranferencias() {
        return tranferencias;
    }

    public void setTranferencias(ArrayList<Transferencia> tranferencias) {
        this.tranferencias = tranferencias;
    }
   
    
}
