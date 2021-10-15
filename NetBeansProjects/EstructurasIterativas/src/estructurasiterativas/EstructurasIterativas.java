/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasiterativas;

import java.util.Scanner;
public class EstructurasIterativas {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double cant = 2, cost = 0, sub = 0;
        double imp = 0.13;
        
        if(cant > 10 && cant <= 20){
            sub = 13.00 * cant;
        }else if(cant > 20){
            sub = 10.00 * cant;
        }else{
            sub = cant * 20.00;
        }
        
        cost = (sub * imp) + sub;
        System.out.println(cost);
        /*
        int numero = 5;
        long factorial = 1;
        for (int i = 2; i <= numero ; i++){
            factorial += i;
        }
        System.out.println(factorial);
        
         double nota;
        double totalNotas = 0;
        int contNotas = 0;
        int cursosGanados = 0;
        int cursoPerdidos = 0;

        do {
            System.out.println("Digite la nota, ingrese -1 para salir");
            nota = scanner.nextDouble();

            if (nota != -1) {
                totalNotas += nota;
                contNotas++;
                if (nota < 70){
                    cursoPerdidos += 1;
                }else{
                    cursosGanados += 1;
                }
            }

        } while (nota != -1);

        if (contNotas != 0) {
            double promedio = totalNotas / contNotas;
            System.out.println("El promedio es: "+promedio+"."+" La cantidad de cursos aprobadas son "+cursosGanados+" y la cantidad de cursos reprobados son "+cursoPerdidos);
        } else {
            System.out.println("No ingreso ninguna nota");
        }
*/
    }
    
}
