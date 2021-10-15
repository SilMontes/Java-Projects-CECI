/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopoligono;

public abstract class  Poligono {
    protected int numLados;

    public Poligono(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    private void setNumLados(int numLados) {
        this.numLados = numLados;
    }
    
    // to string
    
    @Override
    public String toString(){
        return "NumLados=" + numLados;
    };

    public abstract double area(); //  DECLARAMOS EL METODO AREA COMO ABSTRACTO
}
