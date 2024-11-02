package lv.rvt;

import java.util.*;

public class App  
{ 
   public static void main( String[] args ){
    Scanner scanner = new Scanner(System.in);
    double sum = 0.0; 
    int count = 0;
    String longestName = "";
     
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("")) {
        break;
      }

      String [] parts = input.split((","));
      sum = sum + Integer.valueOf(parts[1]);
      String name = parts[0];
      count = count + 1;
      
      if (name.length() > longestName.length()) {
        longestName = name;
      }
    
    }
    
    System.out.println("Longest name: " + longestName);
    System.out.println("Average of the birth years: " + (sum / count));
    
    
  }
  
} 

