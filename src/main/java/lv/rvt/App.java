package lv.rvt;

import java.util.*;

public class App 
{
  
  
  public static void main( String[] args ){
   
    Scanner scanner = new Scanner(System.in);
    printSquare(4);
    
  }
  
  public static void printSquare(int size) {
    for(int i = 0; i < size; i++){
      for(int k = 0; k < size; k++){
        System.out.print("*");
      }
      System.out.println("");

    }

    
  }

    
  

  
} 

