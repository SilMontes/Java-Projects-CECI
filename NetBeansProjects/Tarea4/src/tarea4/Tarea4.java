
package tarea4;
import java.util.Scanner;
import java.util.Arrays;

public class Tarea4 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println(numeroMayor(18,9));
	
	System.out.println(calcularElCubo(9));
	
	System.out.println("La medida de la hipotenudsa es: "+calcularHipotenusa(4,3.5));

	 System.out.println("El mínimo es: "+obtenrElementoMinimo(-1,5,-2));
         
         ////////////
         
     
        System.out.println("Digite el monto de su salario");
        double salario = scanner.nextDouble();

        System.out.println("¿Cuántas mesas fabricó?");
        int cantMesas = scanner.nextInt();

        System.out.println("Usted reibirá un incentivo de: "+montoIncentivo(cantMesas,salario)+" colones");
        ////////////////
        
        System.out.println("Digite una carácter (L, K, M, J, V, S o D).");
        String letraInicial = scanner.next();
        System.out.println(diaSemana(letraInicial));

        /////
        imprimirRangoNumeros(21,9);
        
         int [] edades1 = {20, 29, 40};
        int [] edades2 = {20, 29, 41};
        
        System.out.println(compararArreglos(edades1,edades2));
        
        int [] notas = {90, 54, 89, 40, 91};
       System.out.println("La cantidad de cursos aprobados es: "+cantidadCursosAprobados(notas));
       
       int [][] matriz ={
           {23, 45, 70},
           {40, 66, 90},
           {40, 66, 90}
        };
       System.out.println(calcularPromedio(1,matriz));
        
    }
    
    
	 static int numeroMayor(int num1, int num2){
        if(num1 > num2){
           return num1;
        }else{
            return num2;
        }
    }
	
//////////////////
	
	static double calcularElCubo(int pNumero){
        
        double resultado = Math.pow(pNumero, 3);
        return resultado;
    }

///////////

	 static double calcularHipotenusa( double cateto1, double cateto2){
        
        double hipotenusa = Math.hypot(cateto1, cateto2);
        return hipotenusa;
    }

/////////

	static int obtenrElementoMinimo (int num1, int num2, int num3){
        int [] arreglo = {num1,num2,num3};
        int menorValor = arreglo[0];
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] < menorValor){
                menorValor = arreglo[i];
            }
        }
        return menorValor;
    }

/////
      static double  montoIncentivo(int cantMesas, double salario){
        double incentivo = 0;
        if (cantMesas >= 11 && cantMesas <= 25){
            incentivo = salario * 0.05;
        }else if(cantMesas > 25){
            incentivo = salario * 0.10;
        }
        
        return incentivo;
    }

////////////////
       static String diaSemana(String letraInicial){
       switch(letraInicial){
           case "L":
               return "Lunes";
           case "K":
              return "Martes";
           case "M":
               return "Miércoles";
           case "J":
               return "Jueves";
           case "V":
               return "Viernes";
           case "S":
               return "Sábado";
           case "D":
               return "Domingo";
           default:
              return "¡Opción inválida!";
           
       }
   }

 ////////////
       
       static void imprimirRangoNumeros(int num1, int num2){
        if (num1 < num2){
            for (int i = num1; i <= num2; i++){
                System.out.println(i);
            }
        }else{
            for (int i = num2; i <= num1; i++){
                System.out.println(i);
            }
        }
    }
       
 ///////////
       
       static boolean compararArreglos(int [] arreglo1, int [] arreglo2){
       if (Arrays.equals(arreglo1, arreglo2)){
           return true;
       }else{
           return false;
       }
   } 

//////////
    static int cantidadCursosAprobados(int [] arregloNotas){
      int cursosAprobados = 0;
      for (int i = 0; i < arregloNotas.length; i++){
          if(arregloNotas[i] >= 70){
              cursosAprobados += 1;
          }
      }
      return cursosAprobados;
  }
 
////////
    
     static double calcularPromedio(int columna, int [][] matriz){
        double suma = 0;
        
        for (int i = 0; i < matriz.length; i++){
            suma += matriz[i][columna];
        }
        
        double promedio = suma / matriz.length;
        return promedio;
    }
       
      
}
