/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopoliomorfismo;


public class VehiculoDeportivo extends Vehiculo{
    private int carga;

    public VehiculoDeportivo(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    @Override
     public String mostrarDatos(){
        return "Matricula "+matricula+"\nmarca "+marca+"\nmodleo "+modelo+ "\ncarga "+carga;
    }
}
