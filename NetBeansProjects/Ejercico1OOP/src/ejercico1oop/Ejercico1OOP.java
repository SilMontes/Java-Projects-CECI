
package ejercico1oop;
import java.util.Scanner;

public class Ejercico1OOP {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
        Cuadrilatero c1;
        float lado1,lado2;
        System.out.println("Digite el lado 1");
        lado1 = scanner.nextFloat();
        System.out.println("Digite el lado 1");
        lado2 = scanner.nextFloat();
        
        if(lado1 == lado2){
            c1 = new Cuadrilatero(lado1);
        }else{
             c1 = new Cuadrilatero(lado1,lado2);
        }
        System.out.println("Perimetro "+c1.getPerimetro());
        System.out.println("Area "+c1.getArea());
    }
    
}
