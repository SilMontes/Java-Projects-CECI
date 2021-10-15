
package practicaexamen;
import java.util.Scanner;

public class PracticaExamen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Digite una carácter (L, K, M, J, V, S o D).");
        String letraInicial = scanner.next();
        System.out.println(diaSemana(letraInicial));
       }
    
    
    static String diaSemana(String letraInicial){
       switch(letraInicial.toUpperCase()){
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
  
  
    
}
