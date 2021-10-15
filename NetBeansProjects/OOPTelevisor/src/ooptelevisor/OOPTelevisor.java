
package ooptelevisor;
import ooptelevisor.Entidades.Televisor;

public class OOPTelevisor {

   
    public static void main(String[] args) {
        Televisor tv1 = new Televisor("a345",10);
        
        tv1.subirCanal();
        tv1.bajarCanal();
        tv1.bajarCanal();
        tv1.subirCanal();
        tv1.subirCanal();
        
        //Accedemos a un atributo usando el método de accceso
         tv1.setCanalActual(20);
        System.out.println(tv1.getCanalActual());
        
        tv1.setCantCanales(17);
        System.out.println(tv1.getCantCanales());
         tv1.setCanalActual(20);
        System.out.println(tv1.getCantCanales());
         tv1.setCanalActual(16);
         System.out.println(tv1.getCanalActual());

        
    }
    
}
