
package practicarelaciones3.Entidades;


public class Chasis {
    private String color;
    private int cantPuertas;

    public Chasis(String color, int cantPuertas) {
        this.color = color;
        this.cantPuertas = cantPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    private void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
    
}
