
package proyecto;

import java.time.LocalDate;


public class Jugador extends Persona{
    
    private int numeroCamiseta;
    private Equipo equipo;

    public Jugador(int numeroCamiseta, String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.numeroCamiseta = numeroCamiseta;
    }
    // 
    protected void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public Equipo getEquipo() {
        return equipo;
    }
    
    
    
}
