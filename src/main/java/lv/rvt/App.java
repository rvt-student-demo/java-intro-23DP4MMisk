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

    int num = Integer.valueOf(scanner.nextLine());
    int end = 100;

    for(int i = num; i <= end; i++) {
      System.out.println(i);
    }
  
  
  }

      

}  

