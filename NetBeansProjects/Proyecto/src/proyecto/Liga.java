
package proyecto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Liga {
    private String nombre;
    private String patrocinador;
    private ArrayList<Equipo> equipos;
    
    public Liga(String nombre, String patrocinador) {
        this.nombre = nombre;
        this.patrocinador = patrocinador;
        equipos = new ArrayList<>();
    }
    
    public void agregaEquipo(Equipo equipo){
        if(!equipos.contains(equipo)){
            equipos.add(equipo);
            equipo.setLiga(this);
        }else{
            System.out.println("EL equipo "+equipo.getNombreEquipo()+" ya forma parte de la liga "+nombre);
        }
    }
    public void eliminarEquipo(Equipo equipo){
        if(equipos.contains(equipo)){
            equipos.remove(equipo);
            equipo.setLiga(null);
        }else{
            System.out.println("EL equipo "+equipo.getNombreEquipo()+" no forma parte de la liga "+nombre);
        }
    }
   
    public void mostrarTabla(){
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Nombre Equipo |   MP  |   W   |   D   |   L   |   GF  |   GA  |   GD  |   Pts   |");
        Collections.sort(equipos,new CompareEquipo());
        for(Equipo eq:equipos){
            System.out.println(eq.toString());
            System.out.println("");
        }
    }
    
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    
}
