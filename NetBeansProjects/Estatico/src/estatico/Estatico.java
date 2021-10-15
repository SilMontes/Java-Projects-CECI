
package estatico;


public class Estatico {
    //no estatico
    private String frase = "Primera clase";
    // estatico
    private static String nombre = "Hola";
    
    //metodo estatico. Estos ya no le epertenecen a lños objetos, sino a la clase
    public static int sumar(int num1, int num2){
        int suma = num1+num2;
        return suma;
    }
    
    public static void main(String[] args) {
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();
        ob2.frase="Segunda frase";  // EN los atributos no estaricos, si un objeto cambia el atributo, el de los demas no se ve afectado, porque solo se ha creado un copia para cada objeto
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
        System.out.println(ob1.frase);
        ob2.nombre = "naada"; // como el atributo nombre es static, si un objeto lo modifiica, el valor del atrbuto se modificará para todos
        System.out.println(ob1.nombre);
        System.out.println(ob2.nombre);
        System.out.println(ob1.nombre);
        System.out.println("------------------------------------");
        System.out.println("suma "+Estatico.sumar(2, 2));
    }
    
}
