import java.util.Arrays;
import java.util.Date;
import java.awt.*;

public class HelloWorld{
    public static void main(String[] args){

        // byte age = 30;
        // long viewsCount = 3_123_456_789L;
        // float price = 10.99F;
        // char letter = 'A';
        // boolean isEligible = true;

        // Point point1 = new Point(1,1);
        // Point point2 = point1;
        // point1.x = 2;

        // System.out.println(point2);

        // Date now = new Date();
        // System.out.println(now);
        // System.out.println(age);

        // String message = new String("Hello World");
        // Same as
        // String message2 = "      Hello World     Again       ";
        // System.out.println(message.replace("World", "Dunia") + " " + message2);
        // Original String is not changed because in Java Strings are Immutable
        // System.out.println(message);
        // System.out.println(message2.trim());    // Trims unwanted spaces before and after the string
        // System.out.println(message2.length());

        int[] numbers = new int[5];
        int[] numbers2 = {3,4,5,1,5};
        Arrays.sort(numbers2);
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(numbers2);
        System.out.println(Arrays.toString(numbers2));  

        int[][] numbers3 = new int[2][3];
        System.out.println(Arrays.deepToString(numbers3));

        // Implicit Casting
        // byte > short > int > long > float > double

        // String to Any of the primitive types : Integer.parseInt("string") or Datatype.parseDatatype("string");

        

    }
}