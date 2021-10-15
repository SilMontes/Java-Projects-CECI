
package practicarelaciones.Entidades;
import java.util.ArrayList;

public class Medico {
    private String nombre;
    private String especialidad;
    private ArrayList<Paciente> pacientes;
    public Medico(String nombre, String especialidad){
        this.nombre = nombre;
        this.especialidad = especialidad;
        pacientes = new ArrayList<>();
    }
    
     public void agregarPaciente(Paciente paciente){
         if(!pacientes.contains(paciente)){
             pacientes.add(paciente);
         }else{
             System.out.println("Ya se ha agregado este paciente");
         }
        
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public ArrayList<Paciente> gePacientes(){
        return pacientes;
    }
    private void setPacientes(ArrayList<Paciente> pacientes){
        this.pacientes = pacientes;
    }
    private void setNombre(String nombre){
        this.nombre= nombre;
    }
     
    private void setEspecialidad(String especialidad){
        this.especialidad= especialidad;
    }
    
}
