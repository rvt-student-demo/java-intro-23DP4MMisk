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

      //int age = 15;

       // if (age >= 15) {
        // System.out.println("Pilngadigs");
      // } else if (age == 7) {
        // System.out.println("Tu esi pirmklasnieks");
      // }
      
      System.out.println("Value of the gift?");

      int gift = Integer.valueOf(scanner.nextLine());

      double tax1 = (100 + (gift - 5000) * 0.08);
      double tax2 = (1700 + (gift - 25000) * 0.10);
      double tax3 = (4700 + (gift - 55000) * 0.12);
      double tax4 = (22100 + (gift - 200000) * 0.15);
      double tax5 = (142100 + (gift - 1000000) * 0.17);
      
      
      if (gift >= 5000 && gift < 25000) {
        System.out.println("Tax: " + tax1);
      } else if (gift >= 25000 && gift < 55000 ) {
        System.out.println("Tax: " + tax2);
      } else if (gift >= 55000 && gift < 200000) {
        System.out.println("Tax: " + tax3);
      } else if (gift >= 200000 && gift < 1000000) {
        System.out.println("Tax: " + tax4);
      } else if (gift >= 1000000) {
        System.out.println("Tax: " + tax5);
      } else {
        System.out.println("No tax!");
      }

    }
}
