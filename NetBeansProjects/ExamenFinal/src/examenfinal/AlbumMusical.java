
package examenfinal;

public class AlbumMusical extends Item{
    
    private String artista;
    private double minDuracion;

    public AlbumMusical(String artista, double minDuracion, String titulo, int anio, double precioBase, int impuestoVenta) {
        super(titulo, anio, precioBase, impuestoVenta);
        this.artista = artista;
        this.minDuracion = minDuracion;
    }
    
    @Override
    public double calacularPrecioTotal(){
        double precio;
        if(this.minDuracion > 60){
             precio = this.getPrecioBase()+((this.getPrecioBase()*(this.getImpuestoVenta()+3))/100);
        }else{
            precio = this.getPrecioBase()+((this.getPrecioBase()*this.getImpuestoVenta())/100);
        }
        return precio;
    }
            
    public String getArtista() {
        return artista;
    }

    private void setArtista(String artista) {
        this.artista = artista;
    }

    public double getMinDuracion() {
        return minDuracion;
    }

    private void setMinDuracion(double minDuracion) {
        this.minDuracion = minDuracion;
    }
    
    
}
