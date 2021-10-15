
package tarea5oop.Entidades;

import java.time.LocalDate;


public abstract class Transferencia {
    private LocalDate fecha;
    private double monto;
    private int cuentaDestino;

    public Transferencia(LocalDate fecha, double monto, int cuentaDestino) {
        this.fecha = fecha;
        this.monto = monto;
        this.cuentaDestino = cuentaDestino;
    }
    
    public abstract void imprimirDatos();
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(int cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }
    
    
    
}
