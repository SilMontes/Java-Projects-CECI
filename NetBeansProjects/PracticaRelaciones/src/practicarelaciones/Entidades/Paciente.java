
package practicarelaciones.Entidades;
import java.time.LocalDate;
import  java.time.Period;
import java.util.ArrayList;
public class Paciente {
    private String nombre;
    private final LocalDate FECHA_NACIMIENTO;
    private double peso;
    private double altura;
    private ArrayList<Medico> medicos; 
     
   public Paciente(String nombre, LocalDate FECHA_NACIMIENTO, double peso, double altura){
       this.nombre= nombre;
       this.FECHA_NACIMIENTO = FECHA_NACIMIENTO;
        this.peso= peso;
        this.altura= altura;
        this.medicos = new ArrayList<>();
   }
   
   public void agregarMedico(Medico medico){
       if(!medicos.contains(medico)){
            medicos.add(medico);
       }else{
            System.out.println("Este médico ya se ha agregado");
         }
    }
   
   
   private int calcularEdad(){
        LocalDate hoy = LocalDate.now();
        return Period.between(FECHA_NACIMIENTO, hoy).getYears();
    }
   
   public String getNombre(){
       return nombre;
   }
   public int getEdad(){
       return calcularEdad();
   }
   public LocalDate getFechaNacimiento(){
       return FECHA_NACIMIENTO;
   }
   public double getPeso(){
       return peso;
   }
   public void setPeso(double peso){
       this.peso = peso;
   }
   public double getAltura(){
       return altura;
   }
    public void setAltura(double altura){
       this.peso = altura;
   }
   public ArrayList<Medico> getMedicos(){
        return medicos;
    }
   
   private void setMedicos(ArrayList<Medico> medicos){
        this.medicos = medicos;
    }
   
}
