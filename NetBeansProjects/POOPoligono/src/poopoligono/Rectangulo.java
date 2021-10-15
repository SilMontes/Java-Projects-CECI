/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopoligono;

public class Rectangulo extends Poligono{
    private double lado1;
    private double lado2;
    
    public Rectangulo(double lado1,double lado2){
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() { // con el super le decimos que traiga el metodo que esta en la clase padre y muestre el texto que tiene
        return "Rectangulo:\n" +super.toString()+ "\nlado1=" + lado1 + "\nlado2=" + lado2;
    }
    @Override
    public double area(){
        double area = lado1 * lado2;
        return area;
    }
}
