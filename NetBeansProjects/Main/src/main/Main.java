
package main;


public class Main {

    
    public static void main(String[] args) {
        Arquero arquero = new Arquero("Legolas",100,50);
        
        Mago mago = new Mago("Gandalf",50,200);
        
        //pedo tratar la superclase como un personaje individual
       // Personaje personaje =(Arquero) new Personaje("");
        
        System.out.println("Nombre arquero "+arquero.getNombre());
        System.out.println("Flechas arquero "+arquero.getFlechas());
        System.out.println("Nombre mago "+mago.getNombre());
        System.out.println("Magia mago "+mago.getMagia());
        
        arquero.atacar();
        mago.atacar();
        
        
    }
    
}
