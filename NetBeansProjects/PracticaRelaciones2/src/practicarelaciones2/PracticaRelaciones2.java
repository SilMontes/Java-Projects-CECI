
package practicarelaciones2;

import practicarelaciones2.Entidades.Equipo;
import practicarelaciones2.Entidades.Jugador;

public class PracticaRelaciones2 {

    
    public static void main(String[] args) {
        
        Equipo equipo = new Equipo("Saprissa","Football");
        
        Jugador jugador = new Jugador("Derek",7);
        Jugador jugador1 = new Jugador("Mike",9);
        
        equipo.agregarJugador(jugador);
        equipo.agregarJugador(jugador1);
        
        System.out.println(equipo.getNombre()+" "+equipo.getDeporte());
        for(Jugador j:equipo.getJugadores()){
            System.out.println(j.getNombre());
        }
        
        System.out.println(jugador.getEquipo().getNombre());
        equipo.eliminarJugador(jugador);
        System.out.println(jugador.getNombre());
        if(jugador.getEquipo()==null){
            System.out.println("Jugador no tiene equipo");
        }
    }
    
}
