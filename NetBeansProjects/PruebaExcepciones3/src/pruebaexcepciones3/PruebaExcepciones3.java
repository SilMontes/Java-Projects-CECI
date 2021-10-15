/*
 *Try catch
 */
package pruebaexcepciones3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PruebaExcepciones3 {
                            // throws indica que pueden haber algunas excepciones
    public void leerArchivo() throws FileNotFoundException, IOException{
        File archivo = new File("C:\\Users\\Adobes\\Desktop\\Java\\texto.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;
        
        while((linea = bf.readLine()) != null){
            System.out.println(linea);
        }
    }
    
    public void leerArchivo2(){
        
        try { // dentor de try va todo aquello que puede tener una excepcion
            leerArchivo();
                    //FileNotFoundException es una clase, para trnsformarlo a objeto le ponemos ex, ex es el nombre
                    // dentro del parentisis van las excepciones que pueden ocurrir
        } catch (FileNotFoundException ex) { // si sucede una excepcioon la va a capturar y va a intentar las instrucciones
           JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo deseado, por favor, verifique la ruta");
        } catch (IOException e){ // vamos a capturar el oto tipo de excepcion
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada");
        } finally{ // esto es opcional, se va aejecutar siempre, ya sea que el try sea exitoso o no
            
        }
        
        System.out.println("Programa terminado");
    }
    public static void main(String[] args) {
        // como los metodos no son estaticos debemos crear una excepcion
        PruebaExcepciones3 prueba = new PruebaExcepciones3();
        
        prueba.leerArchivo2();
    }
    
}
