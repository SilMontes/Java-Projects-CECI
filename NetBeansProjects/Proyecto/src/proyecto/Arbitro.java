
package proyecto;

import java.time.LocalDate;
import java.util.ArrayList;


public class Arbitro extends Persona{
    
    private ArrayList<Partido> partidos;
    private int cantidadPartidos;

    public Arbitro( String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
        partidos = new ArrayList<>();
     
    }
    
    protected void agregarPartido(Partido partido){
        if(!partidos.contains(partido)){
            partidos.add(partido);
            cantidadPartidos++;
        }else{
            System.out.println("El partido con jornada "+partido.getNumeroJornada()+" fecha "+partido.getFecha()+" ya ha sido agregado.");
        }
    }
    
    protected void eliminarPartido(Partido partido){
        if(partidos.contains(partido)){
            partidos.remove(partido);
            partido.setArbitro(null);
            cantidadPartidos--;
        }else{
            System.out.println("El partido jornada "+partido.getNumeroJornada()+" fecha "+partido.getFecha()+" no esta en la lista de partidos");
        }
    }
    
    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    private void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public int getCantidadPartidos() {
        return cantidadPartidos;
    }

    public void setCantidadPartidos(int cantidadPartidos) {
        this.cantidadPartidos = cantidadPartidos;
    }
    
    
}
