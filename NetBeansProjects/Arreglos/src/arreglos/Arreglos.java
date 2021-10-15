
package arreglos;

import java.util.Scanner;
import  java.util.Arrays;
public class Arreglos {

 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int [] notas = new int[5];
        int [] notas2 = {80, 85, 85, 93, 88};
        int [] notas3 = new int[5];
         notas[0] = 80;
         notas[1] = 85;
         notas[2] = 73;
         notas[3] = 93;
         notas[4] = 88;
//         
//        for(int i = 0; i < notas3.length; i ++){
//             System.out.println("Ingrese la nota");
//             notas3[i] = scanner.nextInt();
////         }
        // formas de imprimir
         for (int i = 0; i < notas2.length; i ++){
             System.out.println(notas2[i] + " ");
         }
         
         System.out.print(Arrays.toString(notas2)+" ");
         
         // compara arrays
         
         if(Arrays.equals(notas, notas2)){
             System.out.println("Iguales"+" ");
         }else{
             System.out.println("Diferentes"+" ");
         }
         
         //Sumar cada nita del arreglo 2
         int sumatoria = 0;
         for (int i = 0; i < notas2.length; i ++){
             sumatoria += notas2[i];
         }
         
         int promedio = sumatoria / notas2.length;
         System.out.println(sumatoria+" "+promedio);
         
         int notaMayor = notas[0]; // aca asumo que la primer nota es el mayor.Esto me funcionará incluso si las notas están en negativo. Así estaríamos coparando con algo válido
         
         for (int i = 0; i < notas2.length; i ++){
             if(notas2[i] > notaMayor){
                 notaMayor = notas2[i]; // reasigna el valor mayor
             }
         }
         System.out.println(notaMayor);
         
         //Buscar u valor e imprimir su posición
         int valorBuscar = 85;
         int posicion = -1;
          for (int i = 0; i < notas2.length; i ++){
             if(notas2[i] == valorBuscar){
                 posicion = i;
             //    break; //Para que no siga iterando cuando encuentre el valor. Así terminamos el ciclo o igualar i a notas2.length
             i = notas.length;
             }
         }
          if(posicion != -1){
              System.out.println("El valor "+ valorBuscar+" se encontró en la posición "+posicion);
          }else{
               System.out.println("El valor "+ valorBuscar+" no se encontró dentro del array");
          }
          
         //Buscar u valor e imprimir su posición con librería Array y funcion lambda en java
        boolean encontrado  =  Arrays.stream(notas2).anyMatch(x -> x == valorBuscar);
        if(encontrado){
              System.out.println("El valor "+ valorBuscar+" se encontró en el array");
          }else{
               System.out.println("El valor "+ valorBuscar+" no se encontró dentro del array");
          }
    }
    
}
