
package introobjectorientedprograming.Entidades;


public class Vehiculo {
    // Atributos 
    private int placa;
    private String modelo;
    private String color;
    private int kilometraje;
    
    //Constructor
                            // Parámetros
    public Vehiculo(int placa, String modelo, String color, int kilometraje){
        
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
        
    }
    
    //Métodos
    public void acelerar(){
        System.out.println("El vehículo "+this.modelo+" comienza a acelerar");
    }
    public void frenar(){
        System.out.println("El vehículo "+this.modelo+" comienza a frenar");
    }
    
    //---------------  MÉTODOS DE ACCESO -----------------
    //  GETTERS
    
    public int getPlaca(){
        return placa;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public int getKilometraje(){
        return kilometraje;
    }
    
    // SETTERS
    
     public void setPlaca(int placa){
       
         this.placa = placa;
     }
     
     public void setColor(String color){
       
         this.color = color;
     }
     
     public void setKilometraje(int kilometraje){
         if(kilometraje > getKilometraje()){
             this.kilometraje = kilometraje;
         }else{
             System.out.println("Inválido");
         }
         
     }
}
