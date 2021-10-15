/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclasemetodosabstractos;


public class Planta extends SerVivo{
    // como planta no es abstracta, debems sobreescribir el metodo alimentarse
    @Override
    public void alimentarse(){
        System.out.println("La planta se  alimenta atrav+es de la fotosistesis");
    }
    
}
