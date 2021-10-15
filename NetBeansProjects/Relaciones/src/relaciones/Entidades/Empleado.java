 
package relaciones.Entidades;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
public class Empleado {
    private String nombre;
    private final LocalDate FECHA_NACIMIENTO;
    private ArrayList<Empleado> colegas;
    private Departamento departamento; // por medio de este atributo ell empleado sabrá a qué departamento pertenece
    
    public Empleado(String nombre,LocalDate FECHA_NACIMIENTO){
        this.nombre = nombre;
        this.FECHA_NACIMIENTO = FECHA_NACIMIENTO;
        this.colegas = new ArrayList<>();
    }
    
    private int calcularEdad(){
        LocalDate hoy = LocalDate.now();
        return Period.between(FECHA_NACIMIENTO, hoy).getYears();
    }
    
    public void agregarColega(Empleado colega){
        colegas.add(colega);
    }
    public String getNombre(){
        return nombre;
    }
    private void setNombre(String nombre){
        this.nombre = nombre;
    }
    public ArrayList<Empleado> geColegas(){
        return colegas;
    }
    private void setColegas(ArrayList<Empleado> colegas){
        this.colegas = colegas;
    }
    // solo obtendremos el nombre del departamento
    public String getDepartamento(){
        return departamento.getNombre();
    }
    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }
    
    public int getEdad(){
        return calcularEdad();
    }
    
    
}
