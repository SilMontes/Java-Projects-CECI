
package ooptelevisor.Entidades;

//La clase generalmente es pública
public class Televisor {
    
    //Todos los atributos siempre van a ser private; para poder accederlos, tendré que crear un método de acceso
    private String numSerie;
    private int canalActual;
    private int cantCanales;
    private final int PRIMER_CANAL = 1; // ESTE ATRIBUTO NO SE CAMBOIARÁ, ENTONCES NO ES NECESARIO MENCIONARLO EN EL CONSTRUCOT, EL OBJETO YA LO TENDRÁ
    
    //El constructor casi siempre es public, esta relacionado a la clase. En este caso la clase esta pública
    public Televisor(String numSerie, int cantCanales){
        
        this.numSerie = numSerie;
        this.cantCanales = cantCanales;
        this.canalActual = PRIMER_CANAL; //No recibimos canal actual como parametro porque, por llo genral caundo se enciende, el canal predeterminado de inicio es el primer canal disponible
    }
    
    //subirCanal y bajar canal los dejaremos public porque son el medio para interactuar con el objeto. Con estos metodos cambio el estado de manera controlada
    public void subirCanal(){
        if(canalActual == cantCanales ){
            canalActual = PRIMER_CANAL;
        }else{
            canalActual++; 
        }
    }
    
    public void bajarCanal(){
        if(canalActual == PRIMER_CANAL ){
            canalActual = cantCanales;
        }else{
            canalActual--; 
        }
    }
    
    //get para acceder a los atributos restringidos
    public String getNumSerie(){
        return numSerie;
    }
    public int getCanalActual(){
        return canalActual;
    }
    public int getCantCanales(){
        return cantCanales;
    }
    public int getPRIMER_CANAL(){
        return PRIMER_CANAL;
    }
    
   //setters. Debo tener cuidado para que las acciones o cambios que se realice no invaliden el estado. Es importante hacer validaciones
    
    public void setCanalActual(int canalActual){
        // para poder cambiar el canal actuala debe ser mayor al primer canal y menor a la cantidad de canales
        if(canalActual <= cantCanales && canalActual > getPRIMER_CANAL()){
            this.canalActual = canalActual;
        }else{
            //No es recomendado tener inpresiones desde un objeto.
            System.out.println("Canal invalido");
        }
        
    }
    
    public void setCantCanales(int cantCanales){
        if(cantCanales > PRIMER_CANAL ){
            this.cantCanales = cantCanales;
        }else{
             System.out.println("Cantidad de canales invalido");
        }
    }
    
}
