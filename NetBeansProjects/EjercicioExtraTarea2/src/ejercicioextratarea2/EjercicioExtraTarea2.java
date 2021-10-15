/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextratarea2;


import java.util.Scanner;

public class EjercicioExtraTarea2 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite un número entero");
        
        int numero = scanner.nextInt();
        int nuevNumero = numero;
        int numeroPrueba = numero;
        
        int numCifras = 0;
        
       while(nuevNumero != 0){
           
           nuevNumero = nuevNumero / 10;
           numCifras ++;
       }
       
      int sumaPotencia = 0;
      sumaPotencia =(int) (Math.pow(numero % 10, numCifras));
      
      int residuo = numero / 10;
       for(int i = 0; i < numCifras; i++){
           
           sumaPotencia += (int) (Math.pow(residuo % 10, numCifras));
           residuo /= 10;
           
       }
       
       
      if (sumaPotencia == numeroPrueba ){
          System.out.println(numeroPrueba + " es un numero Armstrong");
      }else{
           System.out.println(numeroPrueba + " no es un numero Armstrong");
      }
    }
    
}
