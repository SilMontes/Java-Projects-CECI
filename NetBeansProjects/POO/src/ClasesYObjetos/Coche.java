
package ClasesYObjetos; // un paquetees un conjunto de clases. En un proyecto puedo tener muchos paqutes y en
// un paquete puedo tener muchas clasess


public class Coche {
    // Cada clase debe tener atributos
    String color;
    String marca;
    int km;
    
    // metodos: acciones o comportamientos de las clases y sus objetos
    public static void main(String [] args){
        // Crear objeto de clase coche
        
        Coche coche1 = new Coche();
        coche1.color ="blanco";
        coche1.marca = "audi";
        coche1.km = 0;
        
        System.out.println(coche1.color);
        System.out.println(coche1.marca);
        System.out.println(coche1.km);
        
         Coche coche2 = new Coche();
        coche2.color ="Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;
        
         System.out.println("------------");
         System.out.println(coche2.color);
        System.out.println(coche2.marca);
        System.out.println(coche2.km);
    }
}
