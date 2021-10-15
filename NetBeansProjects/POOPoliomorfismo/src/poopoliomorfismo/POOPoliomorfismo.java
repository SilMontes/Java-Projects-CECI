/*
 * Polimorfismo es una relacion de ipo herenci, un objeto de la superclase puede almacenar un objeto de cualquiera de sus subclases
 La clase padre es compatible con los tipos que derivan de ella, pero no al reves
 */
package poopoliomorfismo;

/**
 *
 * @author Adobes
 */
public class POOPoliomorfismo {


    public static void main(String[] args) {
       Vehiculo misVhiculos[] = new Vehiculo[4];
       misVhiculos[0] = new Vehiculo("gfs","ferrari","tt");
       misVhiculos[1] = new VehiculoTurismo(3,"uy","ferrari","tt");
       misVhiculos[2] = new VehiculoDeportivo(500,"g457","toyota","tt");
       misVhiculos[3] = new VehiculoFurgote(200,"ge8","toyota","j9");
       
       for(Vehiculo vehiculos:misVhiculos){
           System.out.println(vehiculos.mostrarDatos());
           System.out.println("");
       }
    }
    
}
