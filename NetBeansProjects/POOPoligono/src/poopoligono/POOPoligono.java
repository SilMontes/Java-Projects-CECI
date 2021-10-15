
package poopoligono;
import java.util.ArrayList;
import java.util.Scanner;

public class POOPoligono {
     
// arreglo dinamico para almacenar poligonos, no tenemos que indicarle cuántos elementos va a tener
   static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
   
   static Scanner scanner = new Scanner(System.in); 
   
    public static void main(String[] args) {
        
        //llenar un poligono
       llenarPoligono();
       
       // mostrar datos y el area de cada poligono
       mostrarResultado();
       
    }     
    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do{
            do{
                System.out.println("Digite qué poligono desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.println("Opción: ");
                opcion = scanner.nextInt();
            }while(opcion <1 || opcion >2);
            
            switch(opcion){
                case 1: llenarTriangulo();
                    break;
                case 2: llenarRectangulo();
                    break;
            }
            System.out.println("\nDesea introducir otro pologono (s/n)");
            respuesta = scanner.next().charAt(0);
            System.out.println("");
        }while(respuesta =='s' ||respuesta=='S');
    }
    
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        System.out.println("Digite el lado 1");
        lado1 = scanner.nextDouble();
        System.out.println("Digite el lado 2");
         lado2 = scanner.nextDouble();
        System.out.println("Digite el lado 3");
         lado3 = scanner.nextDouble();
         
         Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
         //añadir al arreglo de poligonos
         poligono.add(triangulo);
    }
    public static void llenarRectangulo(){
        double lado1,lado2;
        System.out.println("Digite el lado 1");
        lado1 = scanner.nextDouble();
        System.out.println("Digite el lado 2");
         lado2 = scanner.nextDouble();
        
         Rectangulo rectangulo = new Rectangulo(lado1,lado2);
         poligono.add(rectangulo);
    }
    public static void mostrarResultado(){
        for(Poligono elemento:poligono){
            System.out.println("");
            System.out.println("Datos: "+elemento.toString());
            System.out.println("Area: "+elemento.area());
            System.out.println("");
        }
    }
}
