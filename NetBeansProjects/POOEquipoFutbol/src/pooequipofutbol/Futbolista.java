
package pooequipofutbol;


public class Futbolista {
    private int dorsal;
    private String posicion;

    public Futbolista(int dorsal, String posicion) {
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "Futbolista:\n" + super.toString()+"\ndorsal=" + dorsal + "\nposicion=" + posicion;
    }
    
}
