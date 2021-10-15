/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.Scanner;

public class TAREA2 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Cuántos días se hospedó en el hotel?");
        int cantDias = scanner.nextInt();
        int precioDia = 15000;
        double totalPagar;
        if (cantDias > 5 && cantDias <= 10){
            
            totalPagar = (cantDias * precioDia) * 0.90;
            System.out.println("Debe cancelar "+totalPagar+" por su hospedaje.");
            
        }else if(cantDias > 10){
            
            totalPagar = (cantDias * precioDia) * 0.85;
            System.out.println("Debe cancelar "+totalPagar+" por su hospedaje.");
            
        }else{
            totalPagar =  cantDias * precioDia;
            System.out.println("Debe cancelar "+totalPagar+" por su hospedaje.");
        }


	///////////////// 

	 System.out.println("¿Cuántos años tiene?");
        int edad = scanner.nextInt();
        
        if(edad > 58){
            
            System.out.println("Usted puede ser vacunado");
            
        }else if ( edad >= 18){
            
            System.out.println("¿A cuál grupo de factor de riesgo pertenece usted?");
            int grupoRiesgo = scanner.nextInt();
            
            if(grupoRiesgo == 5){
                System.out.println("Usted puede ser vacunado");
            }else{
                System.out.println("Usted NO puede ser vacunado aún");
            }
        }else{
            System.out.println("Usted NO puede ser vacunado aún");
        }
        
        
    
	/////////////
	for (int i = 10 ; i > 0 ; i --){
            
            System.out.println(i);
        }

	//////////////
	double nota;
        double sumaNotas = 0;
        int cantidadNotas = 0;
        int cursosGanados = 0;
        int cursoPerdidos = 0;

        do {
            System.out.println("Digite la nota, ingrese -1 para salir");
            nota = scanner.nextDouble();

            if (nota != -1) {
                sumaNotas += nota;
                cantidadNotas++;
                if (nota < 70){
                    cursoPerdidos += 1;
                }else{
                    cursosGanados += 1;
                }
            }

        } while (nota != -1);

        if (cantidadNotas != 0) {
            double promedio =  sumaNotas / cantidadNotas;
            System.out.println("El promedio es: "+promedio+"."+" La cantidad de cursos aprobadas son "+cursosGanados+" y la cantidad de cursos reprobados son "+cursoPerdidos);
        } else {
            System.out.println("No ingreso ninguna nota");
        }
         //
        
        
    }
    
}
