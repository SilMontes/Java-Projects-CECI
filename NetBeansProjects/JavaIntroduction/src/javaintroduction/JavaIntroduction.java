
package javaintroduction;

// To use Data
import java.util.Date;
// To use Point
import java.awt.*;

public class JavaIntroduction {

    public static void main(String[] args) {
        int age = 30; //int = type of data  age = name or identifier (using camelCase) 30 = initial value of the variable
        System.out.println("Hola");
        System.out.println(age);
        age = 35;
        // We can declare several variables in the same line by using comas
        int myage = 30, temperature = 20;
        
        int myAge = 19;
        int herAge = myAge;
        
        // Primitive Types of data
        byte newAge = 30;
        int viewsCount = 123_456_789; // we can use underscore for making it more readable
        long newViewsCount = 3_123_456_789L; //We use L to help Java to recognize this larger number
        double price = 10.88;
        float newPrice = 10.88F; //As Java see it as a double type of data, we add F to help it.
        // char represents a single character
        char letter = 'A'; // Single characters must be surrounded whit single quotes, but multiple characters must be surrounded with double quotes.
        boolean isEligible = true;
        
       // Reference Types of data
        Date now = new Date();
        //System.out.println(now);
        
        byte x = 2;
        byte y = x;
        x=9;
        System.out.println(y); // As we could se when printing y, the variables x and y are completly independennt of each other, but whwn we use Reference Types of Dta, this behavior is different.
        
        Point point1 = new Point( x=1, y=1);
        Point point2 = point1; //Reference data does not store values, they store a reference to an object somewhere in the memory; so thgey are not independent
        point1.x = 2;
        System.out.println(point2);
        
        String message = "Hello you there!"+"!";
        System.out.println(message.endsWith("!!"));// true or false
         System.out.println(message.startsWith("ñ"));
          System.out.println(message.length());
           System.out.println(message.indexOf("ere"));// it returns the index of the first ocurrence of the character or the string that we pass. The index count starts from 0. If the string does not exists, we get 1.
        System.out.println(message);
         System.out.println(message.replace("!!", "!")); //These does not modify our original string. In Java, strings are inmutable, we cannot change them.
         
         // Parameters: they are the holes that we define in our methods Ex: target or replacement
         // Arguments: they are the actual values that we pass to a method Ex: the values of target and replacement
        
        String newMessage = "  Helloooo you there!"+"!   ";
        System.out.println(newMessage);
        System.out.println(newMessage.trim()); // With this, we can get rid of extra white spaces that can be at the beginning or the end of a string, in other words, unnecessary spaces.
    }
    
}
