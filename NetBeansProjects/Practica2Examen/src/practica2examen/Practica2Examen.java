
package practica2examen;
import java.util.Scanner;
public class Practica2Examen {

    static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        
      int [] numeros = {230, 425, 674, 856, 938};
      
      boolean continuar = true;
      
      while(continuar){
          int opcion = mostrarMenu();
          
          switch(opcion){
            case 1:
                System.out.println("Indique el numero entero que desea buscar.");
                int numeroBuscar = scanner.nextInt();
                int indice = buscarIndice(numeroBuscar,numeros);
                if (indice != -1){
                     System.out.println("El número "+numeroBuscar+" se encontró en la posición "+buscarIndice(numeroBuscar,numeros));
                }else{
                    System.out.println("El número "+numeroBuscar+" no se encontró dentro del arreglo");
                }
                break;
             case 2:
                System.out.println("Indique el numero entero que desea cambiar.");
                int numeroCambiar = scanner.nextInt();
                System.out.println("Indique el numero entero por el que desea reemplazar a "+numeroCambiar);
                int nuevoValor = scanner.nextInt();
                cambiarElementoEnArreglo(numeroCambiar, nuevoValor, numeros);
                break;   
             case 3:
                 for (int i = 0; i < numeros.length; i++){
                     System.out.print(numeros[i]+" ");
                 }
                 break;
             case 4:
                 continuar = false;
                 break;
             default:
                 System.out.println("¡Opción invalida1");
                 break;
        }
      }
      
       System.out.println("¡Gracias por usar nuestra plataforma!");
       
    }
    
    static int mostrarMenu(){
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("               Elija una opción:          ");
        System.out.println("1. Consulatar el índice en que se encuentra un número.");
        System.out.println("2. Cambiar un elemento del arreglo.");
        System.out.println("3. Imprimir el arreglo de numeros");
        System.out.println("4. Salir");
        System.out.println("----------------------------");
        
        return scanner.nextInt();
    }
    
    static int buscarIndice(int numeroBuscar, int [] arreglo){
        int indiceNumero = -1;
        for (int i=0; i < arreglo.length; i++){
            if(arreglo[i] == numeroBuscar){
                indiceNumero = i;
            }
        }
        
       return indiceNumero;
    }
    
   
    
    static void cambiarElementoEnArreglo(int valorOriginal, int valorNuevo, int [] arreglo){
        
        int indiceValorOrignal = buscarIndice(valorOriginal,arreglo);
        
        if (indiceValorOrignal != -1){
            arreglo[indiceValorOrignal] = valorNuevo;
            System.out.println("El cambio fue exitoso.");
        }else{
            System.out.println("El cambio no se ejecutó debido a que "+valorOriginal+" no se encontró dentro del arreglo.");
        }
    }
}
