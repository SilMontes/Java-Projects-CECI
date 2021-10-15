
package main;


public class Arquero extends Personaje{
    private int flechas;
    
    //subclase
    public Arquero(String nombre, int puntosVida, int flechas) {
        super(nombre, puntosVida, "Arco"); // super llama al construcutor de la superclase
        this.flechas = flechas;
    }
    @Override
     public void atacar(){
        System.out.println(getNombre()+" lanze una flecha"); 
        flechas --;
    }
    
    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }
    
    
}
