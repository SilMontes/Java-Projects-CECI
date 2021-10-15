
package oopa4;

//Sobrecarga de metodos
public class Persona {
    String nombre;
    int edad;
    String dni;
    
    //Sobrecarga de constructor: cuando hay más de un metodo constructor
    // los constructores se pueden sobrecargar siempre y cuando los parametros sean diferentes, ya sea en cantidad y/o tipo. No pueden tener los mismos
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    
    public void correr(){
        System.out.println("Soy "+nombre+" tengo "+edad);
    }
    
    public void correr(int km){
        System.out.println("He corrido "+km);
    }
    
}
