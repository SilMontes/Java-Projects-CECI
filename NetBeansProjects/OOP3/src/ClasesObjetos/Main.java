
package ClasesObjetos;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String [] args){
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        
        Operacion op = new Operacion();
       System.out.println(op.sumar(n1, n2));
       System.out.println(op.restar(n1, n2));
       System.out.println(op.multiplicar(n1, n2));
       System.out.println(op.dividir(n1, n2));
    }
}
