
package ooptriangulo;

import java.util.Scanner;
public class OOPTriangulo {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base,lado;
        int cantTriangulos,indice;
        System.out.println("Cantidad de triangulo");
        cantTriangulos = scanner.nextInt();
        
        Triangulo triangulos[] = new Triangulo[cantTriangulos];
        
        for (int i=0; i< triangulos.length;i++){
            scanner.nextLine();
            System.out.println("base");
            base = scanner.nextDouble();
            System.out.println("lado");
            lado = scanner.nextDouble();
            
            triangulos[i]= new Triangulo(base,lado);
            System.out.println("P "+triangulos[i].perimetro());
            System.out.println("A "+triangulos[i].area());
        }
        System.out.println("Mayor area: "+trianMayorArea(triangulos));
    }
    
    public static double trianMayorArea(Triangulo triangulos[]){
        double mayorArea = triangulos[0].area();
       
        for (int i=1;i<triangulos.length;i++){
            if(triangulos[i].area()>mayorArea){
                mayorArea = triangulos[i].area();
                
            }
        }
        return mayorArea;
    }
}
