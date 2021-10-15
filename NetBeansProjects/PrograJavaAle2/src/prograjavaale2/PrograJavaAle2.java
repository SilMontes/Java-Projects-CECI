
package prograjavaale2;
import java.util.Scanner;

public class PrograJavaAle2 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int [] numeros3 = new int[6];
       for (int i=0;i<numeros3.length;i++){
           System.out.println("Digite el numero que desea almacenar");
            numeros3[i] = scanner.nextInt();
       }
     
       for(int x =numeros3.length-1, y=0; x>=y;x--,y++){
        if(x==y)System.out.println(numeros3[x]);
        else System.out.println(numeros3[y]+"\n"+numeros3[x]);
    }
       
        /*
      
        -------------------------------------
         int [] numeros = new int[5];
        for(int i = 0; i<5;i++){
            System.out.println("Digite el numero que desea almacenar");
            numeros[i] = scanner.nextInt();
        }
        for (int i:numeros){
             System.out.println(i);
        }
        System.out.println("---------------");
        for(int i = numeros.length-1; i>=0;i--){
            System.out.println(numeros[i]);
        }
        ----------------------------------
        
         int codigo,sumaMayor600=0;
        float codigo1 = 0.6f, codigo2 = 3f, codigo3 =1.25f;
        float litrosCodigo1 = 0, precioLitro, cantLitro, facturacionTotal = 0,suma;
        for (int i = 0; i<5;i++){
        System.out.println("Ingrese el código del artículo");
        codigo = scanner.nextInt();
        System.out.println("Ingrese la cantidad de litros vendidas");
        cantLitro = scanner.nextFloat();
        
         
        if(codigo == 1){
            litrosCodigo1 += cantLitro;
            suma = (float) cantLitro * codigo1;
            facturacionTotal += suma;
            if ( suma> 600){
            sumaMayor600++;
             }
        }else if(codigo == 2){
            suma = (float) cantLitro * codigo2;
             facturacionTotal += suma;
            if ( suma> 600){
            sumaMayor600++;
             }
        }else if(codigo == 3){
            suma = (float) cantLitro * codigo3;
             facturacionTotal += suma;
            if ( suma> 600){
            sumaMayor600++;
             }
        }else{
            System.out.println("Codigo invalido");
        }
        
       
        
        
    }
        System.out.println("Total: "+facturacionTotal);
        System.out.println("Litros vendidos del codigo 1: "+litrosCodigo1);
        System.out.println("Mayores a 600: "+sumaMayor600);
-------------------------------------
        
        System.out.println("¿Qué tabla de multiplicar desea ver?");
        int numero = scanner.nextInt();
        
        for (int i = 0;i<=10;i++){
            int mult = numero * i;
            System.out.println(numero+" x "+i+" = "+mult);
        }
        
-------------------------------------
        int edad, sumatoriaEdad =0,  conteoMayor18=0, conteoAlt175=0;
        float altura,sumatoriaAltura=0;
        
        for (int i=0; i<5;i++){
            System.out.println("Ingrese su edad");
            edad = scanner.nextInt();
            System.out.println("Ingrese su altura");
            altura = scanner.nextFloat();
            sumatoriaEdad += edad;
            sumatoriaAltura += altura;
            if (edad > 18){
                conteoMayor18++;
            }
            if(altura > 1.75){
                conteoAlt175++;
            }
            
        }
        System.out.println("El promedio de edades es: "+sumatoriaEdad/5);
        System.out.println("El promedio de alturas es: "+sumatoriaAltura/5);
        System.out.println("La cantidad de edades mayores a 18 son: "+conteoMayor18);
        System.out.println("La cantidad de alturas mayores a 1.75 son: "+conteoAlt175);
    
    */
        }
}
