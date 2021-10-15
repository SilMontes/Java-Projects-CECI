/*
    Contruir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus dos lados.
    Los valores de la longitud deberán introducirse por línea de órdenes. Si es un cuadrado, sólo se proporcionará 
    la longitud de uno de los dos lados
    
 */
package ejercico1oop;

public class Cuadrilatero {
    private float lado1;
    private float lado2;
    
    public Cuadrilatero(float lado1, float lado2){
        this.lado1 =  this.lado2 = lado1;
    }
    public Cuadrilatero(float lado1){
        this.lado1 = lado1;
        this.lado2 = lado1;
    }
    public float getPerimetro(){
        float perimetro =(lado1*2)+(lado2*2);
        return perimetro;
    }
    public float getArea(){
        float area = (lado1 * lado2);
        return area;
    }
}
