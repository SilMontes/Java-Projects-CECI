
package practicarelaciones3;
import practicarelaciones3.Entidades.Automovil;
import practicarelaciones3.Entidades.Llanta;
import practicarelaciones3.Entidades.Chasis;
import practicarelaciones3.Entidades.Motor;


public class PracticaRelaciones3 {

    
    public static void main(String[] args) {
       Llanta llanta1=new Llanta("Mill",2); 
       Llanta llanta2=new Llanta("Mill",2); 
       Llanta llanta3=new Llanta("Mill",2); 
       Llanta llanta4=new Llanta("Mill",2); 
       
       Llanta [] llantas = {llanta1,llanta2,llanta3,llanta4};
       
       Automovil a1 = new Automovil("a345","Rojo",4,6,12,llantas);
       System.out.println(a1.getChasis().getColor());
       System.out.println(a1.getLlantas());
        System.out.println(a1.getModelo());
        System.out.println(a1.getMotor().getCilindraje());
    }
    
}
