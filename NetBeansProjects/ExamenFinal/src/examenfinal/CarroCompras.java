
package examenfinal;

import java.util.ArrayList;


public class CarroCompras {
    private ArrayList<Item> items;

    public CarroCompras() {
       items = new ArrayList<>();
    }
    public void agregarItem(Item item){
        if(!items.contains(item)){
            items.add(item);
        }else{
            System.out.println("Este artículo ya ha sido añadido a sus carrito de compras");
        }
    }
    public double calcularTotal(){
        double total=0;
        for(Item elemento:items){
            total += elemento.calacularPrecioTotal();
        }
        return total;
    }
    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    
}
