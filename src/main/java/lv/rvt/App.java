package lv.rvt;

import java.io.BufferedReader;
import java.util.*;


public class App  
{ 
  public static void main( String[] args ) throws Exception {
    Scanner scanner = new Scanner(System.in);
   
    List<Integer>Array = new ArrayList<>();
    System.out.println("Ievadi skaitļus");
    
    while(true){
     String input = scanner.nextLine();
     if(input.isEmpty()) {
      break;
     }
     try {
      int number = Integer.parseInt(input);
      Array.add(number);
     } catch (NumberFormatException e) {
      System.out.println("Lūdzu ievadi tikai veselus skaitļus");
     }
     
    }

    Array.sort(Comparator.naturalOrder());
    System.out.println("\nSakartots augoša secība:");
    printTable(Array);

    Array.sort(Comparator.reverseOrder());
    System.out.println("\nSakartots dilstoša seciba:");
    printTable(Array);

    

  }
  
  public static void printTable(List<Integer> Array){
    System.out.println("=================");
    System.out.println("| index | value |");
    System.out.println("=================");
    for(int i = 0; i < Array.size(); i++){
      System.out.printf("| %5d | %5d |\n", i, Array.get(i));
    }
    System.out.println("=================");
  }
}


