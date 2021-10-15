
package tareadia2;
import java.util.Scanner;
public class TareaDia2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Indique el monto en colones");
        
        int montoColones = scanner.nextInt();
        
        int cantMonedas50 = montoColones / 50;
        int residuo = montoColones % 50;
        
        int cantMonedas20;
        int cantMonedas10;
        int cantMonedas5;
        
        if (residuo == 0){
            System.out.println("Para completar " + montoColones+" colones se necesita la siguente cantidad de monedas de 50: "+cantMonedas50);
        }
        else{
            int nuevoMonto = montoColones - (cantMonedas50 * 50);
            cantMonedas20 = nuevoMonto / 20;
            residuo = nuevoMonto % 20;
            if (residuo == 0){
                System.out.println("Para completar " + montoColones+" colones se necesita la siguente cantidad de monedas: "+cantMonedas50+ " de 50 colones y "+cantMonedas20+" de 20 colones");
            }
            else{
                nuevoMonto = nuevoMonto - (cantMonedas20 * 20);
                cantMonedas10 = nuevoMonto / 10;
                
                residuo = nuevoMonto % 10;
                 System.out.println(montoColones+" "+nuevoMonto+"residuo "+residuo);
                if (residuo == 0){
                    System.out.println("Para completar " + montoColones+" colones se necesita la siguente cantidad de monedas: "+cantMonedas50+ " de 50 colones, "+cantMonedas20+" de 20 colones y "+cantMonedas10+" de 10 colones.");
                }
                else{
                    nuevoMonto = nuevoMonto - (cantMonedas10 * 10);
                    cantMonedas5 = nuevoMonto / 5;
                    System.out.println("Para completar " + montoColones+" colones se necesita la siguente cantidad de monedas: "+cantMonedas50+ " de 50 colones, "+cantMonedas20+" de 20 colones, "+cantMonedas10+" de 10 colones y "+cantMonedas5+" de 5 colones.");
                }
            }
        }
        
        
        
        
        
    }
    
}
