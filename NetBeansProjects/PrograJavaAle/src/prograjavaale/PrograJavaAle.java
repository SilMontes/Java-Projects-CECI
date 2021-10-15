

package prograjavaale;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class PrograJavaAle {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
       
        
        
        
          /*
        --------------------------------------------
        
        int totalN=0;
        int elementosN=0;
        int totalP=0;
        int elementosP=0;
        int numero;
        float mediaN;
        float mediaP;
        int conteo0=0;
        for(int i=1; i <=10;i++){
         System.out.println("Digite número");
         numero = scanner.nextInt();
         if(numero <0){
             totalN += numero;
             elementosN++;
         }else if(numero > 0){
              totalP+= numero;
             elementosP++;
         }else{
             conteo0++;
         }
        }
        if(totalN == 0){
            System.out.println("No se puede sacar la medi de los negativos");
        }else{
            mediaN= (float)totalN / elementosN;
             System.out.println("La media de los negativos es :"+mediaN);
        }
        
        if(totalP == 0){
            System.out.println("No se puede sacar la medi de los positivos");
        }else{
             mediaP = (float)totalP / elementosP;
             System.out.println("La media de los positivos es :"+mediaP);
        }
        
        System.out.println("La cantidad de ceros es: "+conteo0);
        ----------------------------------------------
        
        System.out.println("Digite número");
        int numero = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numero; i++){
            factorial *= i;
        }
         System.out.println(factorial);
        
        
        long producto=1;
       for(int i=3; i<=20;i+=2 ){
          producto *= i;
       }
       System.out.println("El producto es : "+producto);
        
        
        
         int numero;
        int total = 0;
        for(int i = 0; i <10; i++){
            System.out.println("Digite número");
            numero = scanner.nextInt();
            total += numero;
        }
        System.out.println("Total: "+total);
        
        
        
         for (int i = 100; i >0; i-=7){
             System.out.println(i);
         }
        
        int numero, total = 0,cantNum=0;
        System.out.println("Digite un número");
         numero = scanner.nextInt();
         float media;
        while(numero >=0){
           
            total += numero;
            cantNum++;
             System.out.println("Digite un número");
            numero = scanner.nextInt();
        }
       
        if(cantNum == 0){
             System.out.println("El promedio es :"+numero);
        }else{
             media = total / cantNum;
            System.out.println("El promedio de todos los números ingresados es :"+media);
        }
        
        
         
        Scanner scanner = new Scanner(System.in);
        int numero, total = 0;
        do{
            System.out.println("Digite un número");
            numero = scanner.nextInt();
            total += numero;
        }while(numero != 0);
        System.out.println("La sumas de todos los números ingresados es :"+total);
        
      
       int numero, aleatorio,contador=0;
       aleatorio = (int)(Math.random() *100);
       do{
           System.out.println("Digite un número");
           numero = scanner.nextInt();
           
           if(aleatorio > numero){
                System.out.println("Digite un número mayor");
           }else if(aleatorio < numero){
                System.out.println("Digite un número menor");
           }
           contador ++;
       }while(numero != aleatorio);
       
         System.out.println();
       System.out.println("Genial!!");
       System.out.println("Adivinaste después de "+contador+"intentos");
        
         
         System.out.println("Digita el número");
        int numero = scanner.nextInt();
        int contador=0;
        while(numero > 0){
            contador++;
             System.out.println("Se han ingresado "+contador+" números positivos");
             System.out.println("Digita el número");
             numero = scanner.nextInt();
        }
        
         
        System.out.println("Digita el número");
        int numero = scanner.nextInt();
        while(numero != 0){
            if(numero %2 == 0){
                System.out.println("El numero "+numero+" es par");
            }else{
                System.out.println("El numero "+numero+" es impar");
            }
            System.out.println("Digita el número");
            numero = scanner.nextInt();
        }
       
       
        System.out.println("Digita el número");
        int numero = scanner.nextInt();
        while(numero != 0){
            if(numero < 0){
                System.out.println("El numero "+numero+" es negativo");
            }else{
                System.out.println("El numero "+numero+" es positivo");
            }
            System.out.println("Digita el número");
            numero = scanner.nextInt();
        }
        
       
        int numero,cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
       
        while(numero >= 0){
           cuadrado = (int)Math.pow(numero,2);
           JOptionPane.showMessageDialog(null,"El número "+numero+" elevado al cuadrado es "+cuadrado);
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        }
        
        System.out.println("¿Qué calculo desea realizar? (S,R,M,D)");
        char inicialCalculo = scanner.next().charAt(0);
        System.out.println("Digite el primer número");
        float num1 = scanner.nextFloat();
        System.out.println("Digite el segundo número");
         float num2 = scanner.nextFloat();
         
        String operacion;
        float resultado;
        if(Character.toLowerCase(inicialCalculo) == 's'){
            resultado = num1 + num2;
            System.out.println("Resulatdo de la suma es: "+resultado);
        }else if(Character.toLowerCase(inicialCalculo) == 'r'){
             resultado = num1 - num2;
              System.out.println("Resulatdo de la resta es: "+resultado);
        }else if(Character.toLowerCase(inicialCalculo) == 'm'){
             resultado = num1 * num2;
             System.out.println("Resulatdo de la miltiplicación es: "+resultado); 
        }else if(Character.toLowerCase(inicialCalculo) == 'd'){
             resultado = num1 / num2;
              System.out.println("Resulatdo de la división es: "+resultado);
        }else{
            System.out.println("Opción inválida");
        }
        
        
         
        System.out.println("Digite día");
        int día = scanner.nextInt();
        System.out.println("Digite mes");
         int mes = scanner.nextInt();
        System.out.println("Digite año");
         int año = scanner.nextInt();
         
         if(día >0 && día <=30){
             if(mes > 0 && mes <= 12){
                 if(año != 0){
                     System.out.println("Fecha correcta");
                 }else{
                     System.out.println("Año incorrecta");
                 }
             }else{
                 System.out.println("Mes inválido");
             }
         }else{
              System.out.println("Día inválido");
         }
       
        System.out.println("Ingrese el numero uno");
        float num1 = scanner.nextInt();
        System.out.println("Ingrese el numero dos");
         float num2 = scanner.nextInt();
        System.out.println("Ingrese el numero tres");
         float num3 = scanner.nextInt();
         
         if(num1 > num2 && num1 > num3){
             System.out.println(num1);
             if(num2 > num3){
                 System.out.println(num2);
                 System.out.println(num3);
             }else{
                 System.out.println(num3);
                 System.out.println(num2);
             }
         }else if(num2 > num1 && num2 > num3){
             System.out.println(num2);
             if(num1 > num3){
                 System.out.println(num1);
                 System.out.println(num3);
             }else{
                 System.out.println(num3);
                 System.out.println(num1);
             }
         }else{
             System.out.println(num3);
             if(num1 > num2){
                 System.out.println(num1);
                 System.out.println(num2);
             }else{
                  System.out.println(num2);
                 System.out.println(num1);
             }
         }
        
         System.out.println("-----------------------------------------------");
         if(num1 > num2 && num2>num3){
             System.out.println(num1+" "+num2+" "+num3);
         }else if(num1 > num3 && num3>num2){
             System.out.println(num1+" "+num3+" "+num2);
         }else if (num2 > num1 && num1 > num3){
             System.out.println(num2+" "+num1+" "+num3);
         }else if(num2 > num3 && num3 > num1){
             System.out.println(num2+" "+num3+" "+num1);
         }else if(num3 > num1 && num1 > num2){
             System.out.println(num3+" "+num1+" "+num2);
         }else{
             System.out.println(num3+" "+num2+" "+num1);
         }
        
        
         System.out.println("Ingrese el numero de horas");
           float numHorasLaboradas = scanner.nextInt();
           float salario = 0;
        if(numHorasLaboradas <=40){
            salario = numHorasLaboradas * 16;
        }else{
            salario = 40 * 16 +((numHorasLaboradas -40)*20);
        }
        
        System.out.println("Slario es: "+salario);
        
        System.out.println("Ingrese el numero de horas");
        int numHoras = scanner.nextInt();
        int semanas = numHoras / 168;
        int días = (numHoras % 168) / 24;
        int horas = (numHoras % 168)% 24;
        
        System.out.println(numHoras+" equivalen a "+semanas+" semanas "+días+" días y "+horas+" horas");
        
        
        
        
        String cadena;
        cadena = JOptionPane.showInputDialog("This is a string: ");
        JOptionPane.showMessageDialog(null, "Cadena message: "+cadena);
        
        int x=5;
        int y=0;
        
        y = x++; /// El valor de y será 5, y el valor de x aumentará en uno, así que x será 6
      //y   = ++x; // Aqui primero estamos aumentando 1 al valor de x, entoces x será 6; luego estamos diceiendo que y es igual a x, entonces y es igual a 6
        
        // CLass Math
        
        //Sacar ra+iz cuadrada
        double raiz = Math.sqrt(9); //Este solo funciona con double, pero podemos hacer la conversión
        int raiz2 = (int)Math.sqrt(9); // la conversion de double a int, es recomendable dejarlo en double
        
        // elvar un número a cierta potencia
        double base = 5, exponente = 2;
        double resultado = Math.pow(base,exponente);// primero la base, después el exponente. Trabaja solo  con double, pero se puede usar la conversión
        
        // redondear
        double numero = 4.56;
        long resultado2 = Math.round(numero); // puedo pasarlo de double a long o de double a int
        
        // float a entero 
        float num3 = 7.89f;
        int reslt = Math.round(num3);
        
        //random
        double numer = Math.random();
        
        //// Ejercicio
        float guillermo,luis,juan,total;
        System.out.println("¿Cuáto dinero tienes?");
        guillermo = scanner.nextInt();
        
        luis =guillermo/2;
        juan = (guillermo+luis )/2;
        total = guillermo+luis+juan;
        System.out.print(total);
        
        float partcipacion, examen1,examen2,exaFinal, resultadoFinal;
        System.out.println("Nota de participación");
        partcipacion = scanner.nextFloat();
        System.out.println("Nota de examen1");
        examen1 = scanner.nextFloat();
        System.out.println("Nota de examen2");
        examen2 = scanner.nextFloat();
        System.out.println("Nota de exaFinal");
        exaFinal = scanner.nextFloat();
        
        resultadoFinal = (examen1*0.25f)+(partcipacion*0.10f)+(examen2*0.25f)+(exaFinal*0.40f);
        System.out.println("Nota final: "+resultadoFinal);
        
        */
        
        
    }
    
}
