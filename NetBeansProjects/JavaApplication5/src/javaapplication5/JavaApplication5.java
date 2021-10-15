/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author Adobes
 */
public class JavaApplication5 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Cuál es su edad?");
        int edad = scanner.nextInt();
        
        if (edad >= 18){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }
        
        System.out.println("Ingrese el costo del producto");
        double costProducto = scanner.nextDouble();
        
        System.out.println("Si uste es un cliente normal digite N, pero si es un cliente regular, digite R");
        String tipoCliente;
        tipoCliente= scanner.nextLine();  
        
        double costFinalProducto;
        if (tipoCliente == "N"){
            
            costFinalProducto = costProducto * 0.05;
            System.out.println("El costo final ");
        }else if (tipoCliente == "R"){
            costFinalProducto = costProducto * 0.10;
        }
    }
    
}
