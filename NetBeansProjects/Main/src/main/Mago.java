
package main;

public class Mago extends Personaje{
    private int magia;

    public Mago(String nombre, int puntosVida,int magia) {
        super(nombre, puntosVida, "Vara");
        this.magia = magia;
    }
    
    @Override
     public void atacar(){
        System.out.println(getNombre()+" conjure un hechizo"); 
        magia -= 25;
    }
    

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }
    
    
}
