
package oopsobreescrituramiembros;


public class Persona extends Animal {
    @Override // estamos sobreescribiendo
    public void comer(){
        System.out.println("Estoy comiento seentado y con cucharra");
    }
}
