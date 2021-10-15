
package ClasesObjetos;
import javax.swing.JOptionPane;
public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos
    
    // Metodo para pedirle al usuario que nos digite 2 numeros
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el número 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el número 2"));
    }
    public void sumar(){
        suma = numero1 +numero2;
    }
    public void restar(){
        resta = numero1 - numero2;
    }
    public void multiplicar(){
        multiplicacion = numero1 * numero2;
    }
    public void dividir(){
        division = numero1 / numero2;
    }
    
    public void mostrarResultado(){
        System.out.println("La resta es: "+resta);
        System.out.println("La suma es: "+suma);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
