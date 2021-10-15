
package practicarelaciones3.Entidades;


public class Motor {
    private int numMotor;
    private int cilindraje;

    public Motor(int numMotor, int cilindraje) {
        this.numMotor = numMotor;
        this.cilindraje = cilindraje;
    }

    public int getNumMotor() {
        return numMotor;
    }

    private void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    private void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
}
