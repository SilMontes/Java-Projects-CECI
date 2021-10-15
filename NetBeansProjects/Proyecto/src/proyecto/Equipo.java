
package proyecto;

import java.util.ArrayList;

public class Equipo{
    private String nombreEquipo;
    private String ciudad;
    private String nombreEstadio;
    private ArrayList<Jugador> jugadores;
    private Entrenador entrenador;
    private Liga liga;
    private int golesFavor;
    private int golesContra;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
   // private int puntos;
    

    public Equipo(String nombreEquipo, String ciudad, String nombreEstadio) {
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        this.nombreEstadio = nombreEstadio;
        jugadores = new ArrayList<>();
       // this.puntos = (partidosGanados*3)+(partidosEmpatados*1);
        
    }
     public void setEntrenador(Entrenador entrenador) {
         if( this.entrenador != entrenador && this.entrenador != null && entrenador != null ){
             this.entrenador.setEquipo(null);
         }
        this.entrenador = entrenador;
        if(entrenador != null){
            entrenador.setEquipo(this);
        }
    }

    public int calcularPuntos(){
        int puntos = (partidosGanados*3)+(partidosEmpatados*1);
        return puntos;
    }
    public void agregarJugador(Jugador jugador){
        
        if(jugadores.size() < 8){
            if(!jugadores.contains(jugador)){
                jugadores.add(jugador);
                jugador.setEquipo(this);
            }else{
                System.out.println("Ya se ha agregado al jugador "+jugador.getNombre());
            }
        }else{
            System.out.println("El equipo no puede tener más de 8 jugadores");
        }
        
    }
    public void eliminarJugador(Jugador jugador){
        if(jugadores.contains(jugador)){
            jugadores.remove(jugador);
            jugador.setEquipo(null);
        }else{
            System.out.println(jugador.getNombre()+" no se encuentra en la lista de jugadores");
        }
    }
    public int obtenerDiferenciaGoles(){
        int diferenciaGoles= golesFavor-golesContra;
        if(diferenciaGoles < 0){
            diferenciaGoles *= -1;
        }
        return diferenciaGoles;
    }
    public int totalPartidosJugados(){
        int totalPartidos = partidosGanados+partidosEmpatados+partidosPerdidos;
        return totalPartidos;
    }
    
    protected void setLiga(Liga liga) { 
        this.liga = liga;
    }
    
    public void agregarGolesfavor(int golesFavor){
        this.golesFavor += golesFavor;
    }
    public void agregarGolesContra(int golesContra){
        this.golesContra += golesContra;
    }
    public void sumarPartidosGanados(){
        partidosGanados ++;
    }
    public void sumarPartidosPerdidos(){
        partidosPerdidos ++;
    }
    public void sumarPartidosEmpatados(){
        partidosEmpatados ++;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    private void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    private void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

   

    public Liga getLiga() {
        return liga;
    }

    

    public int getGolesFavor() {
        return golesFavor;
    }

    private void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    private void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    private void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    private void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    private void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    @Override
    public String toString() {
        return   nombreEquipo +"       "+ totalPartidosJugados()+"       "+ partidosGanados + "     " + partidosEmpatados + "       " + partidosPerdidos + "       "+golesFavor+ "       "+golesContra+ "       "+obtenerDiferenciaGoles()+"       "+calcularPuntos();
    }
   
    
    
}
