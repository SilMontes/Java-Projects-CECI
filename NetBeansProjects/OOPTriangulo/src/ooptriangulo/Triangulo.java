
package ooptriangulo;


public class Triangulo {
    private double base;
    private double lado;

    public Triangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    public double perimetro(){
        double perimetro= base + (lado*2);
        return perimetro;
    }
    public double area(){
        double area= (base*Math.sqrt(lado*lado-((base*base)/4)))/2;
        return area;
    }
    public double getBase() {
        return base;
    }

    public double getLado() {
        return lado;
    }
    
}
