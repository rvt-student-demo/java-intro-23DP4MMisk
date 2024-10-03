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
    int skaits = 0;
    int summ = 0;
   

    while (true) {
      
      System.out.println("Give a number");
      int number = Integer.valueOf(scanner.nextLine());

      if (number == 0) {
       break;
      }
     
      if (number > 0) {
       skaits = skaits + 1;
       summ = summ + number;
      }
   
      if (number < 0) {
       skaits = skaits + 1;
       summ = summ + number;
      } 

    
     
    }
    
    if (skaits != 0) {
     
      System.out.println("Number of numbers: " + skaits);
      System.out.println("Sum of the numbers: " + summ);
    }
   
  }

      

}  

