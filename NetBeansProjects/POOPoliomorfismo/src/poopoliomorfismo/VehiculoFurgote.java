/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopoliomorfismo;


public class VehiculoFurgote extends Vehiculo{
    private int cilindraje;

    public VehiculoFurgote(int cilindraje, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindraje = cilindraje;
    }

    

    public int getCilindraje() {
        return cilindraje;
    }
    @Override
     public String mostrarDatos(){
        return "Matricula "+matricula+"\nmarca "+marca+"\nmodleo "+modelo+ "\ncilindraje "+cilindraje;
    }
}
