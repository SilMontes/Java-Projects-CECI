
package tarea5oop.Entidades;
//para guardar edad
import java.time.LocalDate;
import  java.time.Period;
import  java.util.Arrays;

public class Estudiante {
    String nombre;
    ///Guardad fecha de nacimiento para que la edad se actualice automaticamente
    private final LocalDate FECHA_NACIMIENTO;
    double [] notas;
    
    public Estudiante(String nombre, LocalDate FECHA_NACIMIENTO, double [] notas){
        this.nombre = nombre;
        this.FECHA_NACIMIENTO = FECHA_NACIMIENTO;
        this.notas = notas;
    }
    
    // metodo para calcular edad
    private int calcularEdad(){
        LocalDate hoy = LocalDate.now();
        return Period.between(FECHA_NACIMIENTO, hoy).getYears();
    }
    
    public void imprimirNotas(){
        for(int i = 0; i < notas.length; i++){
            System.out.println("Nota de la materia "+(i+1+"°: "+notas[i]));
        }
    }
    public double promedioNotas(){
        double sumatoria = 0;
        
        // podemos usar el forEach. El forEach no maneja indices
        for(double nota:notas){  // por cada nota en el arreglo double notas
            sumatoria+=nota; // haga esto
        }
        return sumatoria / notas.length;
        
       // for(int i = 0; i < notas.length; i++){
         //   sumatoria += notas[i];
        //}
    }
    public double mayorNota(){
        double mayorNota = notas[0];
        for(double nota:notas){
            if(nota > mayorNota){
                mayorNota = nota;
            }
        }
         return mayorNota;
    }
    
    public String getNombre(){
        return nombre;
    }
    private void setNombre(String nombre){
        this.nombre = nombre;
    }
   public LocalDate getFechaNacimiento(){
       return FECHA_NACIMIENTO; 
   }
   public int getEdad(){
       return calcularEdad();
   }
    public double [] getNotas(){
        return notas; 
    }
    
    public void setNotas(double [] notas){
        this.notas = notas;
    }
}
