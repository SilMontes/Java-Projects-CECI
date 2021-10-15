
package oopatlet;


public class Atleta {
    private String nombre;
    private int numAtleta;
    private double tiempoCarrera;

    public Atleta(String nombre, int numAtleta, double tiempoCarrera) {
        this.nombre = nombre;
        this.numAtleta = numAtleta;
        this.tiempoCarrera = tiempoCarrera;
    }
    public String mostrarDatos(){
        return "Nombvre "+nombre+" numAtleta "+numAtleta+" tiempo carrera "+tiempoCarrera;
    }
    public double getTiempoCarrera() {
        return tiempoCarrera;
    }
    
    
}
