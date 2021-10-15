
package practicarelaciones3.Entidades;

public class Automovil {
    
    private String modelo;
    private Chasis chasis;
    private Motor motor;
    private Llanta [] llantas;

    public Automovil(String modelo, String colorChasis, int  catPuertas, int numMotor,int cilindraje, Llanta[] llantas) {
        this.modelo = modelo;
        this.chasis = new Chasis(colorChasis,catPuertas);
        this.motor = new Motor(numMotor,cilindraje);
        this.llantas = llantas;
    }

    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    private void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }
    
    
    
}
