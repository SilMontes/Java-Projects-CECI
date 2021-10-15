
package tarea5oop.Entidades;

import java.time.LocalDate;


public class TBancaria extends Transferencia{
    
    private String nombreBanco;
    private String motivo;

    public TBancaria(String nombreBanco, String motivo, LocalDate fecha, double monto, int cuentaDestino) {
        super(fecha, monto, cuentaDestino);
        this.nombreBanco = nombreBanco;
        this.motivo = motivo;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    @Override
    public void imprimirDatos(){
       System.out.println("fECHA: "+getFecha().toString()+" Cuenta Destino: "+getCuentaDestino()+" Banco Destino; "+nombreBanco+" Motivo: "+motivo+" Monto: "+getMonto());
   }
}
