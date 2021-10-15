
package oop4;


public class Persona {
    //atributo
    String nombre;
    int edad;
                        //parametros
    public Persona(String nombre, int edad){
       this.edad = edad;
        this.nombre = nombre;
    }
    public void mostarDatos(){
        System.out.println("El nombre es "+nombre);
        System.out.println("La edad es "+edad);
    }
}
