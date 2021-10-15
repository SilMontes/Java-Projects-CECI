/*
 * Declaracion de las excepciones de un método
    Debemos declarar la excepcion o capturarla
 */
package pruebaexcepciones2;

                            
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class PruebaExcepciones2{
    
    // declaramos que este metodo nos va a producir un excepcion verificada
    public static void leerArchivo() throws FileNotFoundException,IOException{ // aqui no evitaremos el error, si no que usaremos otro metodo para atrpar el error
            File archivo = new File("C:\\Users\\Adobes\\Desktop\\Java\\texto.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader bf = new BufferedReader(fr);
            String linea;

            while((linea = bf.readLine()) != null){
                System.out.println(linea);
            }
        }
    
    public static void leerArchivo2() throws IOException{ // en este método capturamos el error
        leerArchivo();
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        leerArchivo();
        
    }
    
}
