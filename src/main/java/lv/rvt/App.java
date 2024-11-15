package lv.rvt;

import java.util.*;

public class App  
{ 
   public static void main( String[] args ){
    Scanner scanner = new Scanner(System.in);
    
    stastistic statistics = new stastistic();
    stastistic stastistic2 = new stastistic();
    System.out.println("Enter numbers: ");
    while(true){
      int number = Integer.valueOf(scanner.nextLine());
      if(number == -1){
        break;
      }
      stastistic2.addNumber(number);
    }
    
    
    
    System.out.println();
    statistics.addNumber(3);
    statistics.addNumber(5);
    statistics.addNumber(1);
    statistics.addNumber(2);
    System.out.println("Count: " + statistics.getCount());
    System.out.println("Sum: " + statistics.sum());
    System.out.println("Average: " + statistics.average());
    System.out.println();
    System.out.println("Sum: " + stastistic2.sum());
    System.out.println("Sum of even numbers: " + stastistic2.even());
    System.out.println("Sum of odd numbers: " +  stastistic2.odd());



  }
  
} 

