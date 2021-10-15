
package strings;


public class Strings {

   
    public static void main(String[] args) {
        
        String nombre = "Anna";
       nombre = nombre.toLowerCase();
       nombre = nombre.toUpperCase();
       int longitud = nombre.length();
        System.out.println(nombre);
        System.out.println(longitud);
        int indice = nombre.indexOf('A');
        System.out.println(indice);
       char i = nombre.charAt(2); //Me devuelve la letra en el indice indicado
        System.out.println(i);
        
        String nombreNum = "1";
        int num = Integer.parseInt(nombreNum);
        System.out.println(num + 1);
        
        double numDouble = Double.parseDouble(nombreNum);
         System.out.println(numDouble  + 1);
         
         // para comparar string mejor usar .equals()
         
         String texto = "a";
         String texto2 = "a";
         
         if (texto.equals(texto2)){
             System.out.println("Iguales");
         }else{
             System.out.println("Diferentes");
             
            
         }
         //// Ejemplos con librerías
          double exponente = Math.pow(2,3);
          System.out.println(exponente);
          
    }
    
}
