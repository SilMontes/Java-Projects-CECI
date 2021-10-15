
package pruebaexcepciones;
//Excepciones verificadas (IOException) y no verificadas (RunTimeException
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PruebaExcepciones {

  
    public static void main(String[] args) throws FileNotFoundException, IOException{
      Scanner entrada = new Scanner(System.in);
      /*
      //Excepciones verificadas (IOException). Java nos obliga a evtar ese tipo de excepciones, ya sea colocando el IOException o usando el try catch
        //Lectura de un archivo de text (.txt)
                                                    // si el archivo no se encuentra, se generará un erro IOException FileNotFOndException
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Adobes\\Desktop\\Java\\texto.txt"));
        String linea;
        while((linea=bf.readLine())!=null){
            System.out.println(linea);
        }
        */
      
      //Excepciones no verificadas (RnTimeException) // Java no nos obliga a evadir este tipo de errores, 
      //pues yo sé que no puedo hacerlo. Por ello debo revisar el codigo y solucionarlo manualmente
      //Divison entre cero
      int num1=5,num2=0,resultado;
      resultado = num1/num2;
        System.out.println(resultado);
    }
    
}
