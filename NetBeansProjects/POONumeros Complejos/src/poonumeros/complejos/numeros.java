
package poonumeros.complejos;


public class numeros {
    private double real;
    private double imaginario;
    
    public numeros(){
        
    }
    public numeros(double real, double imaginaria) {
        this.real = real;
        this.imaginario = imaginaria;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginaria) {
        this.imaginario = imaginaria;
    }
    
    public numeros sumar(numeros otroComplejo){
        numeros numero = new numeros();
        double newReal = this.real + otroComplejo.getReal();
        double newImaginario = this.imaginario + otroComplejo.getImaginario();
        numero.setReal(newReal);
        numero.setImaginario(newImaginario);
        return numero;
        
    }
    public numeros restar(numeros otroComplejo){
        numeros numero = new numeros();
        double newReal = this.real - otroComplejo.getReal();
        double newImaginario = this.imaginario - otroComplejo.getImaginario();
        numero.setReal(newReal);
        numero.setImaginario(newImaginario);
        return numero;
        
    }
    public numeros multiplicar(numeros otroComplejo){
        numeros numero = new numeros();
        double newReal = (this.real * otroComplejo.getReal()) - (this.getImaginario()*otroComplejo.getImaginario());
        double newImaginario = (this.real * otroComplejo.getReal())+(this.imaginario * otroComplejo.getImaginario());
        numero.setReal(newReal);
        numero.setImaginario(newImaginario);
        return numero;
        
    }
    public numeros dividir(numeros otroComplejo){
        numeros numero = new numeros();
        double newReal = (this.real * otroComplejo.getReal() + this.imaginario * otroComplejo.getImaginario()) / ((otroComplejo.getReal() * otroComplejo.getReal()) +otroComplejo.getImaginario()* otroComplejo.getImaginario());
        double newImaginario = (this.imaginario * otroComplejo.getReal()-this.real * otroComplejo.getImaginario())/(otroComplejo.getReal()*otroComplejo.getReal()+otroComplejo.getImaginario()*otroComplejo.getImaginario());
        System.out.println("---    "+this.imaginario + " "+otroComplejo.getReal()+" "+this.real + " "+otroComplejo.getImaginario()+" "+otroComplejo.getReal()+" "+otroComplejo.getReal()+" "+otroComplejo.getImaginario()+" "+otroComplejo.getImaginario());
        numero.setReal(newReal);
        numero.setImaginario(newImaginario);
        return numero;
        
    }

    @Override
    public String toString() {
        return String.format("( %.2f, %.2fj) ",real,imaginario); //To change body of generated methods, choose Tools | Templates.
    }
    
}
