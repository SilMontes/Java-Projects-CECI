
package tarea5oop.Entidades;

import java.time.LocalDate;

public class TMovil extends Transferencia{

    public TMovil(LocalDate fecha, double monto, int cuentaDestino) {
        super(fecha, monto, cuentaDestino);
    }
   public void notificar(){
       System.out.println("Se ha tranferido "+getMonto()+" al número "+getCuentaDestino());
   }
    @Override
   public void imprimirDatos(){
       System.out.println("fECHA: "+getFecha().toString()+" Numero Célular: "+getCuentaDestino()+" Monto: "+getMonto());
   }
}
