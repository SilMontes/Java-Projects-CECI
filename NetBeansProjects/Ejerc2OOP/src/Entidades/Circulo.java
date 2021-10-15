/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Adobes
 */
public class Circulo {
     int medRadio;
    public static double PI = 3.14; //los estaticos pertenecesn a la clase
    public Circulo(int medRadio){
        this.medRadio = medRadio;
    }
    
     public double circunferencia(){
        double circunferencia = this.medRadio * 2 * PI ;
       return circunferencia;
    }
     
    public double area(){
        double radio =PI*(this.medRadio*this.medRadio);
       return radio;
    }

    public int getMedRadio() {
        return medRadio;
    }

    public void setMedRadio(int medRadio) {
        this.medRadio = medRadio;
    }

    public static double getPI() { //un metodo estatico solo puede referenciar campos estaticos
        return PI;
    }

    public static void setPI(double PI) {
        Circulo.PI = PI;
    }
    
}
