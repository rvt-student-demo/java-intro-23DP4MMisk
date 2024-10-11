package lv.rvt;

import java.util.*;

public class App 
{
  public static void main( String[] args )
  {
    // Kods

    // Ctrl + /
   // System.out.println("Hello world");
    Scanner scanner = new Scanner(System.in);
   // System.out.print("Give a number: " );
    
    //int num = Integer.valueOf(scanner.nextLine());
    //int factorial = 1;
    //for (int i = 1; i <= num; i++){
    //  factorial *= i;
    //}
    
    //System.out.println("Factorial: " + factorial);

    System.out.println("How many times? ");
    int num = Integer.valueOf(scanner.nextLine());
    int sk = 0;
    for(sk = 0; sk < num; sk++) {
      printText();
    }
   

  }

  public static void printText() {
    System.out.println("In a hole in the ground there lived a method");
  }

}  

