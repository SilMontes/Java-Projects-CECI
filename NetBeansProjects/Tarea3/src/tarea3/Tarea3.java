
package tarea3;
import java.util.Scanner;
import  java.util.Arrays;

public class Tarea3 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int [] ventas = new int[6];
        int sumatoriaVentas = 0;
         for(int i = 0; i < ventas.length; i ++){
             System.out.println("Ingrese el monto de las ventas realizadas");
             ventas[i] = scanner.nextInt();
             sumatoriaVentas += ventas[i];
             
        }
         System.out.println("El total de ventas semanal es: "+ sumatoriaVentas);
         
        for (int i = 0; i< ventas.length; i++){
            if(ventas[i] >= 500){
                System.out.println("La venta por un monto de "+ventas[i]+" se realizó el día "+i);
            }
        }
        
        int [] notas;
        System.out.println("¿Cuántos estudiante están matriculados en el curso?");
        int longArregloNotas = scanner.nextInt();
        
        notas = new int[longArregloNotas];
        
        int sumatoriaNotas = 0;
        for (int i = 0; i < notas.length; i++){
            System.out.println("Ingrese la nota");
            notas[i] = scanner.nextInt();
            
            sumatoriaNotas += notas[i];
        }
        int promedioNotas = sumatoriaNotas / notas.length;
        
       
        System.out.println("A continuación se mostrarán las notas registradas: ");
        int notaMayor = notas[0];
        int estudianteMayorNota = 0;
        for (int i = 0; i < notas.length; i++){
           System.out.println(notas[i]);
            if(notas[i] > notaMayor){
                notaMayor = notas[i];
                estudianteMayorNota = i;
            }
        }
       System.out.println("El promedio de las notas es: "+promedioNotas);
       System.out.println("La mayor nota registrada es: "+notaMayor+" obtenida por el estudiante "+estudianteMayorNota);
    }
    
}
