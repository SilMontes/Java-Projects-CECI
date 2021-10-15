
package dia2.practica;

import java.util.Scanner;
public class Dia2Practica {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("url");
         String url = scanner.nextLine();
         
        if(!url.startsWith("http://www.") || !url.startsWith("https://www."))
            url = "http://www."+url;
         System.out.println(url);
        /*
        int num1, num2 ,num3;
        int suma, mult;
        
        System.out.println("Primer número");
        num1 = scanner.nextInt();
        
        System.out.println("Segundo número");
        num2 = scanner.nextInt();
        
        System.out.println("Tercero número");
        num3 = scanner.nextInt();
        
        suma = num1 + num2 + num3;
        mult = num1 * num2 * num3;
        
        System.out.println("El resultado de la suma es "+ suma);
        System.out.println("El resultado de la multiplicación es "+ mult);
*/
    }
    
}
