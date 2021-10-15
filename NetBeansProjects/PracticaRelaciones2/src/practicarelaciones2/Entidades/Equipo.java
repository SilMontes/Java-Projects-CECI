
package practicarelaciones2.Entidades;

import java.util.ArrayList;
public class Equipo {
    private String nombre;
    private String deporte;
    private ArrayList<Jugador> jugadores;
    
    public Equipo(String nombre, String deporte){
        this.nombre = nombre;
        this.deporte = deporte;
        this.jugadores = new ArrayList<>();
    }
    
    public void agregarJugador(Jugador jugador){
        if(jugadores.contains(jugador)){
            System.out.println("Este jugador ya forma parte del equipo");
        }else{
            jugadores.add(jugador);
            jugador.setEquipo(this);//le decimos al jugador que este equipo es su equipo
        }
        
    }
    //eliminar jugadr de este equipo
    public void eliminarJugador(Jugador jugador){
        if(jugadores.contains(jugador)){
            jugadores.remove(jugador);
            jugador.setEquipo(null);
        }else
            System.out.println("Jugaador no se encuentra agregado");
    }
    
    
    public String getNombre(){
        return nombre;
    }
    public String getDeporte(){
        return deporte;
    }
    private void setNombre(String nombre){
        this.nombre= nombre;
    }
    private void setDeportee(String deporte){
        this.deporte= deporte;
    }
    public ArrayList<Jugador> getJugadores(){
        return jugadores;
    }
    private void setJugadores(ArrayList<Jugador> jugadores){
        this.jugadores = jugadores;
    }
}
