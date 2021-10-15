/*
Modificadores de acceso.
 */
package Paquete1;


public class Clase1 {
    private int edad;
    private final String nombre;

    public Clase1(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public void mostrarDatos(){
        System.out.println("Edad "+edad);
        System.out.println("Nombre "+nombre);
    }
    public String getNombre() {
        return nombre;
    }

    
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
       return edad;
    }
}
