
package examen1;
import java.util.Scanner;

public class Examen1 {

    static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        int[] numCedulas = {111, 222, 333, 444}; 
        double[][] ventas = { 
        {385.00, 315.42, 597.39, 398.30, 347.72}, 
        {959.87, 977.91, 434.45, 821.62, 781.84}, 
        {354.79, 554.56, 427.54, 860.18, 620.57}, 
        {625.04, 758.91, 421.23, 500.16, 616.82} };
        
        
        boolean continuar = true;
        
        while(continuar){
            int opcion = mostrarMenu();
            
            switch(opcion){
                case 1:
                    System.out.println("Digite el número de cédula del vendedor.");
                    int numCed = scanner.nextInt();
                    imprimirVentasVendedor(numCed, numCedulas, ventas);
                    break;
                    
                case 2:
                    System.out.println("Digite la inicial del día que desea consultar (L, K, M, J o V).");
                    char inicialDia = scanner.next().charAt(0);
                    imprimirVentasDelDia(inicialDia, ventas);
                    break;
                    
                case 3:
                     System.out.println("Especifique el número de cédula del vendedor.");
                        int numCedula = scanner.nextInt();
                     System.out.println("Digite la inicial del día al que desea agragar la venta (L, K, M, J o V).");
                     char dia = scanner.next().charAt(0);  
                     System.out.println("Ingrese el monto de la venta realizada.");
                     double nuevaventa = scanner.nextInt();
                     acumulandoVentaDelDia(numCedula,dia,nuevaventa,numCedulas,ventas);
                     break;
                     
                case 4:
                    imprimirTodasVentas(ventas);
                     break;
                case 5:
                    vendedorMayorAcumuladoVentas(numCedulas,ventas);
                    break;
                case 6:
                     continuar = false;
                     break;
                 default:
                 System.out.println("¡Opción invalida1");
                 break;
                
            }
        }
        System.out.println("¡Gracias por usar la plataforma!");
    }
    static int mostrarMenu(){
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("               Elija una opción:          ");
        System.out.println("1. Consultar ventas de un usuario");
        System.out.println("2. Consultar las ventas realizadas un día en específico.");
        System.out.println("3. Agregar una venta");
        System.out.println("4. Imprimir todas la ventas");
        System.out.println("5. Vendedor con mayor cantidad de ventas totales");
        System.out.println("6. Salir");
        System.out.println("----------------------------");
        
        return scanner.nextInt();
    }
    
    static int obtenerIndiceCedula(int numCedula, int [] arregloCed){
        
        int indiceCedula = -1;
        for(int i = 0; i < arregloCed.length; i++){
            if(arregloCed[i] == numCedula ){
                indiceCedula = i;
            }
        }
        return indiceCedula;
    }
    
    static void imprimirVentasVendedor(int numCedula, int [] arregloCed, double [][] matrizVentas){
        int indiceCed = obtenerIndiceCedula(numCedula, arregloCed);
        if(indiceCed != -1){
            System.out.println("A continuación se muestran las ventas realizadas:");
            for (int i = 0; i < matrizVentas[indiceCed].length; i++){
            System.out.print(matrizVentas[indiceCed][i]+" ");
        }
        }else{
             System.out.println("Asegurese de ingresar correctamente el número de cédula.");
        }
       
    }
    
    static int indiceRepresentaDia(char inicialDia){
        switch(Character.toUpperCase(inicialDia)){
            case 'L':
                return 0;
            case 'K':
                return 1;
            case 'M':
                return 2;
            case 'J':
                return 3;
            case 'V':
                return 4;
            
            default:
                 return -1;
        }
    }
    
    static void imprimirVentasDelDia(char inicialDia, double [][] matrizVentas){
        int indiceDia = indiceRepresentaDia(inicialDia);
        
        if(indiceDia != -1){
             System.out.println("A continuación se muestran las ventas realizadas:");
            for (int i = 0; i < matrizVentas.length; i++){
                System.out.print(matrizVentas[i][indiceDia]+" ");
            }
        }else{
             System.out.println("Asegurese de ingresar la inicial correcta del día a consultar");
        }
        
    }
    
    static void acumulandoVentaDelDia(int numCed, char diaVenta, double nuevaVenta, int [] arreglo, double [][] matriz ){
        int indiceCedula = obtenerIndiceCedula(numCed,arreglo);
        
        int indiceDiaVenta = indiceRepresentaDia(diaVenta);
        if(indiceCedula != -1 && indiceDiaVenta != -1){
           
             double montoAnterio = matriz[indiceCedula][indiceDiaVenta];
             matriz[indiceCedula][indiceDiaVenta] += nuevaVenta; 
             System.out.println("La venta por "+montoAnterio +" ahora acumula un total de: "+matriz[indiceCedula][indiceDiaVenta] );
                
        }else{
            System.out.println("Asegurese de digitar correctamente el número de cédula y la inicial del día");
        }
        
    }
    
    static void imprimirTodasVentas(double [][] matriz){
        System.out.println("A continuación se enlistan todas las ventas realizadas: ");
         for (int i = 0; i < matriz.length;i ++){
            for (int j = 0; j < matriz[i].length;j++){
               System.out.println(matriz[i][j]);
            }
        }
    }
    
    static void vendedorMayorAcumuladoVentas(int [] cedulas, double [][] ventas){
        double mayorVenta = 0;
        double sumaVentas = 0;
        int indiceCedula = -1;
        int numCed =0;
        for (int i = 0; i < ventas[0].length;i++){
            mayorVenta += ventas[0][i];
        }
        for (int i = 0; i < ventas.length;i++){
            for (int j = 0; j < ventas[i].length; j++){
                sumaVentas += ventas[i][j];
            }
            if(sumaVentas > mayorVenta){
            mayorVenta = sumaVentas;
            sumaVentas = 0;
            indiceCedula = i;
            }else{
                sumaVentas = 0;
            }
        }
        
        for (int i = 0; i < cedulas.length; i ++){
            if(i == indiceCedula){
                numCed =cedulas[i];
                System.out.println("El vendedor con el mayor acumulado de ventas es el portador del número de cédula: "+numCed);
                System.out.println("Monto total de su venta: "+mayorVenta);
            }
        }
    }
}
