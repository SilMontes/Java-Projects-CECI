
package proyecto;

import java.time.LocalDate;


public class Partido {
    private int numeroJornada;
    private LocalDate fecha;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Arbitro arbitro;
    private int golesFavor;
    private int golesContra;

    public Partido(int numeroJornada, LocalDate fecha) {
        this.numeroJornada = numeroJornada;
        this.fecha = fecha;
        
    }
    
    protected void setEquipoLocal(Equipo equipoLocal) {
        if( equipoLocal !=  this.equipoVisitante){
            this.equipoLocal = equipoLocal;
        }else{
            System.out.println("El equipo local y el equipo visitante no pueden ser el mismo");
        }
        
    }
    
     public void setEquipoVisitante(Equipo equipoVisitante) {
         if(  equipoVisitante  !=  this.equipoLocal){
            this.equipoVisitante = equipoVisitante;
        }else{
            System.out.println("El equipo visitante y el equipo local no pueden ser el mismo");
        }
    }
    
    public void sumaAGolesFavor(){
        golesFavor++;
    }
    private void restarAGolesFavor(){
        golesFavor--;
    }
    public void sumaAGolesContra(){
        golesContra++;
    }
    public void restarAGolesContra(){
        golesContra--;
    }
    
    public void finalizarPartido(){
        equipoLocal.agregarGolesfavor(golesFavor);
        equipoLocal.agregarGolesContra(golesContra);
        
        equipoVisitante.agregarGolesfavor(golesContra);
        equipoVisitante.agregarGolesContra(golesFavor);
        
        if(golesFavor == golesContra){
            equipoLocal.sumarPartidosEmpatados();
            equipoVisitante.sumarPartidosEmpatados();
        }else if(golesFavor > golesContra){
            equipoLocal.sumarPartidosGanados();
            equipoVisitante.sumarPartidosPerdidos();
        }else{
            equipoLocal.sumarPartidosPerdidos();
            equipoVisitante.sumarPartidosGanados();
        }
    }
    
     public void setArbitro(Arbitro arbitro) {
        if(this.arbitro != null && arbitro != this.arbitro && arbitro != null){
            this.arbitro .eliminarPartido(this); //en caso de que se cambie el arbitro
            
        }
        if(arbitro != null){
            arbitro.agregarPartido(this);
        }
       
        this.arbitro = arbitro;
    }
     
    public int getNumeroJornada() {
        return numeroJornada;
    }

    public void setNumeroJornada(int numeroJornada) {
        this.numeroJornada = numeroJornada;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

   

    public Arbitro getArbitro() {
        return arbitro;
    }

   

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }
    
    
    
}
