
package movimientoobjeto;

public class objeto {
    private int x;
    private int y;
    public objeto(){
        this.x = 0;
        this.y = 0;
    }
    
    public void subir(){
        y += 1;
    }
    public void bajar(){
        y -= 1;
    }
    public void izquierda(){
        x -= 1;
    }
    public void derecha(){
        x += 1;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
