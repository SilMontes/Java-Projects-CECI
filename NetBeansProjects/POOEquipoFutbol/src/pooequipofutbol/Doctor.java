
package pooequipofutbol;


public class Doctor {
    private String titulacion;
    private int tiempoExperiencia;

    public Doctor(String titulacion, int tiempoExperiencia) {
        this.titulacion = titulacion;
        this.tiempoExperiencia = tiempoExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    @Override
    public String toString() {
        return "Doctor:\n" + super.toString()+"\ntitulacion=" + titulacion + "\ntiempoExperiencia=" + tiempoExperiencia;
    }
    
    
}
