
package herenciapolimorfismo;

public class Guerrero extends Personaje{
    private int durabilidad;

    public Guerrero(int durabilidad, String nombre, int puntosVida) {
        super(nombre, puntosVida,"Hacha");
        this.durabilidad = durabilidad;
    }
    
    @Override
    public void atacar(){
        System.out.println(getNombre()+" embiste con su hacha");
        durabilidad -= 15;
    }
    
    @Override
    public void recuperar(){
        durabilidad += 10;
    }
    
    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }
    
    
    
}
