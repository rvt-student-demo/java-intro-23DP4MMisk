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

      while (true) {
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        
        if (number > 0) {
          System.out.println(number * number);
        }
        if (number < 0) {
          System.out.println("Unsuitable number");
        }
        if (number == 0) {
          break;
        }
      }
      

    }
}
