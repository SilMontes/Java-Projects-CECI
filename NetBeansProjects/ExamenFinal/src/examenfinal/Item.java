
package examenfinal;


public abstract class Item {
    
    private String titulo;
    private int anio;
    private double precioBase;
    private int impuestoVenta;

    public Item(String titulo, int anio, double precioBase, int impuestoVenta) {
        this.titulo = titulo;
        this.anio = anio;
        this.precioBase = precioBase;
        this.impuestoVenta = impuestoVenta;
    }
    
    public abstract double calacularPrecioTotal();
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getImpuestoVenta() {
        return impuestoVenta;
    }

    public void setImpuestoVenta(int impuestoVenta) {
        this.impuestoVenta = impuestoVenta;
    }
    
    
    
}
