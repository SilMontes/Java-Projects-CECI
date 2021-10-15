
package introobjectorientedprograming;
//Debemos importar la clase para poder usarla
import introobjectorientedprograming.Entidades.Vehiculo;

public class IntroObjectOrientedPrograming {

    
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo(354,"Ford Mustang","negro",10000);
        
        Vehiculo v2 = new Vehiculo(355,"Toyta","negro",15000);
        
        v1.acelerar();
        v1.frenar();
        
        v2.acelerar();
        v2.frenar();
        
         System.out.println(v1.getColor());
         System.out.println(v1.getKilometraje());
         System.out.println(v1.getModelo());
         System.out.println(v1.getPlaca());
        System.out.println("--------------------------");
        v1.setColor("azul");
        System.out.println(v1.getColor());
         v1.setPlaca(1234);
        System.out.println(v1.getPlaca());
         v1.setKilometraje(900);
         System.out.println("--------------------------");
          v1.setKilometraje(15000);
         System.out.println(v1.getKilometraje());
    }
    
}
