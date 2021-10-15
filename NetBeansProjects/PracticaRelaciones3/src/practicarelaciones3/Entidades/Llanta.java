
package practicarelaciones3.Entidades;

public class Llanta {
    private String marca;
    private int numAro;

    public Llanta(String marca, int numAro) {
        this.marca = marca;
        this.numAro = numAro;
    }

    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumAro() {
        return numAro;
    }

    private void setNumAro(int numAro) {
        this.numAro = numAro;
    }
    
}
