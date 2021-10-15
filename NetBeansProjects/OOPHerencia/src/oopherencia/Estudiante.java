
package oopherencia;


public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;
    
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante,float notaFinal ){
        // no vuelvo a inicializar los atributos herredados, para ello solo uso el super
        super(nombre,apellido,edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    public void mostarDatos(){
        // para acceder a los atributos debo usar los metodos prque los hemos puesto privados, y los privados solo pueden ser accedidos por la misma clase, pero Estudiante es de otra clase.
        //Si no queremos usar los metodos, podemos usar protected, pues así puede ser accedido por los miembros de la clase y por los miembros
        // de las clases hijas
        System.out.println("Nombre "+ this.getNombre()+"\n Apellido "+this.getApellido()+"\nEdad "+this.getEdad()+"\n codigo "+codigoEstudiante+ "\n nota final "+notaFinal);
    }
}
