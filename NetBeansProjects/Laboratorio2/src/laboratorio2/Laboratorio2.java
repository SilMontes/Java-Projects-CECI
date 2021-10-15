
package laboratorio2;
import  java.util.Arrays;

public class Laboratorio2 {

    public static void main(String[] args) {
        int [] numeros = {80, 85, 85, 93, 88};
        System.out.println( "El resulatdo de la suma es: "+calcularSuma(numeros));
        System.out.println( "El promedio es: "+calclarPromedio(numeros));
        System.out.println( "El numero mayor es: "+obtenerMayor(numeros));
        System.out.println(encontrarNumero(8,numeros));
    }
    
    static int calcularSuma(int [] arregloNumeros){
        int sumatoria = 0;
        for (int i = 0; i < arregloNumeros.length; i++){
            sumatoria += arregloNumeros[i];
        }
        return sumatoria;
    }
    static int calclarPromedio(int [] arregloNumeros){
        int sumatoria = calcularSuma(arregloNumeros);
        int promedio = sumatoria / arregloNumeros.length;
        return promedio;
    }
    static int obtenerMayor(int [] arregloNumeros){
        int numeroMayor = arregloNumeros[0];
        for (int i = 0; i < arregloNumeros.length; i++){
           if(arregloNumeros[i] > numeroMayor){
               numeroMayor = arregloNumeros[i];
           }
        }
        return numeroMayor;
    }
    static boolean encontrarNumero(int numero, int [] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == numero){
                return true;
            }
                
        }
        return false;
    }
}
