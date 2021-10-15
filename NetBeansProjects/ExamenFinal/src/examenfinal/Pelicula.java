
package examenfinal;


public class Pelicula extends Item{
    private String rating;
    private String genero;

    public Pelicula(String rating, String genero, String titulo, int anio, double precioBase, int impuestoVenta) {
        super(titulo, anio, precioBase, impuestoVenta);
        this.rating = rating;
        this.genero = genero;
    }
    
     public double calacularPrecioTotal(){
        double precio;
        if(this.rating == "R"){
             precio = this.getPrecioBase()+((this.getPrecioBase()*(this.getImpuestoVenta()+5))/100);
        }else{
            precio = this.getPrecioBase()+((this.getPrecioBase()*this.getImpuestoVenta())/100);
        }
        return precio;
    }
    
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
    
}
