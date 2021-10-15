
package proyecto;

import java.time.LocalDate;


public class Entrenador extends Persona{
    
    private int numeroLicencia;
    private Equipo equipo;

    public Entrenador(int numeroLicencia,String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.numeroLicencia = numeroLicencia;
    }
    
    //
    protected void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public Equipo getEquipo() {
        return equipo;
    }
    
    
   
    
    
}
