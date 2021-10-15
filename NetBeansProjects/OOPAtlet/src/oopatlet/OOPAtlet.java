
package oopatlet;
import java.util.Scanner;
public class OOPAtlet {
    
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       
       String nombre;
       int numAtleta, catAlthetas, indiceGanador;
       double tiempoCarrera;
        System.out.println("Digite la catidad de Atletas");
        catAlthetas = scanner.nextInt();
        Atleta atletas[] = new Atleta[catAlthetas];
        
        for(int i=0; i < atletas.length;i++){
             scanner.nextLine();
             System.out.println("Nombre");
             nombre = scanner.nextLine();
             System.out.println("Numero del atleta");
             numAtleta = scanner.nextInt();
             System.out.println("Tiempo de la carrera");
             tiempoCarrera = scanner.nextDouble();
             
             atletas[i] = new Atleta(nombre,numAtleta,tiempoCarrera);
        }
        indiceGanador = indiceGanador(atletas);
        System.out.println("Atleta ganador "+atletas[indiceGanador].mostrarDatos());
    }
    public static int indiceGanador(Atleta atletas[]){
        double tiempo;
        int indice = 0;
        tiempo = atletas[0].getTiempoCarrera();
        for(int i =1;i < atletas.length;i++){
            if(atletas[i].getTiempoCarrera() < tiempo){
                tiempo = atletas[i].getTiempoCarrera();
                indice = i;
            }
        }
        return indice;
    }
}
