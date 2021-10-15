
package practicalibrerias;

import java.util.Calendar;

public class PracticaLibrerias {

    
    public static void main(String[] args) {
       
        double cateto1 = 4;
        double cateto2 = 3;
        double hipotenusa = 0;
        
        hipotenusa = Math.hypot(cateto1, cateto2);
        System.out.println(hipotenusa);
       
        Calendar formatoFecha = Calendar.getInstance();
        Calendar formatoFecha2 = Calendar.getInstance();
        formatoFecha2.add(Calendar.DATE,7); // Al día le aumentará 7 
        
        int anyo = formatoFecha.get(Calendar.YEAR);
        int mes = formatoFecha.get(Calendar.MONTH);
        int dia = formatoFecha.get(Calendar.DATE);
        
        System.out.println("Fecha actual es: "+dia+"/"+mes+"/"+anyo);
        
        int anyo2 = formatoFecha2.get(Calendar.YEAR);
        int mes2 = formatoFecha2.get(Calendar.MONTH);
        int dia2 = formatoFecha2.get(Calendar.DATE);
        
        System.out.println("Fecha dentro de 7 dìas serà: "+dia2+"/"+mes2+"/"+anyo2);
        
        
       
       
        
    }
    
}
