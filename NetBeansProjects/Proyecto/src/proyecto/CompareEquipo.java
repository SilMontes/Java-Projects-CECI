
package proyecto;

import java.util.Comparator;

public class CompareEquipo implements Comparator<Equipo>{

    @Override
    public int compare(Equipo eq1,Equipo eq2){       
        return Integer.valueOf(eq2.calcularPuntos()).compareTo(eq1.calcularPuntos());
    }
    
}
