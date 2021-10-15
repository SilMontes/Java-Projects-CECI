/*
 * Una clase abtracta se usa solo como super clase (clase padre), dbe tener hijos
No se pueden instanciar obtos de una clase abstracta. 
Sirve para proporcionar una super clase apropiada a partir de la cual heredan otras clases (mostrar que tendran sus hijas)

METODO ABSTRACTO SE IMPLEMENTA EN TODOS LOS HIJO, ES MUY GENERICO
 */
package pooclasemetodosabstractos;


public class POOClaseMetodosAbstractos {

    public static void main(String[] args) {
       
        Planta planta = new Planta();
        planta.alimentarse();
        AnimalCarnivoro ac = new AnimalCarnivoro();
        ac.alimentarse();
        
    }
    
}
