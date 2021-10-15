/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.Entidades;
import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private int numero;
    private ArrayList<Empleado> empleados;
    
    public Departamento(String nombre, int numero){
        this.nombre = nombre;
        this.numero = numero;
        this.empleados = new ArrayList<>();
    }
    //EL departamento va a agregar a los empleados
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
        // le vamos a decir al empleado a qué departamento pertenece
        empleado.setDepartamento(this);// para ello usamos el método setDepartamento que tiene la clase Empleado
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public ArrayList<Empleado> getEmplados(){
        return empleados;
    }
    private void setEmpleados(ArrayList<Empleado> empleados){
        this.empleados = empleados;
    }
}
