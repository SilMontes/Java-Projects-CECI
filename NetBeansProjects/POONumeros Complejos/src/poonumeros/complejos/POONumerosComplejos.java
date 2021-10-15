
package poonumeros.complejos;


public class POONumerosComplejos {

    public static void main(String[] args) {
       numeros c1 = new numeros(-4,5);
       numeros c2 = new numeros(8,-2);
       System.out.println(c1);
       System.out.println(c2);
        System.out.println("Suma "+c1.sumar(c2));
        System.out.println("Resta "+c1.restar(c2));
        System.out.println("multiplicar "+c1.multiplicar(c2));
        System.out.println("dividir "+c1.dividir(c2));
    }
    
}
