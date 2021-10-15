
package relaciones.Entidades;
import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Departamento> departamentos;
    
    public Empresa(String nombre){
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }
    
    //Como el departamento no es independiente, la empresa va a asignar el empleado al departamento
    public void contratarEmpleado(Empleado empleado, int indice){ // indice del departamenro para no hacer una busqueda de este.
        departamentos.get(indice).agregarEmpleado(empleado); // hacemos esto por medio de la empresa por su característica de composición
    }
    
    
    //En una composición el todo cre a la parte, entonces, la empresa (el todo) va a crear a los departamentos (la parte)
    public void crearDepartamento(String noombre, int numero){
        Departamento departamento = new Departamento(noombre,numero);
        departamentos.add(departamento);
        
        // puedo unir las dos lineas anteriores en una
        //  departamentos.add(new Departamento(noombre,numero));
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    private  ArrayList<Departamento> getDepartamentos(){
        return departamentos;
    }
    
    private void setDepartamentos(ArrayList<Departamento> departamento){
        this.departamentos = departamentos;
    }
    
}
