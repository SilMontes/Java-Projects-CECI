
package movimientoobjeto;

public class Movimientoobjeto {

    
    public static void main(String[] args) {
        objeto o1 = new objeto();
        objeto o2 = new objeto();
        
        o1.subir();
        o1.subir();
        o1.subir();
        o1.subir();
        o1.derecha();
        o1.derecha();
        o1.derecha();
        o1.izquierda();
        o1.bajar();
        System.out.println("x "+ o1.getX());
        System.out.println("y " +o1.getY());
        
        o2.bajar();
        o2.bajar();
        o2.subir();
        o2.izquierda();
        o2.derecha();
        System.out.println("---");
         System.out.println("x "+ o2.getX());
        System.out.println("y " +o2.getY());
        
    }
    
}
