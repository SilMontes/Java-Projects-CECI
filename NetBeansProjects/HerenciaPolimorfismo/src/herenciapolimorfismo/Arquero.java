
package herenciapolimorfismo;

public class Arquero extends Personaje{
    private int flechas;

    public Arquero(int flechas, String nombre, int puntosVida) {
        super(nombre, puntosVida, "Arco");
        this.flechas = flechas;
    }

    @Override
    public void atacar(){
        System.out.println(getNombre()+" lanza una flecha");
        flechas--;
    }
    
    @Override
    public void recuperar(){
        flechas += 5;
    }
    
    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }

    
    
    
}
