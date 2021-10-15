
package oopvehiculo;
import java.util.Scanner;

public class OOPVehiculo {
    // retornar el indice del coche mas barato
    public static int cocheMBarato(Vehiculo coches[]){
        double precio;
        int indice = 0;
        precio = coches[0].getPrecio();
        
        for (int i = 1; i< coches.length;i++){
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        
        return indice;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String marca, modelo;
        double precio;
        int numVehiculos, indiceCocheMBarato;
        
        System.out.println("Digite la cantidad de vehículos");
        numVehiculos = scanner.nextInt();
        
       // creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numVehiculos];
       
       // pedir que introduzca todos los valores
       for (int i = 0; i < coches.length;i++){
           scanner.nextLine();
           System.out.println("Caracteríticas del vehiculo "+(i+1));
           System.out.println("Marca:");
           marca = scanner.nextLine();
           System.out.println("Modelo:");
           modelo = scanner.nextLine();
           System.out.println("Precio");
           precio = scanner.nextFloat();
           coches[i] = new Vehiculo(marca,modelo,precio);
       }
       
      indiceCocheMBarato = cocheMBarato(coches);
        System.out.println("Coche mas barato es "+coches[indiceCocheMBarato].mostarDatos());
       
    }
    
}
