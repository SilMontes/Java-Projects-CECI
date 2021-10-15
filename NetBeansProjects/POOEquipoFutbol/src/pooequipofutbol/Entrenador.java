
package pooequipofutbol;


public class Entrenador {
    private String estrategia;

    public Entrenador(String estrategia) {
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    @Override
    public String toString() {
        return "Entrenador:\n" + super.toString()+"\nestrategia=" + estrategia;
    }
    
    
}
