
package herenciapolimorfismo;

public abstract class Personaje {
    private String nombre;
    private int puntosVida;
    private String arma;

    public Personaje(String nombre, int puntosVida, String arma) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.arma = arma;
    }

    public abstract void atacar();
    
    public abstract void recuperar();
    
    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
    
    
}
