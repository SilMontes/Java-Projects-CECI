
package practicarelaciones2.Entidades;


public class Jugador {
  private String nombre;
    private int numero;
    private Equipo equipo;
    public Jugador(String nombre, int numero){
        this.nombre = nombre;
        this.numero = numero;
    }
     public String getNombre(){
        return nombre;
    }
      private void setNombre(String nombre){
        this.nombre= nombre;
    }
      public int getNumero(){
          return numero;
      }
      private void setNumero(int numero){
          this.numero = numero;
      }
      public Equipo getEquipo (){
          return equipo;
      }
      public void setEquipo(Equipo equipo){
          this.equipo = equipo;
      }  
}
