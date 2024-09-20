package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        // Kods

        // Ctrl + /
        System.out.println("Hello world");
        Scanner scanner = new Scanner(System.in);

       // String valueAsString = "42";
       // int value = Integer.valueOf(valueAsString);

        // System.out.println(value + 20);

       // int userInput = Integer.valueOf(scanner.nextLine());
        // System.out.println(userInput);

        // Saņemam no lietotaja string vērtību
       // String text = scanner.nextLine();
        // Saņemam no lietotaja int vērtību
        // int integer = Integer.valueOf(scanner.nextLine());
        // Saņemam no lietotaja dooble vērtību
       // double floatingPoint = Double.valueOf(scanner.nextLine());
        // Saņema  no lietotaja boolean vērtību
       // boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());

        System.out.println("Give the first number:");
        int userInput1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int userInput2 = Integer.valueOf(scanner.nextLine());
       

        int result1 = userInput1 + userInput2;
        System.out.println(userInput1 + " + " + userInput2 + " = " +result1);

        int result2 = userInput1 - userInput2;
        System.out.println(userInput1 + " - " + userInput2 + " = " + result2);

        int result3 = userInput1 * userInput2;
        System.out.println(userInput1 + " * " + userInput2 + " = " + result3);

        double result4 = userInput1 / userInput2;
        System.out.println(userInput1 + " / " + userInput2 + " = " + result4);

    }
}
