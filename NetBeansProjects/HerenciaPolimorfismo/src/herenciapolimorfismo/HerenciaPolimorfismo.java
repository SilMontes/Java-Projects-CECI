
package herenciapolimorfismo;

import java.util.ArrayList;


public class HerenciaPolimorfismo {

   
    public static void main(String[] args) {
       
        Arquero arquero = new Arquero(50,"Legolas",100);
        Mago mago = new Mago(200,"Gandalf",50);
        Personaje arquero2 = (Arquero) new Arquero(100,"Faramir",150);
        Guerrero guerrero = new Guerrero(200,"Nada",100);
        Arquero arquero3 = (Arquero) arquero2;//hacemos esto para poder ver sus flechas
        /*
        System.out.println("Nombre "+arquero.getNombre());
        System.out.println("Flechas "+arquero.getFlechas());
        
        System.out.println("Nombre "+mago.getNombre());
        System.out.println("Flechas "+mago.getMagia());
        
        System.out.println("Nombre "+arquero2.getNombre());
       // System.out.println("Flechas "+arquero2.getFlechas());
        */
        
        System.out.println("Flechas "+arquero3.getFlechas());
        
        ArrayList<Personaje> batallon = new ArrayList<>();
        batallon.add(arquero);
        batallon.add(arquero2);
        batallon.add(mago);
        batallon.add(guerrero);
        
        for(Personaje persona:batallon){
            persona.atacar();
        }
        
        
        /*
        arquero.atacar();
        mago.atacar();
        arquero2.atacar();
        */
    }
    
}
