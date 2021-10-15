/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc2oop;

import Entidades.Circulo;

/**
 *
 * @author Adobes
 */
public class Ejerc2OOP {

    
    public static void main(String[] args) {
        double num = (1000*50)/100;
        System.out.println(""+ num);
        Circulo c1 = new Circulo(4);
        System.out.println( c1.circunferencia());
        System.out.println(Circulo.PI);//PUEDO LLAMARLO ASÍ PORQUE pi ES UN CAMPO ESTATICO, AHORA LE PERTENECE A LA CLASE
    }
    
}
