
package examenfinal;


public class ExamenFinal {

    
    public static void main(String[] args) {
        //String artista, double minDuracion, String titulo, int anio, double precioBase, int impuestoVenta
       AlbumMusical a1 = new AlbumMusical("Elvis",60,"Nada",2000,1000,10);
       AlbumMusical a2 = new AlbumMusical("Ronny",65,"dos",2000,1000,7);
       
       //String rating, String genero, String titulo, int anio, double precioBase, int impuestoVenta
       Pelicula p1 = new Pelicula("G","drama","KK",2001,2000,5);
       Pelicula p2 = new Pelicula("R","drama","KK",2001,2000,5);
       
        System.out.println(a1.calacularPrecioTotal());
        System.out.println("");
       
        System.out.println(a2.calacularPrecioTotal());
        System.out.println("");
      
        System.out.println(""+ p1.calacularPrecioTotal());
        System.out.println("");
      
        System.out.println(""+ p2.calacularPrecioTotal());
        System.out.println("");
        System.out.println("");
       
       
       CarroCompras c1 = new CarroCompras();
       CarroCompras c2 = new CarroCompras();
       c1.agregarItem(a1);
       c1.agregarItem(a2);
       c1.agregarItem(p2);
        System.out.println("C1 total");
        
       
        System.out.println(""+c1.calcularTotal());
        System.out.println("");
        System.out.println("-----------------");
       c2.agregarItem(a1);
       c2.agregarItem(a2);
       c2.agregarItem(p2);
       c2.agregarItem(p1);
      
       System.out.println("C2 total"+ c2.calcularTotal());
    }
    
}
